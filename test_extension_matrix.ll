declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
declare void @llvm.trap() nounwind noreturn
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
@strpd = constant [5 x i8] c"%lf\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strsf = constant [3 x i8] c"%f\00"
@strpss = constant [4 x i8] c"%s\0A\00"
@str_scan_s255 = constant [6 x i8] c"%255s\00"
@strp_read_cli = constant [3 x i8] c"%s\00"
@str_arr_lbr = constant [2 x i8] c"[\00"
@str_arr_sep = constant [2 x i8] c",\00"
@str_row_sep = constant [2 x i8] c";\00"
@str_arr_rbrnl = constant [3 x i8] c"]\0A\00"
@m = global [6 x i32] zeroinitializer
define i32 @main() nounwind{
%1 = mul i32 0, 3
%2 = add i32 %1, 0
%3 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %2
store i32 1, i32* %3
%4 = mul i32 0, 3
%5 = add i32 %4, 1
%6 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %5
store i32 2, i32* %6
%7 = mul i32 0, 3
%8 = add i32 %7, 2
%9 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %8
store i32 3, i32* %9
%10 = mul i32 1, 3
%11 = add i32 %10, 0
%12 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %11
store i32 4, i32* %12
%13 = mul i32 1, 3
%14 = add i32 %13, 1
%15 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %14
store i32 5, i32* %15
%16 = mul i32 1, 3
%17 = add i32 %16, 2
%18 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %17
store i32 6, i32* %18
%bc_ge_1 = icmp sge i32 0, 0
%bc_lt_1 = icmp slt i32 0, 2
%bc_ok_1 = and i1 %bc_ge_1, %bc_lt_1
br i1 %bc_ok_1, label %idx_ok_1, label %idx_bad_1
idx_bad_1:
call void @llvm.trap()
unreachable
idx_ok_1:
%19 = mul i32 0, 3
%20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_lbr, i32 0, i32 0))
%21 = add i32 %19, 0
%22 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %21
%23 = load i32, i32* %22
%24 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %23)
%25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_sep, i32 0, i32 0))
%26 = add i32 %19, 1
%27 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %26
%28 = load i32, i32* %27
%29 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %28)
%30 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_sep, i32 0, i32 0))
%31 = add i32 %19, 2
%32 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %31
%33 = load i32, i32* %32
%34 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %33)
%35 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @str_arr_rbrnl, i32 0, i32 0))
%bc_ge_2 = icmp sge i32 2, 0
%bc_lt_2 = icmp slt i32 2, 3
%bc_ok_2 = and i1 %bc_ge_2, %bc_lt_2
br i1 %bc_ok_2, label %idx_ok_2, label %idx_bad_2
idx_bad_2:
call void @llvm.trap()
unreachable
idx_ok_2:
%36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_lbr, i32 0, i32 0))
%37 = add i32 2, 0
%38 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %37
%39 = load i32, i32* %38
%40 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %39)
%41 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_sep, i32 0, i32 0))
%42 = add i32 2, 3
%43 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 %42
%44 = load i32, i32* %43
%45 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %44)
%46 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @str_arr_rbrnl, i32 0, i32 0))
%47 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_lbr, i32 0, i32 0))
%48 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 0
%49 = load i32, i32* %48
%50 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %49)
%51 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_sep, i32 0, i32 0))
%52 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 1
%53 = load i32, i32* %52
%54 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %53)
%55 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_sep, i32 0, i32 0))
%56 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 2
%57 = load i32, i32* %56
%58 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %57)
%59 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_row_sep, i32 0, i32 0))
%60 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 3
%61 = load i32, i32* %60
%62 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %61)
%63 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_sep, i32 0, i32 0))
%64 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 4
%65 = load i32, i32* %64
%66 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %65)
%67 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @str_arr_sep, i32 0, i32 0))
%68 = getelementptr inbounds [6 x i32], [6 x i32]* @m, i32 0, i32 5
%69 = load i32, i32* %68
%70 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32 %69)
%71 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @str_arr_rbrnl, i32 0, i32 0))
ret i32 0 }

