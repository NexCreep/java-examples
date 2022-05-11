package Ejercicio20;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class TestPersona
{
    public static void main(){
        Persona persona = new Persona("Hola", new GregorianCalendar(2001, 11, 13), 'h');
        NoEstatico noEst = new NoEstatico();
        noEst.mensajeEdad(persona);
        
    }
    
}
