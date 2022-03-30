package Ejercicios;

/*
 * Pedimos mes y día, y calculamos cuantos dias han pasado desde comienzo de año y cuantos hasta final de año
*/

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Ejercicio3
{
    public static void main(short mes, short dia){
            
        if ((mes <= 12 && mes >= 1) && (dia <= 31 && mes >= 1)){
            GregorianCalendar gc = new GregorianCalendar(2022, mes-1, dia);
        
            System.out.printf("Han pasado %d desde comienzo de año \n", gc.get(Calendar.DAY_OF_YEAR));
            System.out.printf("Faltan %d días hasta final de año \n",365 - gc.get(Calendar.DAY_OF_YEAR));
        }else{
            System.out.println("La fecha dada es incorrecta.");
            
            if (mes > 12 || mes < 1) System.out.println("El mes debe de estar entre 1 y 12. Tu has dado => " + mes);
            if (dia > 31 || dia < 1) System.out.println("El día debe de estar entre 1 y 31. Tu has dado => " + dia);
        }    
        
    }
    
}
