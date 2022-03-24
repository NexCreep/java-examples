
public class ClaseAEjer1
{
   
    private String nif = "";
    private String nombre = "";
    private short edad = 0;
    private char letraPiso;
    
    ClaseAEjer1(String nif, String nombre, short edad, char letraPiso){
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
        this.letraPiso = letraPiso;
    }
    
    public String getNif(){ return nif; }
    public String getNombre(){ return nombre; }
    public short getEdad(){ return edad; }
    public char getLetraPiso(){ return letraPiso; }
    
    public void setNif(String nif){ this.nif = nif; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setEdad(short edad){ this.edad = edad; }
    public void setLetraPiso(char letraPiso){ this.letraPiso = letraPiso; }
    
    
    
}
