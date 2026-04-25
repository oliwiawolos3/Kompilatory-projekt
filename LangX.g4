grammar LangX;

prog: ( stat? NEWLINE )* ;

stat:	WRITE ID		#write
	| ID '=' expr		#assign
	| READ ID   		#read;

expr: NEG expr       #neg
   | LP expr RP      #parens
   | expr MUL expr   #mul   
   | expr DIV expr   #div
   | expr ADD expr   #add
   | expr SUB expr   #sub
   | expr AND expr   #and
   | expr XOR expr   #xor
   | expr OR expr    #or
   | value           #single;

value: ID
   | INT
   | REAL
   | TRUE
   | FALSE;

WRITE:	'write' ;

READ:	'read' ;
TRUE:  'true' ;
FALSE: 'false' ;
AND:   'and' ;
OR:    'or' ;
XOR:   'xor' ;
NEG:   'not' ;
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
