grammar LangX;

prog: ( stat? NEWLINE )* ;

stat:	WRITE ID		#write
	| ID ASSIGN expr	#assign
	| ID LBR expr RBR ASSIGN expr	#assignElem
	| ARRAY ID LBR INT RBR	#arrayDecl
	| READ ID   		#read
	| READ ID LBR expr RBR	#readElem;

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
   | FALSE;

WRITE:	'write' ;

READ:	'read' ;
ARRAY:	'array' ;

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

ADD: '+';
SUB: '-' ;
MUL: '*' ;
DIV: '/' ;
LP : '(' ;
RP : ')' ;

NEWLINE:	'\r'? '\n';

WS:   (' '|'\t')+ { skip(); };
