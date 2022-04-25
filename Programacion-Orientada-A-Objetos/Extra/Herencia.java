/*
 * La herencia es la capacidad que tienen las clases para heredar 
 * atributos y metodos de otra clase.
 * 
 *      -------------
 *      | Atributos |
 *      -------------
 *      |  Métodos  |
 *      -------------
 *  Empleado
 *      nombre |
 *      dni    | <- Comunes
 *      segSoc |
 *      
 *  Comercial (Empleado)
 *      dietas
 *      
 *  Mozo (Empleado)   
 *      hExtra
 *
*/

public class Herencia
{
    public static void main(){
        Comercial comercial = new Comercial("Juan", "11111111Y", "584169521478362", 50.80f);
        
        System.out.println(comercial);
    }
    
}

class Empleado{
    private String nombre = "";
    private String dni = "";
    private String segSoc = "";
    
    public Empleado(String nombre, String dni, String segSoc){
        this.nombre = nombre;
        this.dni = dni;
        this.segSoc = segSoc;
    }
    
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setDni(String dni){ this.dni = dni; }
    public void setSegSoc(String segSoc){ this.segSoc = segSoc; }
    
    public String getNombre(){ return nombre; }
    public String getDni(){ return dni; }
    public String getSegSoc(){ return segSoc; }
    
    public String toString(){
        return nombre + " - " + dni + " - " + segSoc;
    }
    
}

class Comercial extends Empleado {
    private float dietas = 0f;
    
    public Comercial(String nombre, String dni, String segSoc, float dietas){
        super(nombre, dni, segSoc);
        this.dietas = dietas;
    }
    
    public void setDietas(float dietas){ this.dietas = dietas; }
    
    public float getDietas(){ return dietas; }
    
    public String toString(){
        return super.toString() + " - " + String.valueOf(dietas);
    }
    
}
class Mozo extends Empleado {
    private int hExtra = 0;
    
    public Mozo(String nombre, String dni, String segSoc, int hExtra){
        super(nombre, dni, segSoc);
        this.hExtra = hExtra;
    }
    
    public void setHExtra(int hExtra){ this.hExtra = hExtra; }
    
    public int getHExtra(){ return hExtra; }
    
    public String toString(){
        return super.toString() + " - " + String.valueOf(hExtra);
    }
}


