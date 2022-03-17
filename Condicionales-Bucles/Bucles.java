/*
 * BUCLES
 *    tip: Inicializar contadores, acumuladores y flajs
 *    - Bucle indeterminado while (0-n)
 *          while(condición){
 *              sentencias
 *          }
 *          
 *    - Bucle indeterminado do..while (1-n)
 *          do{
 *              sentencias
 *          }while (condición);
 *    
 *    - Bucle determinado for
 *          for (init; condi; inc){
 *              sentencias
 *          }
*/

public class Bucles
{
    public static void main(){
        byte cont = 1;
        while (cont <= 100){
            cont++;
        }
        
        cont=1;
        do{
            cont++;
        }while (cont <= 100);
        
        
        for(byte i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
    
}
