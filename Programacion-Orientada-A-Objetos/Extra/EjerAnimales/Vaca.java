package EjerAnimales;

public class Vaca extends Animal
{
    private String nombre = "Vaca";
    
    public Vaca(){}
    public Vaca(String nombre){ this.nombre = nombre; }
    
    public void tipo(){ System.out.println(); };
    
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
