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
        final long msOfADay = 24 * 3600 * 1000;
        
        
        // Si la proxima pandemia sera el 23 de marzo de 2025, ¿cuantos dias quedan?        
        GregorianCalendar start = new GregorianCalendar();
        GregorianCalendar finish = new GregorianCalendar(2025, 2, 23);
        
        long msFromTo = finish.getTimeInMillis() - start.getTimeInMillis();
        long aux = 0;
        
        
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
        
        System.out.println("Faltan " + aux + " dias hasta la proxima pandemia.");
        
        
        // Esta pandemia empezo el 21 de marzo de 2020, ¿cuantos dias han transcurrido?
        start = new GregorianCalendar(2020, 2, 21);
        finish = new GregorianCalendar();
        
        msFromTo = finish.getTimeInMillis() - start.getTimeInMillis();
        aux = 0;
        
        
        manyBis = 0;
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
        
        System.out.println("Han transcurrido " + aux + " dias desde inicio de pandemia.");
        
        
        //En 2250 dias Putin invade espana, ¿que fecha sera esa?
        start = new GregorianCalendar();
        short days = 2250;
        int daysInMillis = (int)(days * msOfADay);
        
        long finalMillis = start.getTimeInMillis() + daysInMillis;
        
        System.out.println(start.getTimeInMillis() + " + " + daysInMillis + "(" + msOfADay + ")" + " = " + finalMillis);
        
        finish = new GregorianCalendar();
        finish.setTimeInMillis(finalMillis);
        
        System.out.printf("El dia %tc Putin invadira Espana.", finish);
        
        
    }
}
