grammar LangX;

prog: ( NEWLINE* stat )* NEWLINE* EOF;

stat:	WRITE writeArg		#write
	| ID LBR INT (COMMA INT)* RBR		#arrayDecl
	| ID LBR expr (COMMA expr)* RBR ASSIGN expr	#arrayAssing
	| ID ASSIGN expr	#assign
	| ID LBR expr RBR ASSIGN expr	#assignElem
	| READ ID   		#read
	| READ ID LBR expr RBR	#readElem;

writeArg: ID
	| array;

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

value: ID (LBR expr RBR)?
   | INT
   | REAL
   | FLOAT
   | TRUE
   | FALSE
   | STRING
   | array;

indexItem: expr
	| COLON;

array: ID LBR indexItem (COMMA indexItem)* RBR ;

WRITE:	'write' ;
READ:	'read' ;

LBR:	'[' ;
RBR:	']' ;

TRUE:  'true' ;
FALSE: 'false' ;

AND:   'and' ;
OR:    'or' ;
XOR:   'xor' ;
NEG:   'not' ;
ID:   ('a'..'z'|'A'..'Z')+;

FLOAT: '0'..'9'+ '.' '0'..'9'+ 'f';
REAL: '0'..'9'+ '.' '0'..'9'+;
INT:   '0'..'9'+;
STRING: '\'' ~'\''* '\'';

ASSIGN: '=' ;
ADD: '+';
SUB: '-' ;
MUL: '*' ;
DIV: '/' ;
LP : '(' ;
RP : ')' ;
COLON: ':' ;
COMMA : ',' ;

NEWLINE:	'\r'? '\n';

WS:   (' '|'\t')+ { skip(); };
