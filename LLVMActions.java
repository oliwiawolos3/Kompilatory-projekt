import java.util.HashSet;
import java.util.Stack;
import java.util.HashMap;

enum VarType { INT, REAL }
public class LLVMActions extends LangXBaseListener {

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
      String fullId = set_variable(ID, valueType);
      if (valueType == VarType.INT) LLVMGenerator.assign(fullId, value);
      else                          LLVMGenerator.assign_double(fullId, value);
   }

    @Override 
    public void exitValue(LangXParser.ValueContext ctx) { 
      if( ctx.ID() != null ){
         String ID = ctx.ID().getText();
         if( localnames.contains(ID) ) {
               VarType t = localTypes.get(ID);
               if (t == VarType.INT) LLVMGenerator.load("%"+ID);
               else                  LLVMGenerator.load_double("%"+ID);
               valueType = t;
         } else if( globalnames.contains(ID) ) {
               VarType t = globalTypes.get(ID);
               if (t == VarType.INT) LLVMGenerator.load("@"+ID);
               else                  LLVMGenerator.load_double("@"+ID);
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
   }



    @Override
    public void exitWrite(LangXParser.WriteContext ctx) {
      String id = ctx.ID().getText();
      VarType type = globalTypes.get(id);
      if( type == VarType.INT ){
         LLVMGenerator.load("@"+id);
         LLVMGenerator.printf("%"+(LLVMGenerator.tmp-1));
      } else {
         LLVMGenerator.load_double("@"+id);
         LLVMGenerator.printf_double("%"+(LLVMGenerator.tmp-1));
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
      if( type == VarType.INT ) LLVMGenerator.scanf("@"+id);
      else                       LLVMGenerator.scanf_double("@"+id);
    } 
  
    public String set_variable(String ID, VarType type){
    String id;
    if( global ){
        if( ! globalnames.contains(ID) ) {
            globalnames.add(ID);
            globalTypes.put(ID, type);
            if (type == VarType.INT) LLVMGenerator.declare(ID, true);
            else                     LLVMGenerator.declare_double(ID, true);
        }
        id = "@"+ID; 
    } else {
        if( ! localnames.contains(ID) ) {
            localnames.add(ID);
            localTypes.put(ID, type);
            if (type == VarType.INT) LLVMGenerator.declare(ID, false);
            else                     LLVMGenerator.declare_double(ID, false);
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
