import java.util.HashSet;
import java.util.Stack;
import java.util.HashMap;
import java.util.List;

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
    HashMap<String, Integer> arraySizes = new HashMap<String, Integer>();
    HashMap<String, Integer> arrayMatrixCols = new HashMap<String, Integer>();
    VarType valueType;
    String value, function;
    Boolean global;

   private static boolean isArrayInWriteArg(LangXParser.ArrayContext ctx) {
      return ctx.getParent() instanceof LangXParser.WriteArgContext
         && ctx.getParent().getParent() instanceof LangXParser.WriteContext;
   }

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
         LLVMGenerator.assign(set_variable(function, VarType.INT, 0), "0");
       }
       LLVMGenerator.load( "%"+function );
       LLVMGenerator.functionend();
       localnames = new HashSet<String>();
       global = true;
    }
*/
    @Override
    public void exitArrayDecl(LangXParser.ArrayDeclContext ctx) {
      String ID = ctx.ID().getText();
      int n = ctx.INT().size();
      if (n == 0) {
         error(ctx.getStart().getLine(), "brak rozmiaru tablicy");
      }
      if (n > 2) {
         error(ctx.getStart().getLine(), "obslugiwane sa co najwyzej 2 wymiary tablicy");
      }
      int size = 1;
      int d0 = 0, d1 = 0;
      for (int i = 0; i < n; i++) {
         int d = Integer.parseInt(ctx.INT(i).getText());
         if (d <= 0) {
            error(ctx.getStart().getLine(), "rozmiar tablicy musi byc dodatni");
         }
         if (i == 0) d0 = d;
         if (i == 1) d1 = d;
         size *= d;
      }
      if (arraySizes.containsKey(ID) || globalnames.contains(ID)) {
         error(ctx.getStart().getLine(), "identyfikator "+ID+" jest juz zajety");
      }
      arraySizes.put(ID, Integer.valueOf(size));
      if (n == 2) {
         arrayMatrixCols.put(ID, Integer.valueOf(d1));
      } else {
         arrayMatrixCols.remove(ID);
      }
      LLVMGenerator.declare_array_int(ID, size, global);
   }
    @Override
    public void exitArrayAssing(LangXParser.ArrayAssingContext ctx) {
      String ID = ctx.ID().getText();
      if (!arraySizes.containsKey(ID)) {
         error(ctx.getStart().getLine(), ID+" nie jest tablica");
      }
      List<LangXParser.ExprContext> es = ctx.expr();
      int k = es.size();
      if (k < 2) {
         error(ctx.getStart().getLine(), "oczekiwano co najmniej jednego indeksu i wartosci po '='");
      }
      Value rhs = stack.pop();
      int nIdx = k - 1;
      Value[] idx = new Value[nIdx];
      for (int i = nIdx - 1; i >= 0; i--) {
         idx[i] = stack.pop();
      }
      for (int i = 0; i < nIdx; i++) {
         if (idx[i].type != VarType.INT) {
            error(ctx.getStart().getLine(), "indeks tablicy musi byc int");
         }
      }
      if (rhs.type != VarType.INT) {
         error(ctx.getStart().getLine(), "do tablicy int mozna przypisac tylko int");
      }
      int total = arraySizes.get(ID).intValue();
      if (nIdx == 1) {
         String ptr = LLVMGenerator.gep_array_int_elem(ID, total, idx[0].name, global);
         LLVMGenerator.store_int_to_ptr(ptr, rhs.name);
         return;
      }
      if (nIdx == 2) {
         Integer colsObj = arrayMatrixCols.get(ID);
         if (colsObj == null) {
            error(ctx.getStart().getLine(), "dwa indeksy wymagaja deklaracji macierzy 2D, np. "+ID+"[wiersze,kolumny]");
         }
         int cols = colsObj.intValue();
         LLVMGenerator.mul(idx[0].name, String.valueOf(cols));
         String base = "%" + (LLVMGenerator.tmp - 1);
         LLVMGenerator.add(base, idx[1].name);
         String flat = "%" + (LLVMGenerator.tmp - 1);
         String ptr = LLVMGenerator.gep_array_int_elem(ID, total, flat, global);
         LLVMGenerator.store_int_to_ptr(ptr, rhs.name);
         return;
      }
      error(ctx.getStart().getLine(), "obslugiwane sa co najwyzej 2 indeksy w przypisaniu do tablicy");
   }

    @Override
    public void exitAssignElem(LangXParser.AssignElemContext ctx) {
      String ID = ctx.ID().getText();
      if (!arraySizes.containsKey(ID)) {
         error(ctx.getStart().getLine(), ID+" nie jest tablica (zadeklaruj: "+ID+"[rozmiar] lub "+ID+"[wiersze, kolumny])");
      }
      Value rhs = stack.pop();
      Value idx = stack.pop();
      if (idx.type != VarType.INT) {
         error(ctx.getStart().getLine(), "indeks tablicy musi byc int");
      }
      if (rhs.type != VarType.INT) {
         error(ctx.getStart().getLine(), "do tablicy int mozna przypisac tylko int");
      }
      int sz = arraySizes.get(ID).intValue();
      String ptr = LLVMGenerator.gep_array_int_elem(ID, sz, idx.name, global);
      LLVMGenerator.store_int_to_ptr(ptr, rhs.name);
   }

    @Override
    public void exitReadElem(LangXParser.ReadElemContext ctx) {
      String ID = ctx.ID().getText();
      if (!arraySizes.containsKey(ID)) {
         error(ctx.getStart().getLine(), "read z indeksem wymaga tablicy");
      }
      Value idx = stack.pop();
      if (idx.type != VarType.INT) {
         error(ctx.getStart().getLine(), "indeks tablicy musi byc int");
      }
      int sz = arraySizes.get(ID).intValue();
      String ptr = LLVMGenerator.gep_array_int_elem(ID, sz, idx.name, global);
      LLVMGenerator.scanf_int_ptr(ptr);
   }

    @Override
    public void exitAssign(LangXParser.AssignContext ctx) { 
      String ID = ctx.ID().getText();
      if (arraySizes.containsKey(ID)) {
         error(ctx.getStart().getLine(), "tablice zapisuje sie jako "+ID+"[indeks] = wyrazenie");
      }
      Value v = stack.pop();
      String fullId = set_variable(ID, v.type, ctx.getStart().getLine());
      if      (v.type == VarType.INT)   LLVMGenerator.assign(fullId, v.name);
      else if (v.type == VarType.REAL)  LLVMGenerator.assign_double(fullId, v.name);
      else if (v.type == VarType.FLOAT) LLVMGenerator.assign_float(fullId, v.name);
      else if (v.type == VarType.STRING) LLVMGenerator.assign_string(fullId, v.name);
      else                              LLVMGenerator.assign_bool(fullId, v.name);
   }

    @Override 
    public void exitValue(LangXParser.ValueContext ctx) { 
      if (ctx.array() != null) {
         return;
      }
      if( ctx.ID() != null ){
         String ID = ctx.ID().getText();
         if( ctx.LBR() != null ) {
               if( ! arraySizes.containsKey(ID) ){
                  error(ctx.getStart().getLine(), "indeksowanie: "+ID+" nie jest tablica");
               }
               Value idx = stack.pop();
               if( idx.type != VarType.INT ){
                  error(ctx.getStart().getLine(), "indeks tablicy musi byc int");
               }
               int sz = arraySizes.get(ID).intValue();
               String ptr = LLVMGenerator.gep_array_int_elem(ID, sz, idx.name, global);
               LLVMGenerator.load_int_from_ptr(ptr);
               valueType = VarType.INT;
               value = "%"+(LLVMGenerator.tmp-1);
               stack.push(new Value(value, valueType));
               return;
         }
         if( arraySizes.containsKey(ID) ){
               error(ctx.getStart().getLine(), "tablica "+ID+" wymaga indeksu [...] albo uzyj write "+ID);
         }
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
      LangXParser.WriteArgContext wa = ctx.writeArg();
      if (wa.array() != null) {
         LangXParser.ArrayContext ar = wa.array();
         String id = ar.ID().getText();
         if (!arraySizes.containsKey(id)) {
            error(ctx.getStart().getLine(), id+" nie jest tablica");
         }
         int total = arraySizes.get(id).intValue();
         List<LangXParser.IndexItemContext> items = ar.indexItem();
         Integer colsObj = arrayMatrixCols.get(id);
         if (colsObj == null) {
            if (items.size() == 1 && items.get(0).COLON() != null) {
               LLVMGenerator.printf_array_int(id, total, global);
               return;
            }
            error(ctx.getStart().getLine(), "dla tablicy 1D: write "+id+" lub write "+id+"[:] (przekroje wiersza/kolumny sa tylko dla macierzy 2D)");
         }
         int cols = colsObj.intValue();
         int rows = total / cols;
         if (items.size() != 2) {
            error(ctx.getStart().getLine(), "write z tablica: podaj dwa indeksy (np. wiersz,: albo :,kolumna)");
         }
         boolean colon0 = items.get(0).COLON() != null;
         boolean colon1 = items.get(1).COLON() != null;
         if (!colon0 && colon1) {
            Value rowIdx = stack.pop();
            if (rowIdx.type != VarType.INT) {
               error(ctx.getStart().getLine(), "indeks wiersza musi byc int");
            }
            LLVMGenerator.printf_matrix_row(id, rows, cols, total, rowIdx.name, global);
            return;
         }
         if (colon0 && !colon1) {
            Value colIdx = stack.pop();
            if (colIdx.type != VarType.INT) {
               error(ctx.getStart().getLine(), "indeks kolumny musi byc int");
            }
            LLVMGenerator.printf_matrix_col(id, rows, cols, total, colIdx.name, global);
            return;
         }
         error(ctx.getStart().getLine(), "write: uzyj dokladnie jednego ':' (np. m[0,:] lub m[:,2])");
      }
      String id = wa.ID().getText();
      if( arraySizes.containsKey(id) ){
         Integer mcols = arrayMatrixCols.get(id);
         int total = arraySizes.get(id).intValue();
         if (mcols != null) {
            int c = mcols.intValue();
            int r = total / c;
            LLVMGenerator.printf_array_matrix2d(id, r, c, total, global);
         } else {
            LLVMGenerator.printf_array_int(id, total, global);
         }
         return;
      }
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
      if( arraySizes.containsKey(id) ){
         error(ctx.getStart().getLine(), "dla tablicy uzyj: read "+id+"[indeks]");
      }
      VarType type = globalTypes.get(id);
      if      ( type == VarType.INT  )  { LLVMGenerator.read_cli_prompt(id); LLVMGenerator.scanf("@"+id); }
      else if ( type == VarType.REAL )  { LLVMGenerator.read_cli_prompt(id); LLVMGenerator.scanf_double("@"+id); }
      else if ( type == VarType.FLOAT ) { LLVMGenerator.read_cli_prompt(id); LLVMGenerator.scanf_float("@"+id); }
      else if ( type == VarType.STRING ) {
         boolean isGlobal = !localnames.contains(id);
         LLVMGenerator.read_string(id, isGlobal);
      }
      else error(ctx.getStart().getLine(), "read nie obsluguje typu bool");
   }
  
    public String set_variable(String ID, VarType type, int line){
    if (arraySizes.containsKey(ID)) {
       error(line, "nazwa "+ID+" jest tablica");
    }
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
