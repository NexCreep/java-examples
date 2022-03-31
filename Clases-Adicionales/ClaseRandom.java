/*
 * Clase Random (java.util)
 *      objeto.nextInt() => int (Nos genera un número de tipo int aleatorio)
 *      objeto.nextInt(n) => int (Nos genera un número de tipo int aleatorio entre 0 y n)
 *      objeto.nextLong() => long (Nos genera un número de tipo long aleatorio)
 *      objeto.nextFloat() => long (Nos genera un número de tipo float aleatorio)
 *      objeto.nextDouble() => long (Nos genera un número de tipo double aleatorio)
 *      objeto.nextBoolean() => boolean (Nos genera un número de tipo boolean aleatorio)
 *      
*/
import java.util.Random;

public class ClaseRandom
{
    public static void main(){
        Random random = new Random();
        for (int i=1; i <= 10; i++)
            System.out.println(random.nextInt(10));
        
    }
}
