package Ejercicio20;

import java.util.GregorianCalendar;
import java.util.Arrays;

public class Persona
{
    private final char[] sexos = new char[]{'H', 'M'};
    
    private String id = "";
    private String nombre = "";
    private GregorianCalendar fechaNac;
    private char sexo = sexos[1];
    private float peso = 0f;
    private float altura = 0f;
    private String[] aficiones = new String[1];
    
    
    Persona(){}
    
    Persona(String nombre, GregorianCalendar fechaNac, char sexo){
        this.nombre = nombre;
        this.fechaNac = new GregorianCalendar(fechaNac.YEAR, fechaNac.MONTH, fechaNac.DAY_OF_MONTH);
        comprobarSexo(sexo);
    }
    
    Persona(String nombre, GregorianCalendar fechaNac, char sexo, float peso, float altura, String[] aficiones){
        this.nombre = nombre;
        this.fechaNac = new GregorianCalendar(fechaNac.YEAR, fechaNac.MONTH, fechaNac.DAY_OF_MONTH);
        
        comprobarSexo(sexo);
        
        this.peso = peso;
        this.altura = altura;
        
        this.aficiones = new String[aficiones.length];
        System.arraycopy(aficiones, 0, this.aficiones, 0, this.aficiones.length);
        
    }
    
    protected void comprobarSexo(char sexo){
        Arrays.sort(sexos);
        if ( Arrays.binarySearch(sexos, sexo) >= 0 )
            this.sexo = sexo;
        else
            System.out.printf("El sexo %c no se contempla, insertando 'M' por defecto");
        
    }
    
    protected int calcularIMC(){
        final byte MIN_WEIGHT = 20, MAX_WEIGHT = 50;
        
        int ideal = 0;
        float indiceMC = peso / (float)Math.pow(altura, 2);
        if (indiceMC >= MIN_WEIGHT){
            if (indiceMC <= MAX_WEIGHT)
                ideal = 0;
            else
                ideal = 1;
        }
        else{
            ideal = -1;
        }
        
        return ideal;
    }
    
    protected boolean esMayorDeEdad(){
        GregorianCalendar now = new GregorianCalendar();
        
        long ageMillis = now.getTimeInMillis() - fechaNac.getTimeInMillis();
        
        int age = ageMillis / 1000 / 86400 / 30 / 12;
        
        
    }
    
}
