grammar hello2;

@header {
    package zmj.test.antlr4.parser;
}


stmt : expr;

expr : expr NUL expr    # Mul
     | expr ADD expr    # Add
     | expr MIN expr    # Min
     | expr DIV expr    # 除法
     | INT              # Int
     ;

NUL : '*';
ADD : '+';
DIV : '/';
MIN : '-';

INT : Digit+;
Digit : [0-9];

WS : [ \t\u000C\r\n]+->skip;

//SHEBANG : '#' '!' ~('\n'|'\r')* -> channel(HIDDEN);