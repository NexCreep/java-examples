package Ejercicios;

/*
 * Tenemos una variable tipo float de valor 375.28
 * Output
 *      Parte entera: 375
 *      Parte real: 28
*/

public class Ejercicio1
{
    public static void main(String[] args){
        final float num = 3.141592f;
        
        int dotIndex = 0;
        String numStr = "";
        
        numStr = String.valueOf(num);
        dotIndex = numStr.indexOf('.');
        
        System.out.println("Parte entera: " + numStr.substring(0, dotIndex));
        System.out.println("Parte real: " + numStr.substring(dotIndex+1));
        
    }
    
}
