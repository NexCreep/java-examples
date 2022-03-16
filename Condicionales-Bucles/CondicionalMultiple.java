/*
 * Condicional SWITCH
 *  Admite enteros, caracteres, o cadenas
 *       switch(expresion){
 *           case valor1: 
 *              sentencias; 
 *              [break;]
 *              
 *           case valor2: 
 *              sentencias; 
 *              [break;]
 *              
 *           [default: sentencias;]
 *       }
*/

public class CondicionalMultiple
{
    public static void main(){
        int x = 5;
        switch (x+1){
            case 6:
                x = 6;
                
            case 8:
                x = 8;
                break;
                
            default:
                x = 100;
        }
        System.out.println(x);
    }
}
