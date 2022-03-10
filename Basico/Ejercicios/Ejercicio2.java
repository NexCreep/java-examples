package Ejercicios;

/*
 * Capital: 2000
 * Interés: 10.5
 * Intereses: 201.00
 * Capital + Intereses = 2201.00
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2
{
     public static void main() throws Exception {
         float capital = 0f, interes = 0f, intereses = 0f;
         BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
         
         System.out.print("Capital: ");
         capital = Float.parseFloat(buffer.readLine());
         
         System.out.print("Interes: ");
         interes = Float.parseFloat(buffer.readLine());
         
         intereses = capital * (interes/100);
         System.out.printf("Intereses: %.2f\n", intereses);
         System.out.printf("Capital + Intereses = %.2f", capital + intereses);
         
         
     }
}
