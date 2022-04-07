/* ~ ENCAPSULAMIENTO
 *      Por defecto los atributos y metodos son encapsulados dentro del paquete.
 *      Los atributos y metodos "private" son encapsulados a nivel de clase
 *      Los atributos y metodos "protected" son encapsulados a nivel de herencia.
 *      Los atributos y metodos "public" son accesibles desde otros paquetes.
 *      
 * ~ METODOS DE PROCESO o METODOS
 *     * Composición
 *       [especificadores] [tipo_devuelto] nombre_metodo([argumento_tipo argumento_nombre,...])[throw excepcion,...]{
 *                  [sentencias]
 *                  [(opcional solo en metodos que actuen como procedimientos) return] 
 *       }
 *       Ejs.:
 *          public static void main(String[] args) throws Exception{
 *              System.out.println("Hola mundo");
 *          }
 *          public String getNombre(){ return this.nombre; }
 *          public void setNombre(String nombre){ this.nombre = nombre; }
 *          public int suma(int a, int b){
 *              return a + b;
 *          }
 *          
 *       - Especificadores
 *          De acceso (private, public, protected, o ninguno)
 *          
 *       - Tipos de devolucion
 *          void
 *          Primitivos (int, float, char, boolean, ...)
 *          Objetos
 *          
 *     * Implementación
 *          1º.- ¿Que tengo que hacer?
 *              - Tarea u obtener un valor
 *                  Tarea = void
 *                  Obtencion = Primitivos u objetos
 *              - Entrada de datos
 *                  Internas (El metodo se encarga  de obtenerla)
 *                  Externa (Por argumentos)
 *              - Salida de datos
 *              - Pruebas
 *          
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
