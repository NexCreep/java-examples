import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18
{
   public static void main(/*float capital, int[] tiposInteres, int plazo*/){
       final Scanner scan = new Scanner(System.in);
       
       double capital = 10000f;
       byte[] intereses = new byte[100];
       byte plazo = 15, iIntereses = 0;    
       
       
       System.out.print("Introduce interes (0 para salir): ");
       byte interes = Byte.parseByte(scan.nextLine());
       if (interes != 0){
           intereses[iIntereses] = interes;
           iIntereses++;
       
            while(iIntereses < intereses.length && interes != 0){
               System.out.print("Introduce interes (0 para continuar): ");
               interes = Byte.parseByte(scan.nextLine());
               if (interes != intereses[iIntereses-1] && interes != 0){
                   intereses[iIntereses] = interes;
                   iIntereses++;
               }
            }
            System.out.println();
        
            
            byte interesesLen = (byte)realArrayLen(intereses);
            
           final int CREC_COLS = plazo + 1;
           double[][] crecimiento = new double[CREC_COLS][interesesLen];
           
           for(int i=0; i<crecimiento[0].length; i++)
               crecimiento[0][i] = capital;
           
           for(int i=1; i<crecimiento.length; i++){
               for(int j=0; j<crecimiento[i].length; j++){
                    double inc = crecimiento[i-1][j] * (float)(intereses[j] / 100f);
                    crecimiento[i][j] = crecimiento[i-1][j] + inc;
                    
                    //System.out.printf("%,.2f   ", crecimiento[i][j]);
                }
                /*if (i+1 == plazo) System.out.printf("--Monto final");
                System.out.println();*/
           }
           
           
           for (int i = 0; i < interesesLen; i++){
               String interesStr = String.valueOf(interes), capitalStr = String.valueOf(capital);
               byte capitalLen = (byte)capitalStr.length(), interesLen = (byte)interesStr.length();
               byte spacesCant = capitalLen > interesLen ? (byte)(capitalLen - interesLen) : 0;
               
               String spaces = "";
               for (int j = 1; j <= spacesCant; j++)
                   spaces = spaces + " ";
               
               System.out.printf("%s%d%%   ", spaces, intereses[i]);
            }
               
            System.out.println();
           
           for(int i=0; i<crecimiento.length; i++){
               for(int j=0; j<crecimiento[i].length; j++)
                   System.out.printf("%,.2f   ", crecimiento[i][j]);
                   
                if (i+1 == CREC_COLS) System.out.printf("--Monto final");
                System.out.println();
            }
        }
   }
   
   private static int realArrayLen(byte[] array){
       int count = 0, i=0;

       do{
           if (array[i] != 0) count++;
           i++;
       }while(i < array.length && array[i] != 0);
       
       return count;
   }
}
