/*
 * Practica de metodos
 *      Método booleano para indicar si un año es bisiesto
 *      Método para imprimir si un año es bisiesto
 *      Método para enmarcar una literal. Ejemplo:
 *          **********
 *          * Pepito *
 *          **********
 *      
*/
public class Ejercicio2
{   
    public static void main(){
        
        System.out.println("-- Static en propio fuente");
        if(isBis((short)2023))
            System.out.println("El año introducido es bisiesto.");
        else
            System.out.println("El año introducido no es bisiesto.");
            
        sayBis((short)2024);
        
        frame("Ñ");
        
        
        System.out.println("\n-- Con un objeto");
        ClaseA2 objA2 = new ClaseA2();
        
        if(objA2.isBis((short)2023))
            System.out.println("El año introducido es bisiesto.");
        else
            System.out.println("El año introducido no es bisiesto.");
            
        objA2.sayBis((short)2024);
        
        objA2.frame("Ñ");
        
        
        System.out.println("\n-- Con una clase");
        if(ClaseStaticA2.isBis((short)2023))
            System.out.println("El año introducido es bisiesto.");
        else
            System.out.println("El año introducido no es bisiesto.");
            
        ClaseStaticA2.sayBis((short)2024);
        
        ClaseStaticA2.frame("Ñ");
        
    }
    
    private static boolean isBis(short year){
        return year % 4 == 0;
    }
    
    private static void sayBis(short year){
        if (year % 4 == 0)
            System.out.printf("El año %d es bisiesto.\n", year);
        else
            System.out.printf("El año %d no es bisiesto.\n", year);
    }
    
    private static String frameBorder(int limit){
        int limitCorned = limit + 4;
        char borderStyle = '*';
        String border = "";
        
        for (int i = 1; i <= limitCorned; i++)
            border += borderStyle;
        
        return border;
    }
    private static void frame(String toFrame){
        char borderStyle = '*';
        String border = frameBorder(toFrame.length());
        
        System.out.println(border);
        System.out.printf("%1$c %2$s %1$c\n", borderStyle, toFrame);
        System.out.println(border);
    }
    
    
}
