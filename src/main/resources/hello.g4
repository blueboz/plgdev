grammar hello;

@header {
    package cn.boz.hello;
}

stmt: expr;
expr: expr MUL expr         #MUL
    | expr ADD expr         #ADD
    | expr DIV expr         #DIV
    | expr MIN expr         #MIn
    | INT                   #Int
    ;

MUL: '*';
ADD: '+';
DIV: '/';
MIN: '-';

WS: [ \t\u000C\r\n]+ ->skip;

SHEBANG: '#' '!' ~('\n'|'\r')* -> channel(HIDDEN);