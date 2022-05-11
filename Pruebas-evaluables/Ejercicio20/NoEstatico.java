package Ejercicio20;

public class NoEstatico
{
    protected void mensajeEdad(Persona persona){
        if(persona.esMayorDeEdad()){
             System.out.println("La persona con id " + persona.getId() + " y nombre " + persona.getNombre() + "es mayor de edad");
        }else{
            System.out.println("La persona con id " + persona.getId() + " y nombre " + persona.getNombre() + "NO es mayor de edad");
        }
    }
}
