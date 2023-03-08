package analizador;
import java_cup.runtime.Symbol;
import java.util.ArrayList;

// importar la clase Error
import Errores.Excepcion;

%%

%{
    //Código de usuario
    // crear un arraylist para los errores lexicos
    public  ArrayList<Excepcion> erroresLexicos = new ArrayList<Excepcion>() ;

%}

%class lexico // definir como trabajara el scanner 
%cup            // trabajar con cup 
%public         // tipo publico
%line           // conteo de lineas - linea por linea  
%column           // caracter por caracter    Column por char
%char
%full
%unicode        // tipo de codigicacion para que acepte la  ñ u otro caracter  
%ignorecase     // case insensitive 


//simbolos
CONJ = "CONJ"
DOSPUNTOS = ":"
GUION = "-"
MAYOR = ">"
COMA = ","
TILDE = "~"
LLAVEA = "{"
LLAVEC = "}"
CONCATENACION = "."
DISYUNCION = "|"
ASTERISCO = "*"
SUMA = "+"
INTERROGACION = "?"
PORCENTAJE = "%"
PUNTO_Y_COMA = ";"
COMILLAS = \"

ENTER = [\ \n]
SPACE   = [\ \t\r\f]
ESCAPADOS = "\\n" | "\\\"" | "\\\'"
NO_ESCAPADOS=  [^\'\"]
COMENTARIOMULTI = "<!" [^/]~ "!>"
COMENTARIOSIMPLE = "//" .*
MINUSCULAS = [a-z]
MAYUSCULAS = [A-Z]
NUMEROS =  [0-9]
CARACTER = (\" {NO_ESCAPADOS} \") | {ESCAPADOS}
IDENTIFICADOR = [a-zA-Z0-9_]+
CADENA = \"( [^\"] | "\\\"")+\"
CARACTERES = [!-,.-\/:-=?-@\[-`{-}]




%%

<YYINITIAL> {COMILLAS} { }
<YYINITIAL> {SPACE}     { }
<YYINITIAL> {ENTER}     { }
<YYINITIAL> {COMENTARIOMULTI}     {System.out.println(yytext()) ; }
<YYINITIAL> {COMENTARIOSIMPLE}     {System.out.println(yytext()) ; }

<YYINITIAL> {LLAVEA} {System.out.println(yytext()) ;  return new Symbol(sym.LLAVEA, yyline, yycolumn, yytext()); }
<YYINITIAL> {LLAVEC} {System.out.println(yytext()) ;  return new Symbol(sym.LLAVEC, yyline, yycolumn, yytext()); }
<YYINITIAL> {CONJ}  {System.out.println(yytext()) ;   return new Symbol(sym.CONJ, yyline, yycolumn,yytext());  }
<YYINITIAL> {DOSPUNTOS} {System.out.println(yytext()) ;  return new Symbol(sym.DOSPUNTOS, yyline, yycolumn, yytext()); }
<YYINITIAL> {GUION}  {System.out.println(yytext()) ;  return new Symbol(sym.GUION, yyline, yycolumn, yytext()); }
<YYINITIAL> {MAYOR}  {System.out.println(yytext()) ;  return new Symbol(sym.MAYOR, yyline, yycolumn, yytext()); }
<YYINITIAL> {COMA} {System.out.println(yytext()) ;  return new Symbol(sym.COMA, yyline, yycolumn, yytext()); }
<YYINITIAL> {TILDE}   {System.out.println(yytext()) ;  return new Symbol(sym.TILDE, yyline, yycolumn, yytext()); }
<YYINITIAL> {CONCATENACION}    {System.out.println(yytext()) ;  return new Symbol(sym.CONCATENACION, yyline, yycolumn, yytext()); }
<YYINITIAL> {DISYUNCION}       {System.out.println(yytext()) ;  return new Symbol(sym.DISYUNCION, yyline, yycolumn, yytext()); }
<YYINITIAL> {ASTERISCO}        {System.out.println(yytext()) ;  return new Symbol(sym.ASTERISCO, yyline, yycolumn, yytext()); }
<YYINITIAL> {SUMA}             {System.out.println(yytext()) ;  return new Symbol(sym.SUMA, yyline, yycolumn, yytext()); }
<YYINITIAL> {INTERROGACION}    {System.out.println(yytext()) ;  return new Symbol(sym.INTERROGACION, yyline, yycolumn, yytext()); }
<YYINITIAL> {PORCENTAJE}       {System.out.println(yytext()) ;  return new Symbol(sym.PORCENTAJE, yyline, yycolumn, yytext()); }
<YYINITIAL> {PUNTO_Y_COMA}     {System.out.println(yytext()) ;  return new Symbol(sym.PUNTO_Y_COMA, yyline, yycolumn, yytext()); }
<YYINITIAL> {CARACTER}     {System.out.println(yytext()) ;  return new Symbol(sym.CARACTER, yyline, yycolumn, yytext()); }
<YYINITIAL> {MINUSCULAS}             {System.out.println(yytext()) ;  return new Symbol(sym.MINUSCULAS, yyline, yycolumn, yytext()); }
<YYINITIAL> {MAYUSCULAS}    {System.out.println(yytext()) ;  return new Symbol(sym.MAYUSCULAS, yyline, yycolumn, yytext()); }
<YYINITIAL> {NUMEROS}       {System.out.println(yytext()) ;  return new Symbol(sym.NUMEROS, yyline, yycolumn, yytext()); }
<YYINITIAL> {IDENTIFICADOR}     {System.out.println(yytext()) ;  return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext()); }
<YYINITIAL> {CADENA}             {System.out.println(yytext()) ;  return new Symbol(sym.CADENA, yyline, yycolumn, yytext()); }
<YYINITIAL> {CARACTERES}     {System.out.println(yytext()) ;  return new Symbol(sym.CARACTERES, yyline, yycolumn, yytext()); }




<YYINITIAL> . {

       
        //String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        //System.out.println(errLex);
        // agregar errores lexicos 
        erroresLexicos.add(new Excepcion("Léxico","El caracter : '"+yytext()+"'no pertenece al lenguaje: ", Integer.toString(yyline+1), Integer.toString(yycolumn+1)));
}
