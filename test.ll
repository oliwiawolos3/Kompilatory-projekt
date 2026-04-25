declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
@strpd = constant [5 x i8] c"%lf\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@x = global i32 0
define i32 @main() nounwind{
store i32 0, i32* @x
%1 = add i32 2, 3
%2 = mul i32 %1, 4
store i32 %2, i32* @x
%3 = load i32, i32* @x
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %3)
ret i32 0 }

