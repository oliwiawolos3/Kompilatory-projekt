import java.nio.charset.StandardCharsets;

class LLVMGenerator{
   
   static String header_text = "";
   static String main_text = "";
   static int main_tmp = 1;
   static String buffer = "";
   static int tmp = 1;
   static int strLitCounter = 0;

   static void functionstart(String id){
      main_text += buffer;
      main_tmp = tmp;
      buffer = "define i32 @"+id+"() nounwind {\n";
      tmp = 1;
   }

   static void functionend(){
      buffer += "ret i32 %"+(tmp-1)+"\n"; 
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      tmp = main_tmp;
   }

   static void scanf(String id){
      buffer += "%"+tmp+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* "+id+")\n";
      tmp++;      
   }

   /** Skanowanie do dowolnego wskaźnika i32* (np. komórka tablicy). */
   static void scanf_int_ptr(String ptr){
      buffer += "%"+tmp+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* "+ptr+")\n";
      tmp++;
   }


   static void printf(String id){
      buffer += "%"+tmp+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 "+id+")\n";
      tmp++;
   }
   static void scanf_double(String id){
      buffer += "%"+tmp+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* "+id+")\n";
      tmp++;      
   }

   static void printf_double(String id){
      buffer += "%"+tmp+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double "+id+")\n";
      tmp++;
   }
   static void printf_bool(String id){
      buffer += "%"+tmp+" = zext i1 "+id+" to i32\n";
      tmp++;
      buffer += "%"+tmp+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %"+(tmp-1)+")\n";
      tmp++;
   }

   static void declare(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i32 0\n";
      } else {
	 buffer += "%"+id+" = alloca i32\n";
      }
   }

   static void declare_array_int(String id, int size, Boolean global){
      if( global ){
         header_text += "@"+id+" = global ["+size+" x i32] zeroinitializer\n";
      } else {
         buffer += "%"+id+" = alloca ["+size+" x i32]\n";
      }
   }

   /** Zwraca nazwę rejestru i32* (element tablicy). */
   static String gep_array_int_elem(String id, int size, String idxReg, Boolean global){
      String prefix = global ? "@" : "%";
      buffer += "%"+tmp+" = getelementptr inbounds ["+size+" x i32], ["+size+" x i32]* "+prefix+id+", i32 0, i32 "+idxReg+"\n";
      tmp++;
      return "%"+(tmp-1);
   }

   static void store_int_to_ptr(String ptrReg, String valueReg){
      buffer += "store i32 "+valueReg+", i32* "+ptrReg+"\n";
   }

   static void load_int_from_ptr(String ptrReg){
      buffer += "%"+tmp+" = load i32, i32* "+ptrReg+"\n";
      tmp++;
   }

   /** Wypisuje wszystkie elementy (każdy w osobnej linii, jak write dla int). */
   static void printf_array_int(String id, int size, Boolean global){
      String prefix = global ? "@" : "%";
      for (int i = 0; i < size; i++) {
         buffer += "%"+tmp+" = getelementptr inbounds ["+size+" x i32], ["+size+" x i32]* "+prefix+id+", i32 0, i32 "+i+"\n";
         int ptrReg = tmp++;
         buffer += "%"+tmp+" = load i32, i32* %"+ptrReg+"\n";
         int valReg = tmp++;
         printf("%"+valReg);
      }
   }

   static void assign(String id, String value){
      buffer += "store i32 "+value+", i32* "+id+"\n";
   }

   static void load(String id){
      buffer += "%"+tmp+" = load i32, i32* "+id+"\n";
      tmp++;
   }
   static void declare_double(String id, Boolean global){
    if( global ){
        header_text += "@"+id+" = global double 0.0\n";
    } else {
        buffer += "%"+id+" = alloca double\n";
    }
   }

   static void call(String id){
      buffer += "%"+tmp+" = call i32 @"+id+"()\n";
      tmp++;
   }
   static void assign_double(String id, String value){
    buffer += "store double "+value+", double* "+id+"\n";
   }
   static void load_double(String id){
    buffer += "%"+tmp+" = load double, double* "+id+"\n";
    tmp++;
   }
   static void add(String val1, String val2){
      buffer += "%"+tmp+" = add i32 "+val1+", "+val2+"\n";
      tmp++;
   }
   static void sub(String val1, String val2){
      buffer += "%"+tmp+" = sub i32 "+val1+", "+val2+"\n";
      tmp++;
   }
   static void mul(String val1, String val2){
      buffer += "%"+tmp+" = mul i32 "+val1+", "+val2+"\n";
      tmp++;
   }
   static void div(String val1, String val2){
      buffer += "%"+tmp+" = sdiv i32 "+val1+", "+val2+"\n";
      tmp++;
   }
   static void add_double(String val1, String val2){
      buffer += "%"+tmp+" = fadd double "+val1+", "+val2+"\n";
      tmp++;
   }
   static void sub_double(String val1, String val2){
      buffer += "%"+tmp+" = fsub double "+val1+", "+val2+"\n";
      tmp++;
   }
   static void mul_double(String val1, String val2){
      buffer += "%"+tmp+" = fmul double "+val1+", "+val2+"\n";
      tmp++;
   }
   static void div_double(String val1, String val2){
      buffer += "%"+tmp+" = fdiv double "+val1+", "+val2+"\n";
      tmp++;
   }
   static void declare_bool(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i1 0\n";
      } else {
         buffer += "%"+id+" = alloca i1\n";
      }
   }
   static void assign_bool(String id, String value){
      buffer += "store i1 "+value+", i1* "+id+"\n";
   }
   static void load_bool(String id){
      buffer += "%"+tmp+" = load i1, i1* "+id+"\n";
      tmp++;
   }
   static void and_bool(String val1, String val2){
      buffer += "%"+tmp+" = and i1 "+val1+", "+val2+"\n";
      tmp++;
   }
   static void or_bool(String val1, String val2){
      buffer += "%"+tmp+" = or i1 "+val1+", "+val2+"\n";
      tmp++;
   }
   static void xor_bool(String val1, String val2){
      buffer += "%"+tmp+" = xor i1 "+val1+", "+val2+"\n";
      tmp++;
   }
   static void neg_bool(String val){
      buffer += "%"+tmp+" = xor i1 "+val+", 1\n";
      tmp++;
   }
   static void declare_float(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global float 0.0\n";
      } else {
         buffer += "%"+id+" = alloca float\n";
      }
   }
   static void assign_float(String id, String value){
      buffer += "store float "+value+", float* "+id+"\n";
   }
   static void load_float(String id){
      buffer += "%"+tmp+" = load float, float* "+id+"\n";
      tmp++;
   }
   static void add_float(String val1, String val2){
      buffer += "%"+tmp+" = fadd float "+val1+", "+val2+"\n";
      tmp++;
   }
   static void sub_float(String val1, String val2){
      buffer += "%"+tmp+" = fsub float "+val1+", "+val2+"\n";
      tmp++;
   }
   static void mul_float(String val1, String val2){
      buffer += "%"+tmp+" = fmul float "+val1+", "+val2+"\n";
      tmp++;
   }
   static void div_float(String val1, String val2){
      buffer += "%"+tmp+" = fdiv float "+val1+", "+val2+"\n";
      tmp++;
   }
   static void scanf_float(String id){
      buffer += "%"+tmp+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsf, i32 0, i32 0), float* "+id+")\n";
      tmp++;
   }
   static void printf_float(String id){
      buffer += "%"+tmp+" = fpext float "+id+" to double\n";
      tmp++;
      buffer += "%"+tmp+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %"+(tmp-1)+")\n";
      tmp++;
   }

   static String defineStringLiteral(String s){
      byte[] b = s.getBytes(StandardCharsets.UTF_8);
      StringBuilder lit = new StringBuilder();
      for (byte x : b) {
         int u = x & 0xff;
         if (u == '\\') lit.append("\\5C");
         else if (u == '"') lit.append("\\22");
         else if (u >= 32 && u < 127) lit.append((char) u);
         else lit.append(String.format("\\%02X", u));
      }
      int n = b.length + 1;
      String name = ".str." + (strLitCounter++);
      header_text += "@"+name+" = private unnamed_addr constant ["+n+" x i8] c\""+lit+"\\00\"\n";
      return "getelementptr inbounds (["+n+" x i8], ["+n+" x i8]* @"+name+", i64 0, i64 0)";
   }

   static void declare_string(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i8* null\n";
      } else {
         buffer += "%"+id+" = alloca i8*\n";
      }
   }

   static void assign_string(String id, String ptrVal){
      buffer += "store i8* "+ptrVal+", i8** "+id+"\n";
   }

   static void load_string(String id){
      buffer += "%"+tmp+" = load i8*, i8** "+id+"\n";
      tmp++;
   }

   static void printf_string(String id){
      buffer += "%"+tmp+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpss, i32 0, i32 0), i8* "+id+")\n";
      tmp++;
   }
   static void close_main(){
      main_text += buffer;
   }
   static String generate(){
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += "@strp = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strpd = constant [5 x i8] c\"%lf\\0A\\00\"\n";
      text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
      text += "@strsf = constant [3 x i8] c\"%f\\00\"\n";
      text += "@strpss = constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }

}
