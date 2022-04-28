package EjerAnimales;

public class GestionAnimales
{
    public static void main(){
        Vaca torola = new Vaca();
        torola.ver(torola.getNombre());
        torola.comer(5.2f, "hierba");
        torola.desplazar(500.0f);
        torola.beber();
        
        Serpiente arthur = new Serpiente();
        arthur.ver(arthur.getNombre());
        arthur.comer(0.005f, "carne");
        arthur.desplazar(50.0f);
        torola.beber();
        
        Paloma juani = new Paloma();
        juani.ver(juani.getNombre());
        juani.comer(0.002f, "pan");
        juani.desplazar(1f);
        juani.beber();
        
    }
}
