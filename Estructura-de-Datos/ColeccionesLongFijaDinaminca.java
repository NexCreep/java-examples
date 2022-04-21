import java.util.Scanner;
import java.util.Arrays;

public class ColeccionesLongFijaDinaminca
{
    public static void main(){
        final Scanner scan = new Scanner(System.in);
        int[] array = new int[1];
        
        while (true){
            System.out.println("Actual size = " + array.length + " "  + Arrays.toString(array));
            array[array.length-1] = Integer.parseInt(scan.nextLine());
            array = increaseArray(array);
        }
    }
    
    private static int[] increaseArray(int[] array){
        int[] aux = new int[array.length];
        System.arraycopy(array, 0, aux, 0, array.length);
        
        array = new int[array.length+1];
        System.arraycopy(aux, 0, array, 0, aux.length);
        
        return array;
        
    }
}
