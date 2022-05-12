import java.util.Scanner;

public class Principal{
    
    public static void main() {
        
        int num1 = 0, num2 = 0, num3 = 0;
        
        /*
        num1 = numEntero("Número 1:");
        num2 = numEntero("Número 2:");
        num3 = numEntero("Número 3:");
        */
        
        //System.out.println("Suma:" + (num1+num2+num3));
        
        try {
        
        System.out.println("Suma:" + (numEntero("Número 1:")
                                   +  numEntero("Número 2:")
                                   +  numEntero("Número 3:")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Programa finalizado");
        
        
    }
    
    public static int numEntero (String mensaje) throws Exception {
        
        int num = 0;
        boolean error = false;
        
        Scanner sc = new Scanner (System.in);
        

        error = true;
        do{
            try {
                System.out.println(mensaje);
                //do {
                    num = Integer.parseInt (sc.nextLine());
                //} while (num < 0);
                if (num < 0)
                    throw (new Exception ("Número no puede ser negativo"));
                
                error = false;
                
            } catch (java.lang.NumberFormatException e){
                System.out.println ("No correcto - vuelve a intentarlo");
            } catch (Exception e){
                System.out.println (e);
                System.out.println ("No correcto - Avise a Informática");
            }
        } while (error);
        

        
        return num;
           
    }
    
}
    
