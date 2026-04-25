declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
@strpd = constant [5 x i8] c"%lf\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strsf = constant [3 x i8] c"%f\00"
@y = global float 0.0
define i32 @main() nounwind{
store float 0x0000000000000000, float* @y
%1 = fsub float 0x4024000000000000, 0x4008000000000000
store float %1, float* @y
%2 = load float, float* @y
%3 = fpext float %2 to double
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %3)
%5 = fdiv float 0x4024000000000000, 0x4000000000000000
store float %5, float* @y
%6 = load float, float* @y
%7 = fpext float %6 to double
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %7)
%9 = fmul float 0x4024000000000000, 0x4014000000000000
store float %9, float* @y
%10 = load float, float* @y
%11 = fpext float %10 to double
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %11)
ret i32 0 }

