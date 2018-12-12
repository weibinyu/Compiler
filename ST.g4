grammar ST;

//------------- goal -------------------

goal
:
	global_variable_declaration_block? program_declaration function_declaration*
;

//------------- program declaration -------------------

program_declaration
:
	PROGRAM identifier program_variable_declaration_block statementList
	END_PROGRAM
;

program_variable_declaration_block
:
	access_variable_declaration_block? local_variable_declaration_block?
;

//------------- function declaration -------------------

function_declaration
:
	FUNCTION identifier ':' type_specification
	function_variable_declaration_blocks statementList END_FUNCTION
;

//------------- variable declaration -------------------

local_variable_declaration_block
:
	VAR variable_declaration+ END_VAR
;

function_variable_declaration_blocks
:
	function_variable_declaration_block*
;

function_variable_declaration_block
:
	variable_declaration_type variable_declaration+ END_VAR
;

variable_declaration_type
:
	VAR
	| VAR_INPUT
	| VAR_OUTPUT
	| VAR_IN_OUT
;

access_variable_declaration_block
:
	VAR_ACCESS access_variable_declaration+ END_VAR
;

variable_declaration
:
	identifier
	(
		',' identifier
	)* ':' type_specification ';'
;

access_variable_declaration
:
	identifier ':' type_specification
	(
		READ_WRITE
		| READ_ONLY
	) ';'
;

//------------- global variable declaration -------------------

global_variable_declaration_block
:
	VAR_GLOBAL variable_declaration+ END_VAR
;

// type_specification

type_specification
:
	integer_type
	| real_type
	| boolean_type
	| string_type
;

integer_type
:
	INT
;

real_type
:
	REAL
;

boolean_type
:
	BOOL
;

string_type
:
	STRING
;

//------------- statement -------------------

statementList
:
	statement+
;

statement
:
	base_statement
	| labeled_statement
;

base_statement
:
	if_statement
	| while_statement
	| assignment_statement
	| exit_statement
	| continue_statement
	| jump_statement
	| empty_statement
;

// if statement

if_statement
:
	IF expression THEN statementList else_part? END_IF ';'?
;

else_part
:
	ELSE statementList
;

// while statement	

while_statement
:
	WHILE expression DO statementList END_WHILE ';'?
;

// other statements

assignment_statement
:
	variable ':=' expression ';'
;

exit_statement
:
	EXIT ';'
;

continue_statement
:
	CONTINUE ';'
;

jump_statement
:
	JMP identifier ';'
;

empty_statement
:
	';'
;

labeled_statement
:
	identifier ':' statement
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
	| function_call
;

simple_value
:
	constant
	| variable
;

variable
:
	identifier
;

identifier
:
	IDENTIFIER
;

function_call
:
	identifier '(' parameter_list? ')'
;

// parameter list

parameter_list
:
	expression
	(
		',' expression
	)*
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
	NULL
	|
	(
		ONETONINE
		(
			DIGIT
		)*
	)
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

//------------- Keywords and symbol sequences ----------------

AND
:
	'AND'
;

BOOL
:
	'BOOL'
;

CONTINUE
:
	'CONTINUE'
;

DIV
:
	'/'
;

DO
:
	'DO'
;

END_IF
:
	'END_IF'
;

END_PROGRAM
:
	'END_PROGRAM'
;

END_VAR
:
	'END_VAR'
;

END_WHILE
:
	'END_WHILE'
;

ELSE
:
	'ELSE'
;

EQ
:
	'=='
;

EXIT
:
	'EXIT'
;

FUNCTION
:
	'FUNCTION'
;

END_FUNCTION
:
	'END_FUNCTION'
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

IF
:
	'IF'
;

INT
:
	'INT'
;

JMP
:
	'JMP'
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

PROGRAM
:
	'PROGRAM'
;

READ_ONLY
:
	'READ_ONLY'
;

READ_WRITE
:
	'READ_WRITE'
;

REAL
:
	'REAL'
;

STRING
:
	'STRING'
;

THEN
:
	'THEN'
;

TIMES
:
	'*'
;

TRUE
:
	'TRUE'
;

VAR
:
	'VAR'
;

VAR_INPUT
:
	'VAR_INPUT'
;

VAR_OUTPUT
:
	'VAR_OUTPUT'
;

VAR_IN_OUT
:
	'VAR_IN_OUT'
;

VAR_ACCESS
:
	'VAR_ACCESS'
;

VAR_GLOBAL
:
	'VAR_GLOBAL'
;

WHILE
:
	'WHILE'
;

XOR
:
	'XOR'
;

//-------------  identifier ----------------

IDENTIFIER
:
	(
		'_'
		| LETTER
	)
	(
		'_'
		| LETTER
		| DIGIT
	)*
;

fragment
LETTER
:
	[a-zA-Z]
;
