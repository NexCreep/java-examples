package Ejercicio20;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class GestionPersona
{
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(){
        
        
    }
    
    public static Object[] increaseArray(Object[] array){
        Object[] aux = new Object[array.length];
        System.arraycopy(array, 0, aux, 0, aux.length);
        
        array = new Object[array.length+1];
        System.arraycopy(aux, 0, array, 0, array.length);
        
        return array;
    }
    
    public static GregorianCalendar askFechaNac(){
        short año = 0;
        byte mes = 0, dia = 0;
        
        do{
            System.out.print("Introduce el año: ");
            año = Short.parseShort(scan.nextLine());
        }while (año < 1970);
        
        do{
            System.out.print("Introduce el mes: ");
            mes = Byte.parseByte(scan.nextLine());
        }while (mes < 1 || mes > 12);
        
        do{
            System.out.print("Introduce el día: ");
            dia = Byte.parseByte(scan.nextLine());
        }while (dia < 1 || dia > 31);
        
        return new GregorianCalendar(año, mes-1, dia);
    }
    

    
    public static String[] askAficiones(){
        final String BREAK_POINT = "X";
        
        String[] aficiones = new String[1];
        int i = 0;
        
        System.out.print("Introduce un nombre ('X' para salir): ");
        String aficion = scan.nextLine();
        
        while(aficion.equalsIgnoreCase(BREAK_POINT)){
            if ()
            aficiones[i] = aficion
        }
        
        return aficiones;
    }
    
    
    public static void porDefecto(){
        
    }
    
}