import java.util.Scanner;
/*
 * A partir de una clase utilizada con anterioridad, genera sus metodos getter y setter.
 * Luego instancia la clase dentro de un objeto, después muestra sus atributos por pantalla
 * A continuación modifica los atributos y mustralos de nuevo por pantalla
*/
public class Ejercicio1
{
    public static void main() throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        ClaseAEjer1 persona = new ClaseAEjer1("51487216K", "María", (short)22, 'B');
        
        System.out.println(persona);
        
        System.out.print("Nif: ");
        persona.setNif(scanner.nextLine());
        
        System.out.print("Nombre: ");
        persona.setNombre(scanner.nextLine());
        
        System.out.print("Edad: ");
        persona.setEdad(Short.parseShort(scanner.nextLine()));
        
        System.out.print("Letra del piso: ");
        persona.setLetraPiso(scanner.nextLine().charAt(0));
        
        System.out.println(persona);
        
    }
    
   
};