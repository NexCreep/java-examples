public class Clase
{
    final public static double PI = 3.1415;
    private static int num = 0;
    private String nombre = "";
    
    Clase(String nombre){
        num++;
        this.nombre=nombre;
    }
    
    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; };
    
    public String toString(){
        return num + " " + nombre;
    }
    public Clase clone()  {
        return new Clase(nombre);
    }
}
