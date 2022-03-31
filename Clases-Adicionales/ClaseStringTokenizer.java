/*
 * Clase StringTokenizer (java.util)
 *      StringTokenizer object = new StringTokenizer(cadena) (Trocea la clase en tokens)
 *      Ej: "Hola Caracola Buenos Días" => "Hola" - "Caracola" - "Buenos" - "Días"
 *      
 *      object.countTokens() (Devuelve el numero de tokens del objeto)
 *      object.hasMoreTokens() (Comprueba si tiene más tokens el objeto)
 *      object.nextToken() (Devuelve el proximo token del objeto)
*/
import java.util.StringTokenizer;
import java.util.Scanner;

public class ClaseStringTokenizer
{
    public static void main() throws Exception{
        final String[] conjsCops = new String[]{"y", "e", "ni", "que", "cuanto"};
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        String phrase = scan.nextLine();
        StringTokenizer tokens = new StringTokenizer(phrase);
        
        short conjCount = 0;
        String token = "";
        while (tokens.hasMoreTokens()){
            token = tokens.nextToken();
            for (String conj : conjsCops){
                if (conj.equalsIgnoreCase(token)) conjCount++;
            }
            
        }
        
        System.out.println("La frase tiene " + conjCount + " conjunciones copulativas.");
        
        tokens = new StringTokenizer(phrase);
        
        conjCount = 0;
        token = "";
        final int TOKEN_COUNT = tokens.countTokens();
        for (int i=0; i<TOKEN_COUNT; i++){
            token = tokens.nextToken();
            for (String conj : conjsCops){
                if (conj.equalsIgnoreCase(token)) conjCount++;
            }
        }
        
        System.out.println("La frase tiene " + conjCount + " conjunciones copulativas.");
        
        tokens = new StringTokenizer(phrase);
        
        conjCount = 0;
        token = "";
        while (tokens.countTokens() > 0){
            token = tokens.nextToken();
            for (String conj : conjsCops){
                if (conj.equalsIgnoreCase(token)) conjCount++;
            }
        }
        
        System.out.println("La frase tiene " + conjCount + " conjunciones copulativas.");
    }
}
