/*
 * 
 * Metodos estaticos son aquellos que salen directos de la clase:
 *      Clase.metodoEstatico()
 *      
 * Del otro lado los metodos no estaticos son lo que se utilizan a partir del objeto:
 *      Clase objeto = new Clase()
 *      objeto.metodoNoEstatico()
 * 
 * 
 * Metodo estatico parseX(string): [disponible en todas las clases de tipado para convertir una cadena en la clase que contiene el metodo]
 *   - Integer.parseInt(string)
 *   - Short.parseShort(string)
 *   - Byte.parseByte(string)
 *   - Float.parseFloat(string)
 *   - Double.parseDouble(string)
 *      
 *    Si hay una incoherencia en la cadena dada lanza una excepción.
 * 
 * 
 * Clase String [En cambio a otros tipos, los strings son una clase y no un tipo primitivo como int.]
 *   - Se tratan como objetos y no como variables
 *   - Las cadenas se pueden concatenar con un + (Ej.: cadena1 + cadena2) [Si insertas otro tipo en la concatenacion, lo pasa a cadena]
 *   
 *   Metodos de String:
 *      - String.valueOf(arg) => String [Te transforma el argumento en cadena]
 *      - objectStr.toUpperCase() => String [Te devuelve la cadena en mayúscula]
 *      - objectStr.toLowerCase() => String [Te devuelve la cadena en minúscula]
 *      - objectStr.charAt(int) => Char [Te devuelve el caracter de la posicion int]
 *      ((Apunte para comparar cadena el == no es fiable sobre todo si las cadena se modifican))
 *      - objectStr.equals(objectStr1) => Boolean [Compara dos cadenas]
 *      - objectStr.equalsIgnore(objectStr1) => Boolean [Compara dos cadenas sin ser "case sensitive"]
 *      - objectStr.length() => Integer [Te devuelve el numero de caracteres de la cadena]
 *      - objectStr.indexOf(char) => Integer [Te devuelve la primera posicion del caracter. Numero negativo si no lo localiza]
 *      - objectStr.indexOf(char, pos) => Integer [Te devuelve la primera posicion del caracter a partir de la posición dada]
 *      - objectStr.indexOf(objectStr1) => Integer [Te devuelve la primera posicion de la cadena.]
 *      - objectStr.indexOf(objectStr1, pos) => Integer [Te devuelve la primera posicion de la cadena a partir de la posicion dada.]
 *      - objectStr.lastIndexOf(x) => Integer [Igual que indexOf pero localiza a partir del final]
 *      - objectStr.concat(objectStr1) => String [Concatena dos cadenas]
 *  
*/

public class ClasesEnvolventes
{   
    public static void main(String[] args){
        int x = 0; //Esto es una variable
        String cadena = ""; //Esto es un objeto
        
        cadena = "1";
        x = Integer.parseInt(cadena);
        System.out.println(x);
        
    }
}
