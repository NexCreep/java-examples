import java.util.Scanner;

public class Excepciones
{   
    public static void main(String[] args){
        int num1 = getNum("Numero 1: ");
        int num2 = getNum("Numero 2: ");
        int num3 = getNum("Numero 3: ");
        
        System.out.print("Suma: " + (num1 + num2 + num3));
    }
    
    private static int getNum(String msg){
        Scanner sc = new Scanner(System.in);
        
        boolean error = true;
        int num = 0;
        
        error = true;
        do{
            try{
                System.out.print(msg);
                num = Integer.parseInt(sc.nextLine());
                error = false;
            }catch (NumberFormatException e){
                System.out.println("Debes de introducir un numero");
            }catch (Exception e){
                System.out.println(e);
            }
        }while (error);
        
        return num;
    }
    
}
