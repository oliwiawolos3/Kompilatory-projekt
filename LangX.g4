grammar LangX;

prog: ( stat? NEWLINE )* ;

stat:	WRITE ID		#write
	| ID '=' expr		#assign
	| READ ID   		#read;

expr: LP expr RP      #parens
   | expr MUL expr   #mul   
   | expr DIV expr   #div
   | expr ADD expr   #add
   | expr SUB expr   #sub
   | value           #single;

value: ID
       | INT
       | REAL;	

WRITE:	'write' ;

READ:	'read' ;
   
ID:   ('a'..'z'|'A'..'Z')+;

REAL: '0'..'9'+ '.' '0'..'9'+;
INT:   '0'..'9'+;

ADD: '+';
SUB: '-' ;
MUL: '*' ;
DIV: '/' ;
LP : '(' ;
RP : ')' ;

NEWLINE:	'\r'? '\n';

WS:   (' '|'\t')+ { skip(); };
