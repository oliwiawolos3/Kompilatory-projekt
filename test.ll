declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
@strpd = constant [5 x i8] c"%lf\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strsf = constant [3 x i8] c"%f\00"
@strpss = constant [4 x i8] c"%s\0A\00"
@y = global float 0.0
@.str.0 = private unnamed_addr constant [12 x i8] c"elo elo 320\00"
@tekst = global i8* null
@.str.1 = private unnamed_addr constant [8 x i8] c"heheheh\00"
@zmienna = global i8* null
define i32 @main() nounwind{
store float 0x0000000000000000, float* @y
%1 = fsub float 0x4024000000000000, 0x4008000000000000
store float %1, float* @y
store i8* getelementptr inbounds ([12 x i8], [12 x i8]* @.str.0, i64 0, i64 0), i8** @tekst
store i8* getelementptr inbounds ([8 x i8], [8 x i8]* @.str.1, i64 0, i64 0), i8** @zmienna
%2 = load i8*, i8** @tekst
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpss, i32 0, i32 0), i8* %2)
%4 = load float, float* @y
%5 = fpext float %4 to double
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %5)
%7 = fdiv float 0x4024000000000000, 0x4000000000000000
store float %7, float* @y
%8 = load float, float* @y
%9 = fpext float %8 to double
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %9)
%11 = fmul float 0x4024000000000000, 0x4014000000000000
store float %11, float* @y
%12 = load float, float* @y
%13 = fpext float %12 to double
%14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %13)
ret i32 0 }

