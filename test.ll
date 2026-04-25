declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
@x = global i32 0
@y = global double 0.0
define i32 @main() nounwind{
store i32 5, i32* @x
store double 0x40091EB851EB851F, double* @y
ret i32 0 }

