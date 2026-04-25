import java.util.HashSet;
import java.util.Stack;
import java.util.HashMap;
import java.util.Stack;

enum VarType { INT, REAL, FLOAT, BOOL, STRING }
public class LLVMActions extends LangXBaseListener {
   private static class Value{
      String name; 
      VarType type;
      Value(String n, VarType t){name=n; type=t;}
   }
    Stack<Value> stack=new Stack<>();
    HashSet<String> globalnames = new HashSet<String>();
    HashSet<String> functions = new HashSet<String>();
    HashSet<String> localnames = new HashSet<String>(); 
    HashMap<String, VarType> globalTypes = new HashMap<String, VarType>();
    HashMap<String, VarType> localTypes  = new HashMap<String, VarType>();
    VarType valueType;
    String value, function;
    Boolean global;

    @Override 
    public void enterProg(LangXParser.ProgContext ctx) { 
       global = true;
    }

    @Override 
    public void exitProg(LangXParser.ProgContext ctx) { 
       LLVMGenerator.close_main();
       System.out.println( LLVMGenerator.generate() );
    }

    /*@Override 
    public void exitFparam(LangXParser.FparamContext ctx) {
       String ID = ctx.ID().getText();
       functions.add(ID); 
       function = ID;
       LLVMGenerator.functionstart(ID);
    }
   
    @Override
    public void enterFblock(LangXParser.FblockContext ctx) {
       global = false;
    }

    @Override
    public void exitFblock(LangXParser.FblockContext ctx) {
       if( ! localnames.contains(function) ){
         LLVMGenerator.assign(set_variable(function, VarType.INT), "0");
       }
       LLVMGenerator.load( "%"+function );
       LLVMGenerator.functionend();
       localnames = new HashSet<String>();
       global = true;
    }
*/
    @Override
    public void exitAssign(LangXParser.AssignContext ctx) { 
      String ID = ctx.ID().getText();
      Value v = stack.pop();
      String fullId = set_variable(ID, v.type);
      if      (v.type == VarType.INT)   LLVMGenerator.assign(fullId, v.name);
      else if (v.type == VarType.REAL)  LLVMGenerator.assign_double(fullId, v.name);
      else if (v.type == VarType.FLOAT) LLVMGenerator.assign_float(fullId, v.name);
      else if (v.type == VarType.STRING) LLVMGenerator.assign_string(fullId, v.name);
      else                              LLVMGenerator.assign_bool(fullId, v.name);
   }

    @Override 
    public void exitValue(LangXParser.ValueContext ctx) { 
      if( ctx.ID() != null ){
         String ID = ctx.ID().getText();
         if( localnames.contains(ID) ) {
               VarType t = localTypes.get(ID);
               if      (t == VarType.INT)   LLVMGenerator.load("%"+ID);
               else if (t == VarType.REAL)  LLVMGenerator.load_double("%"+ID);
               else if (t == VarType.FLOAT) LLVMGenerator.load_float("%"+ID);
               else if (t == VarType.STRING) LLVMGenerator.load_string("%"+ID);
               else                         LLVMGenerator.load_bool("%"+ID);
               valueType = t;
         } else if( globalnames.contains(ID) ) {
               VarType t = globalTypes.get(ID);
               if      (t == VarType.INT)   LLVMGenerator.load("@"+ID);
               else if (t == VarType.REAL)  LLVMGenerator.load_double("@"+ID);
               else if (t == VarType.FLOAT) LLVMGenerator.load_float("@"+ID);
               else if (t == VarType.STRING) LLVMGenerator.load_string("@"+ID);
               else                         LLVMGenerator.load_bool("@"+ID);
               valueType = t;
         } else {
               error(ctx.getStart().getLine(), "Unknown "+ID);
         }
         value = "%"+(LLVMGenerator.tmp-1); 
      } 

      if( ctx.INT() != null ){
         value = ctx.INT().getText();
         valueType = VarType.INT;
      } 

      if( ctx.REAL() != null ){
         double d = Double.parseDouble(ctx.REAL().getText());
         value = String.format("0x%016X", Double.doubleToLongBits(d));
         valueType = VarType.REAL;
      }
      if( ctx.FLOAT() != null ){
         String lit = ctx.FLOAT().getText();
         String numStr = lit.substring(0, lit.length()-1);  // odetnij sufiks 'f'
         float f = Float.parseFloat(numStr);
         double d = (double) f;
         value = String.format("0x%016X", Double.doubleToLongBits(d));
         valueType = VarType.FLOAT;
      }
      if( ctx.TRUE() != null ){
         value = "1";
         valueType = VarType.BOOL;
      }
      if( ctx.FALSE() != null ){
         value = "0";
         valueType = VarType.BOOL;
      }
      if( ctx.STRING() != null ){
         String raw = ctx.STRING().getText();
         String inner = raw.substring(1, raw.length() - 1);
         value = LLVMGenerator.defineStringLiteral(inner);
         valueType = VarType.STRING;
      }
      stack.push(new Value(value, valueType));
   }

   @Override 
   public void exitAdd(LangXParser.AddContext ctx) {
      Value right = stack.pop();
      Value left  = stack.pop();
      if( left.type == VarType.STRING || right.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "operacja '+' nie obsluguje typu string");
      }
      if( left.type != right.type ){
         error(ctx.getStart().getLine(), "niezgodnosc typow w '+'");
      }
      if      ( left.type == VarType.INT   ) LLVMGenerator.add(left.name, right.name);
      else if ( left.type == VarType.REAL  ) LLVMGenerator.add_double(left.name, right.name);
      else if ( left.type == VarType.FLOAT ) LLVMGenerator.add_float(left.name, right.name);
      else error(ctx.getStart().getLine(), "operacja '+' nie obsluguje typu bool");
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), left.type));
   }

  @Override 
   public void exitSub(LangXParser.SubContext ctx) {
      Value right = stack.pop();
      Value left  = stack.pop();
      if( left.type == VarType.STRING || right.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "operacja '-' nie obsluguje typu string");
      }
      if( left.type != right.type ){
         error(ctx.getStart().getLine(), "niezgodnosc typow w '-'");
      }
      if      ( left.type == VarType.INT   ) LLVMGenerator.sub(left.name, right.name);
      else if ( left.type == VarType.REAL  ) LLVMGenerator.sub_double(left.name, right.name);
      else if ( left.type == VarType.FLOAT ) LLVMGenerator.sub_float(left.name, right.name);
      else error(ctx.getStart().getLine(), "operacja '-' nie obsluguje typu bool");
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), left.type));
   }

   @Override 
   public void exitMul(LangXParser.MulContext ctx) {
      Value right = stack.pop();
      Value left  = stack.pop();
      if( left.type == VarType.STRING || right.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "operacja '*' nie obsluguje typu string");
      }
      if( left.type != right.type ){
         error(ctx.getStart().getLine(), "niezgodnosc typow w '*'");
      }
      if      ( left.type == VarType.INT   ) LLVMGenerator.mul(left.name, right.name);
      else if ( left.type == VarType.REAL  ) LLVMGenerator.mul_double(left.name, right.name);
      else if ( left.type == VarType.FLOAT ) LLVMGenerator.mul_float(left.name, right.name);
      else error(ctx.getStart().getLine(), "operacja '*' nie obsluguje typu bool");
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), left.type));
   }

  @Override 
   public void exitDiv(LangXParser.DivContext ctx) {
      Value right = stack.pop();
      Value left  = stack.pop();
      if( left.type == VarType.STRING || right.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "operacja '/' nie obsluguje typu string");
      }
      if( left.type != right.type ){
         error(ctx.getStart().getLine(), "niezgodnosc typow w '/'");
      }
      if      ( left.type == VarType.INT   ) LLVMGenerator.div(left.name, right.name);
      else if ( left.type == VarType.REAL  ) LLVMGenerator.div_double(left.name, right.name);
      else if ( left.type == VarType.FLOAT ) LLVMGenerator.div_float(left.name, right.name);
      else error(ctx.getStart().getLine(), "operacja '/' nie obsluguje typu bool");
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), left.type));
   }
   @Override 
   public void exitAnd(LangXParser.AndContext ctx) {
      Value right = stack.pop();
      Value left  = stack.pop();
      if( left.type == VarType.STRING || right.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "'and' nie obsluguje typu string");
      }
      if( left.type != VarType.BOOL || right.type != VarType.BOOL ){
         error(ctx.getStart().getLine(), "'and' wymaga typu bool");
      }
      LLVMGenerator.and_bool(left.name, right.name);
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), VarType.BOOL));
   }

   @Override 
   public void exitOr(LangXParser.OrContext ctx) {
      Value right = stack.pop();
      Value left  = stack.pop();
      if( left.type == VarType.STRING || right.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "'or' nie obsluguje typu string");
      }
      if( left.type != VarType.BOOL || right.type != VarType.BOOL ){
         error(ctx.getStart().getLine(), "'or' wymaga typu bool");
      }
      LLVMGenerator.or_bool(left.name, right.name);
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), VarType.BOOL));
   }

   @Override 
   public void exitXor(LangXParser.XorContext ctx) {
      Value right = stack.pop();
      Value left  = stack.pop();
      if( left.type == VarType.STRING || right.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "'xor' nie obsluguje typu string");
      }
      if( left.type != VarType.BOOL || right.type != VarType.BOOL ){
         error(ctx.getStart().getLine(), "'xor' wymaga typu bool");
      }
      LLVMGenerator.xor_bool(left.name, right.name);
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), VarType.BOOL));
   }

   @Override 
   public void exitNeg(LangXParser.NegContext ctx) {
      Value v = stack.pop();
      if( v.type == VarType.STRING ){
         error(ctx.getStart().getLine(), "'not' nie obsluguje typu string");
      }
      if( v.type != VarType.BOOL ){
         error(ctx.getStart().getLine(), "'not' wymaga typu bool");
      }
      LLVMGenerator.neg_bool(v.name);
      stack.push(new Value("%"+(LLVMGenerator.tmp-1), VarType.BOOL));
   }



    @Override
   public void exitWrite(LangXParser.WriteContext ctx) {
      String id = ctx.ID().getText();
      VarType type = globalTypes.get(id);
      if( type == VarType.INT ){
         LLVMGenerator.load("@"+id);
         LLVMGenerator.printf("%"+(LLVMGenerator.tmp-1));
      } else if( type == VarType.REAL ) {
         LLVMGenerator.load_double("@"+id);
         LLVMGenerator.printf_double("%"+(LLVMGenerator.tmp-1));
      } else if( type == VarType.FLOAT ) {
         LLVMGenerator.load_float("@"+id);
         LLVMGenerator.printf_float("%"+(LLVMGenerator.tmp-1));
      } else if( type == VarType.STRING ) {
         LLVMGenerator.load_string("@"+id);
         LLVMGenerator.printf_string("%"+(LLVMGenerator.tmp-1));
      } else {
         LLVMGenerator.load_bool("@"+id);
         LLVMGenerator.printf_bool("%"+(LLVMGenerator.tmp-1));
      }
   }
/*
    @Override
    public void exitCall(LangXParser.CallContext ctx) {
       LLVMGenerator.call(ctx.ID().getText());
    } 
*/

    @Override
   public void exitRead(LangXParser.ReadContext ctx) {
      String id = ctx.ID().getText();
      VarType type = globalTypes.get(id);
      if      ( type == VarType.INT  )  LLVMGenerator.scanf("@"+id);
      else if ( type == VarType.REAL )  LLVMGenerator.scanf_double("@"+id);
      else if ( type == VarType.FLOAT ) LLVMGenerator.scanf_float("@"+id);
      else if ( type == VarType.STRING ) error(ctx.getStart().getLine(), "read nie obsluguje typu string");
      else error(ctx.getStart().getLine(), "read nie obsluguje typu bool");
   }
  
    public String set_variable(String ID, VarType type){
    String id;
    if( global ){
        if( ! globalnames.contains(ID) ) {
            globalnames.add(ID);
            globalTypes.put(ID, type);
            if      (type == VarType.INT)   LLVMGenerator.declare(ID, true);
            else if (type == VarType.REAL)  LLVMGenerator.declare_double(ID, true);
            else if (type == VarType.FLOAT) LLVMGenerator.declare_float(ID, true);
            else if (type == VarType.STRING) LLVMGenerator.declare_string(ID, true);
            else                            LLVMGenerator.declare_bool(ID, true);
        }
        id = "@"+ID; 
    } else {
        if( ! localnames.contains(ID) ) {
            localnames.add(ID);
            localTypes.put(ID, type);
            if      (type == VarType.INT)   LLVMGenerator.declare(ID, false);
            else if (type == VarType.REAL)  LLVMGenerator.declare_double(ID, false);
            else if (type == VarType.FLOAT) LLVMGenerator.declare_float(ID, false);
            else if (type == VarType.STRING) LLVMGenerator.declare_string(ID, false);
            else                            LLVMGenerator.declare_bool(ID, false);
        }
        id = "%"+ID; 
    }
    return id;
   }

    void error(int line, String msg){
       System.err.println("Error! Line "+line+", "+msg);
       System.exit(1);
   } 

}
