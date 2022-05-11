package Ejercicio20;

import java.util.GregorianCalendar;
import java.util.Arrays;
import java.util.Random;

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
    
    
    Persona(){
        id = generarIndetificador();
    }
    
    Persona(String nombre, GregorianCalendar fechaNac, char sexo){
        id = generarIndetificador();
        this.nombre = nombre;
        this.fechaNac = new GregorianCalendar(fechaNac.YEAR, fechaNac.MONTH, fechaNac.DAY_OF_MONTH);
        comprobarSexo(sexo);
    }
    
    Persona(String nombre, GregorianCalendar fechaNac, char sexo, float peso, float altura, String[] aficiones){
        id = generarIndetificador();
        this.nombre = nombre;
        this.fechaNac = new GregorianCalendar(fechaNac.YEAR, fechaNac.MONTH, fechaNac.DAY_OF_MONTH);
        
        comprobarSexo(sexo);
        
        this.peso = peso;
        this.altura = altura;
        
        this.aficiones = new String[aficiones.length];
        System.arraycopy(aficiones, 0, this.aficiones, 0, this.aficiones.length);
        
    }
    
    protected String getId(){ return this.id; }
    protected String getNombre(){ return this.nombre; };
    protected GregorianCalendar getFechaNac(){ return this.fechaNac; };
    protected char getSexo(){ return this.sexo; }
    protected float getPeso(){ return this.peso; }
    protected float getAltura(){ return this.altura; }
    protected String[] getAficiones(){ return this.aficiones; }
    
    protected void setNombre(String nombre){ this.nombre = nombre; }
    protected void setFechaNac(GregorianCalendar fechaNac){ this.fechaNac = new GregorianCalendar(fechaNac.YEAR, fechaNac.MONTH, fechaNac.DAY_OF_MONTH); }
    protected void setSexo(char sexo){ comprobarSexo(sexo); }
    protected void setPeso(float peso) { this.peso = peso; }
    protected void setAltura(float altura){ this.altura = altura; }
    protected void setAficiones(String[] aficiones){ 
        this.aficiones = new String[aficiones.length];
        System.arraycopy(aficiones, 0, this.aficiones, 0, this.aficiones.length);
    }
    
    private String generarIndetificador(){
        Random random = new Random();
        int id = 0;
        do{
            id = random.nextInt(999999);
        }while (id < 99999);
        return String.valueOf(id);
    }
    
    private void comprobarSexo(char sexo){
        Arrays.sort(sexos);
        if ( Arrays.binarySearch(sexos, Character.toUpperCase(sexo)) >= 0 )
            this.sexo = sexo;
        else
            System.out.printf("El sexo %c no se contempla, insertando 'M' por defecto", sexo);
        
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
        int age = (int)ageMillis / 1000 / 86400 / 30 / 12;
        
        
        return age >= 18;
    }

    public String toString(){
        return "Persona(id=" + id + "){nombre=" + nombre + ";fechaNac=" + fechaNac.YEAR + "/" + fechaNac.MONTH+1 + "/" + fechaNac.DAY_OF_MONTH + "}";
    }
    
}
