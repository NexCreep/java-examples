package EjerAnimales;

public abstract class Animal
{
    public void ver(String animal){ System.out.println(animal + " mira su entorno."); };
    
    public abstract void comer(float cantidad, String comida);
    public abstract void desplazar(float distancia);
    public abstract void beber();

   
}
