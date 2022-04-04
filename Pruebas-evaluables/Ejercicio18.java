import java.util.Arrays;

public class Ejercicio18
{
   public static void main(/*float capital, int[] tiposInteres, int plazo*/){
       double capital = 10000f;
       byte[] intereses = new byte[]{10, 11, 12, 13, 14, 15};
       byte plazo = (byte)15;
       
       /*String capitalStr = String.valueOf(capital);
       int capitalLen = capitalStr.length() + 2;
       String spaces
       System.out.println(capitalLen);*/
       
       
       for (byte interes : intereses)
           System.out.printf("      %d%%   ", interes);
        System.out.println();
       
       double[] crecimiento = new double[intereses.length];
       for(int i=0; i<crecimiento.length; i++){
           crecimiento[i] = capital;
           System.out.printf("%,.2f   ", crecimiento[i]);
       }
       System.out.println();
    
       for(int año=1; año<=plazo; año++){
           for(int i=0; i<crecimiento.length; i++){
                double incremento = crecimiento[i] * (intereses[i] / 100f);
                crecimiento[i] += incremento;
                
                System.out.printf("%,.2f   ", crecimiento[i]);
            }
            if (año == plazo) System.out.printf("--Monto final");
            System.out.println();
       }
       
        
    
   }
}
