grammar javaclass;

options {
    language=Java;
}
javaFile: 'package' ' ' PACKAGENAME ';' className;

classDefinition: 'class' className '{' (method)* '}';

className: (ID|' ')+;
method : methodName '(' (parameter)* ')'(' ')*'{' (instruction)*'}' ;
parameter:instruction|' '|'['|']';
methodName: (ID|' ')+;
instruction : ID|'.'|'('|')'|';'|' '|str;
str: STR;
ID : [a-zA-Z0-9|'_']+ ;
PACKAGENAME: [a-z.]+;
STR:('\''|'"') ('\'\'' | ~('\''))* ('\''|'"');
WS: [ \t\n\r]* -> skip ;



