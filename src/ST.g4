grammar ST;

//------------- goal -------------------

goal
:
	expression
;

//------------- expression -------------------

expression
:
	primary_expression
	| add expression
	| expression pot expression
	| expression mult expression
	| expression add expression
	| expression cmp expression
	| expression eq expression
	| neg expression
	| expression and expression
	| expression or expression
;

primary_expression
:
	'(' expression ')'
	| simple_value
;

simple_value
:
	constant
;

pot
:
	POT
;

mult
:
	TIMES
	| DIV
	| MOD
;

add
:
	PLUS
	| MINUS
;

cmp
:
	LT
	| GT
	| LE
	| GE
;

eq
:
	EQ
	| NEQ
;

neg
:
	NOT
;

and
:
	AND
;

or
:
	OR
	| XOR
;

//------------- constant literal -------------------

constant
:
	integer_literal
	| real_literal
	| boolean_literal
	| string_literal
;

// real

real_literal
:
	FIX_POINT
	| REAL_EXPONENT
;

// integer

integer_literal
:
	UNSIGNED_INT
;

// boolean

boolean_literal
:
	TRUE
	| FALSE
;

// string

string_literal
:
	STRING_VALUE
	| WSTRING_VALUE
;

// real

REAL_EXPONENT
:
	(
		FIX_POINT
		| UNSIGNED_INT
	) EXPONENT
;

FIX_POINT
:
	UNSIGNED_INT '.'
	(
		DIGIT
	)*
;

// integer

UNSIGNED_INT
:
	ONETONINE
	(
		DIGIT
	)*
;

fragment
EXPONENT
:
	'E'
	(
		PLUS
		| MINUS
	)? UNSIGNED_INT
;

fragment
DIGIT
:
	NULL
	| ONETONINE
;

NULL
:
	'0'
;

ONETONINE
:
	[1-9]
;

// string

STRING_VALUE
:
	'\'' CHAR_SYMBOL* '\''
;

WSTRING_VALUE
:
	'"' WCHAR_SYMBOL* '"'
;

fragment
CHAR_SYMBOL
:
	~[$'\n\r]
;

fragment
WCHAR_SYMBOL
:
	~[$"\n\r]
;

// ignored

PRAGMA
:
	'{' .*? '}' -> skip
;

WSFULL
:
	[ \r\t\u000C\n]+ -> skip
;

LINE_COMMENT
:
	'(*' .*? '*)' -> skip
;

C_LINE_COMMENT
:
	'/*' .*? '*/' -> skip
;

SINGLE_LINE_COMMENT
:
	'//' ~[\n\r]* -> skip
;

AND
:
	'AND'
;

DIV
:
	'/'
;

EQ
:
	'=='
;

FALSE
:
	'FALSE'
;

GE
:
	'>='
;

GT
:
	'>'
;

LE
:
	'<='
;

LT
:
	'<'
;

MOD
:
	'MOD'
;

MINUS
:
	'-'
;

NEQ
:
	'<>'
;

NOT
:
	'NOT'
;

OR
:
	'OR'
;

PLUS
:
	'+'
;

POT
:
	'**'
;

TIMES
:
	'*'
;

TRUE
:
	'TRUE'
;

XOR
:
	'XOR'
;

