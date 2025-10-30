grammar MyLang;

start
  : stmt* EOF
  ;

stmt
  : id=ID '=' value=expr ';'    # Assign
  | expr ';'                    # ExprStmt
  ;

expr
  : lhs=expr '*' rhs=expr       # Mul
  | lhs=expr '+' rhs=expr       # Add
  | ID                          # Name
  | NUM                         # Number
  ;


ID  : [a-zA-Z_] [a-zA-Z_0-9]* ;
NUM : [0-9]+ ;

WS  : [ \t\r\n]+ -> skip ;
