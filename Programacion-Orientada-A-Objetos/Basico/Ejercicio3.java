import java.util.Scanner;

public class Ejercicio3
{
    public static void main(){
        final Scanner scan = new Scanner(System.in, "UTF-8");
        
        int option = 0;
        do{
            System.out.println("Opciones => \n\t1. Simético \n\t2. Primo \n\t3. Par \n\t4. Salir");
            System.out.print("Elije una opción de las anteriores: ");
        
            option = Integer.parseInt(scan.nextLine());
            switch(option){
                case 1: //palindromo
                    System.out.print("Introduce una cadena: ");
                    
                    if(esPalindromo(scan.nextLine()))
                        System.out.println("La cadena es un palindromo.");
                    else
                        System.out.println("La cadena no es un palindromo.");
                    break;
                    
                case 2: //primo
                    Numero num = new Numero();
                    
                    System.out.print("Introduce un numero: ");
                    
                    if(num.esPrimo(Integer.parseInt(scan.nextLine())))
                        System.out.println("El numero es primo.");
                    else
                        System.out.println("El numero no es primo.");
                    break;
                    
                case 3: //par
                    System.out.print("Introduce un numero: ");
                    
                    if(Numero.esPar(Integer.parseInt(scan.nextLine())))
                        System.out.println("El numero es par.");
                    else
                        System.out.println("El numero es impar.");
                    break;
                    
                case 4: //salir
                    break;
                    
                default:
                    System.out.println("\f");  
            }
        }while (option < 1 || option > 4);
        
        System.out.println("Fin de proceso.");
    }
    
    public static boolean esPalindromo(String cadena){
        String revCadena = "";
        
        for (int i = cadena.length()-1; i >= 0; i--)
            revCadena += String.valueOf(cadena.charAt(i));
        
        return cadena.equalsIgnoreCase(revCadena);
        
    }
}
