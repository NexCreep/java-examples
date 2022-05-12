import java.util.Scanner;

public class ClaseP2
{
    public static int getNum(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean error = true;
        do{
            try{
                do{
                    System.out.println(mensaje);
                    num = Integer.parseInt(sc.nextLine());
                    
                    try {
                        if (num < 0)
                            throw (new NoNegativo());
                        else
                            if (num == 0)
                                throw (new NoNulo());
                    } catch (Exception e) {
                        System.out.println (e.getMessage());
                    }
                }while (num <= 0);
                
                error = false;
            }catch(NumberFormatException e){
                System.out.println ("No correcto - vuelve a intentarlo");
                
            }catch(Exception e){
                System.out.println (e);
                System.out.println ("No correcto - Avise a Informática");
            }            
        }while(error);
        
        
        return num;
    }
}
