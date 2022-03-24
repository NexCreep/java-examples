/* ~ ENCAPSULAMIENTO
 *      Por defecto los atributos y metodos son encapsulados dentro del paquete.
 *      Los atributos y metodos "private" son encapsulados a nivel de clase
 *      Los atributos y metodos "protected" son encapsulados a nivel de herencia.
 *      Los atributos y metodos "public" son accesibles desde otros paquetes.
*/

public class Persona
{   
    //Atributos
    private String nif = "";
    private String nombre = "";
    private short edad = 0;
    
    //Metodos
    //Constructores
    Persona(){}
    Persona(String nif, String nombre, short edad){
        this.nif = nif; 
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getter y Setters
    public String getNif(){ return nif; }
    public String getNombre(){ return nombre; }
    public short getEdad(){ return edad; }
    
    public void setNif(String nif){ this.nif = nif; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setEdad(short edad){ this.edad = edad; }
    
    // De proceso/batalla
    public String toString(){
         return nif + " - " + nombre + " - " + edad;
    }
}
