package Ejercicios;

/*
 * Si la proxima pandemia sera el 23 de marzo de 2025, ¿cuantos dias quedan?
 * Esta pandemia empezo el 21 de marzo de 2020, ¿cuantos dias han transcurrido?
 * En 2250 dias Putin invade espana, ¿que fecha sera esa?
*/
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Ejercicio4
{
    public static void main(){
        GregorianCalendar start = new GregorianCalendar();
        GregorianCalendar finish = new GregorianCalendar(2025, 2, 23);
        
        long msFromTo = finish.getTimeInMillis() - start.getTimeInMillis();
        long aux = 0;
        
        final long msOfADay = 24 * 3600 * 1000;
        byte manyBis = 0;
        for (int i=start.get(Calendar.YEAR); i<=finish.get(Calendar.YEAR); i++)
            if (i % 4 == 0) manyBis++;
        
        msFromTo = msFromTo + (msOfADay * manyBis);
        
        if(msFromTo >= 1000)
            aux = msFromTo / 1000; // Segundos
            if (aux >= 60)
                aux = aux / 60; // Minutos
                if (aux >= 60)
                    aux = aux / 60; // Horas
                    if (aux >= 24)
                        aux = aux / 24; // Dias
        
        System.out.println("Faltan " + aux + " dias.");
        
        
    }
}
