package Ejercicio20;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class GestionPersona
{
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(){
        System.out.print("Introduce nombre: ");
        String nombre = scan.nextLine();
        
        GregorianCalendar fechaNac = askFechaNac();
        
        System.out.print("Introduce sexo: ");
        char sexo = scan.nextLine().charAt(0);
        
        System.out.print("Introduce peso: ");
        float peso = Float.parseFloat(scan.nextLine()) ;
        
        System.out.print("Introduce altura: ");
        float altura = Float.parseFloat(scan.nextLine());
        
        String[] aficiones = askAficiones();
        
        //(String nombre, GregorianCalendar fechaNac, char sexo, float peso, float altura, String[] aficiones)
        //(nombre, fechaNac, sexo, peso, altura, aficiones)
        
        porDefecto(nombre, fechaNac, sexo, peso, altura, aficiones);
        newPesonaA(nombre, fechaNac, sexo, peso, altura, aficiones);
        newPesonaB(nombre, fechaNac, sexo, peso, altura, aficiones);
    }
    
    private static String[] increaseArray(String[] array){
        String[] aux = new String[array.length];
        System.arraycopy(array, 0, aux, 0, array.length);
        
        array = new String[array.length+1];
        System.arraycopy(aux, 0, array, 0, aux.length);
        
        return array;
    }
    
    private static GregorianCalendar askFechaNac(){
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
    

    
    private static String[] askAficiones(){
        final String BREAK_POINT = "X";
        
        String[] aficiones = new String[1];
        
        System.out.print("Introduce un nombre ('X' para salir): ");
        String aficion = scan.nextLine();
        if(!aficion.equalsIgnoreCase(BREAK_POINT)){
            aficiones[0] = aficion;
            
            int i = 1;
            do{
                System.out.print("Introduce un nombre ('X' para salir): ");
                aficion = scan.nextLine();
                if(!aficion.equalsIgnoreCase(BREAK_POINT)){
                    aficiones = increaseArray(aficiones);
                    aficiones[i] = aficion;
                    i++;
                }
                
            }while(!aficion.equalsIgnoreCase(BREAK_POINT));
        }
        
        return aficiones;
    }
    
    
    private static void porDefecto(String nombre, GregorianCalendar fechaNac, char sexo, float peso, float altura, String[] aficiones){
        Persona persona = new Persona();
        Estatico.mensajePeso(persona);
        
        NoEstatico noSta = new NoEstatico();
        noSta.mensajeEdad(persona);
    }
    
    private static void newPesonaA(String nombre, GregorianCalendar fechaNac, char sexo, float peso, float altura, String[] aficiones){
        Persona persona = new Persona(nombre, fechaNac, sexo);
        Estatico.mensajePeso(persona);
        
        NoEstatico noSta = new NoEstatico();
        noSta.mensajeEdad(persona);
    }
    
    private static void newPesonaB(String nombre, GregorianCalendar fechaNac, char sexo, float peso, float altura, String[] aficiones){
        Persona persona = new Persona(nombre, fechaNac, sexo, peso, altura, aficiones);
        Estatico.mensajePeso(persona);
        
        NoEstatico noSta = new NoEstatico();
        noSta.mensajeEdad(persona);
    }
    
}