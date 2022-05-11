package Ejercicio20;

public class NoEstatico
{
    protected void mensajeEdad(Persona persona){
        String negacion = "";
        if(!persona.esMayorDeEdad()) negacion = "NO ";
        System.out.printf("La persona con id %s y nombre %s %ses mayor de edad\n", persona.getId(), persona.getNombre(), negacion);
             
    }
}
