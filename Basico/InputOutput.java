/*
 * System.out (Abreviar sout)
 *      - sout.println(var) [Imprime en una linea la variable con acarreo de linea (\n)]
 *      - sout.print(var) [Imprime la variable (esta sin acarreo)]
 *      - sout.printf(format, args...) [Imprime un formato especifico los arg. indicadoss]
 *          Formato : %[índice][modificador][ancho][.decimal]tipo_mascarilla
 *              * tipos de mascarilla
 *                  > Char - 'c'o 'C'
 *                  > Boolean - 'b' o 'B'
 *                  > Digitos - 'd'
 *                  > Reales - 'f'
 *                  > Strings - 's' o 'S'
 *                  > Fechas - 't'? o 'T'? (? es un argumeto extra obligatorio)
 *                      - c: **Fecha completa**
 *                      - F: YYYY-mm-dd
 *                      - A: Nombre de dia
 *                      - a: Nobre de dia abreviado
 *              * Decima: Indica cuantos numero de la parte decimal se muestran
 *              * Ancho: Indica cuanto ocupa el valor de la variable respetando la cantidad 
 *                      de caracteres que tenga
 *              * Modificador:Añade el caracter especificado delante 
 *                          (TIP: Si poner una ',' te puntua los miles)
 *              * Indice: Indica el indice del argumento que se quiere utilizar
 *
 * Sytem.in (Abreviar sin)
 *      
*/
import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputOutput
{                          /*Input por argumentos*/
    public static void main(String[] args) throws IOException {
         int x = 1, y = 2;
         float xf = 6661.5f, yf = 3.461f;
         String str = "Suma: ", saludo = "Hola";
         
         // Output        
         System.out.printf("%S%d + %d = %d\n", str, x, y, x+y);
         System.out.printf("%s%,+5.2f + %+.2f = %.2f\n", str, xf, yf, xf+yf);
         System.out.printf("%1$S - %1$s - %1$S\n", saludo);
         System.out.printf("Fecha: %tF %1$TA\n", new Date());
         
         // Input
         
         // InputStreamReader stream;
         // BufferedReader buffer;
         //
         // stream = new InputStreamReader(System.in);
         // buffer = new BufferedReader(stream);
         /*|*/
         /*v*/
         
         // InputStreamReader stream = new InputStreamReader(System.in);
         // BufferedReader buffer = new BufferedReader(stream);  
         /*|*/
         /*v*/
         
         BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
         
         String nombre = "";
         int numero = 0;
         
         System.out.print("Nombre: ");
         nombre = buffer.readLine();
         System.out.println(nombre);
         
         System.out.print("Numero: ");
         numero = Integer.parseInt(buffer.readLine());
         System.out.println(numero);
         
         
    }
}
