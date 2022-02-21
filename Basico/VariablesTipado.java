/*
 * Variable camenCase
 * 
 * Constantes MAYUS_CASE
 *  Declaracion: final int CONST = 0;
 *  
 * Clases PascalCase
 * 
 * 
 * Tipos de datos:
 *  -Primitivos
 *  Enteros: (3, 80, 21)
 *      byte
 *      short
 *      int
 *      long
 *  Reales: (3.5, 4.67)
 *      float
 *      double
 *      
 *  char ('a', 'b'...)
 *  boolean (? true : false)
 *  
 *  -De Referencia (A clases)
 *  String cadena[<-objeto] = "";
 *  
 *  Casting:
 *      var = (nombre_tipado)X
 *      
 *      ¡¡¡CUALQUIER NUMERO LO TRATA COMO int!!!
 *  
*/
public class VariablesTipado
{
    //COMENTARIO
    
    //Declaracion e inicializacion constante
    final int CONST = 50;
    
    public static void main(String[] args){
        //Declaracion e inicializacion variable
        byte diaSemana = 0;
        
        //Casteo
        diaSemana = (int)7;
        
        return;
        
    }
    
}
