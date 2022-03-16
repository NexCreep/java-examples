/*
 * Condicional IF
 *      if (condición){
 *          sentencias
 *      }
 *      else{
 *          sentencias
 *      }
 }
*/

public class CondicionalSimple
{
     public static void main(){
         int x = 4;
         if (x > 4)
             System.out.println("Es mayor");
         else {
             System.out.println("Es menor");
             System.out.println("o igual");
         }
     }
}
