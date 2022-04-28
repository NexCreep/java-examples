package EjerAnimales;

public class Serpiente extends Animal
{
    private String nombre = "Serpiente";
    
    public Serpiente(){}
    public Serpiente(String nombre){ this.nombre = nombre; }
    
    public void comer(float cantidad, String comida){
        System.out.println("La " + nombre + " come " + cantidad + "kg de " + comida);
    }
    public void desplazar(float distancia){
        System.out.println("La " + nombre + " se desplaza " + distancia + "m");
    }
    public void beber(){
        System.out.println("La " + nombre + " bebe agua ");
    }
    
    public String getNombre(){ return nombre; }
}
