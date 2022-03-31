import java.util.Arrays;
public class Ejercicio18
{
   public static void main(int capital, int[] tiposInteres, int plazo){
       int[] capInt = new int[tiposInteres.length];
       
       for (int i=0; i<capInt.length; i++){
           capInt[i] = capital;
       }
       
       System.out.println(Arrays.toString(tiposInteres));
       System.out.println(Arrays.toString(capInt));
       
   }
}
