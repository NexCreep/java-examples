import java.util.Scanner;

public class Principal
{
    public static void main(){
        String modelo = askModel("Nombre del modelo: ");
        float consumo = askReal("Consumo (kW/h): ");
        float temperatura = askReal("Temperatura (ºC): ");
        
        Frigorifico frigo = new Frigorifico(modelo, consumo, temperatura);
        
        System.out.println(frigo);
        System.out.printf("Su temperatura en Fahrenheit es %.2f ºF", frigo.pasoFarenheit());
        
    }
    
    private static float askReal(String msg){
        Scanner scan = new Scanner(System.in);
        float asked = 0f;
        boolean passed = false;
        
        do{
            try{
                System.out.print(msg);
                asked = Float.parseFloat(scan.nextLine());
                passed = true;
            }catch (NumberFormatException e){
                System.out.println("[!] Debes introducir un número");
            }catch (Exception e){
                System.out.println("[!] Error inesperado. \n ("+ e +")");
            }
            
        }while(!passed);
        
        return asked;
    }
    
    private static String askModel(String msg){
        Scanner scan = new Scanner(System.in);
        String asked = "";
        boolean passed = false;
        
        do{
            try{
                System.out.print(msg);
                asked = scan.nextLine();
                int i = 0;
                do{
                    if (Character.isDigit(asked.charAt(i)))
                        throw new Exception("[!] El nombre del modelo no puede contener dígitos");
                    i++;
                }while(i < asked.length());
                
                passed = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(!passed);
        
        return asked;
    }
    
}   
