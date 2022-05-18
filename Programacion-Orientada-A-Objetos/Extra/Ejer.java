import java.util.Scanner;

public class Ejer
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        
        
        boolean located = false;

        // Enum[] dias = Enum.values();
        // do{
            // String dia = scan.nextLine();
            // int i = 0; 
            // while(!located && i < dias.length){
                // if (dias[i].name().equalsIgnoreCase(dia))
                    // located = true;
                // i++;
            // }
            
            // if(!located) System.out.println("Repita de nuevo");
            
        // }while(!located);
        
        do{
            try{
                Enum dia = Enum.valueOf(scan.nextLine().toUpperCase());
                located = true;
            }catch (IllegalArgumentException e){
                System.out.println("Día de la semana incorrecto. Inserte de nuevo");
            }
        }while(!located);
        
        System.out.println("Fin de proceso");
        
    }
}
