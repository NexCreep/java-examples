package Ejercicio20;

public class Estatico
{
    public static void mensajePeso(Persona persona){
        if (persona.calcularIMC() == 0){
            System.out.println("La persona con id " + persona.getId() + " y nombre " + persona.getNombre() + " esta en su peso ideal");
        }else{
            System.out.println("La persona con id " + persona.getId() + " y nombre " + persona.getNombre() + " NO esta en su peso ideal");
        }
    }
}
