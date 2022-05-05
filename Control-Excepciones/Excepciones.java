import java.util.Scanner;

public class Excepciones
{
    public static void main(){
        
        askNum();
        
        System.out.println("Fin de proceso");
    }
    
    public static void askNum() {
        final Scanner scan = new Scanner(System.in);
        
        try{
            System.out.print("Numero: ");
            int a = Integer.parseInt(scan.nextLine());
            System.out.println("El numero es: " + a);
        }
        catch (NumberFormatException e){
            System.out.println("El numero introducido no tiene el formato adecuado o no es un numero");
            askNum();
        }
        catch (Exception e){
            System.out.println(e);
            askNum();
        }
    }
}
