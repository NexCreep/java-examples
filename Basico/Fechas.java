/* 
 * Paquete java.util:
 *      Clase GregorianCalendar // Más utilizado
 *      Clase Date (Disaproved) // Construye una fecha
 *      Clase Locale //Clase para establecer formatos u obtener los predefinidos
 *      
 * Paquete java.text:
 *      Clase DateFormat //Formatear fechas
 * 
 * 
 * GregorianCalendar
 *      ~ Constructores
 *          GregorianCalendar()
 *                           (año, mes {0 = Enero}, día)
 *                           (año, mes, dia, hh, mm, ss)
 *      ~ Metodos
 *          gc.get(Calendar.DAY_OF_WEEK) => int (Devuelve el numero del dia de la semana, en formato anglosajón [De Domingo a Sabado])
 *          gc.get(Calendar.DAY_OF_MONTH) => int (Devuelve el numero del dia del mes)
 *          gc.get(Calendar.DAY_OF_YEAR) => int (Devuelve el numero del dia del año)
 *          gc.get(Calendar.DAY_OF_WEEK_IN_MONTH) => int (Si estamos a 30/03 de 2022, no devolveria 5, es decir, 5º miercoles del mes)
 *          gc.get(Calendar.WEEK_OF_MONTH) => int (Devuelve el numero de la semana del mes)
 *          gc.get(Calendar.WEEK_OF_YEAR) => int (Devuelve el numero de la semana del año)
 *          gc.get(Calendar.MONTH) => int (Devuelve el numero de mes)[Enero es 0]
 *          gc.get(Calendar.YEAR) => int (Devuelve el año)
 *          gc.get(Calendar.AM_PM) => int (Devuelve el si antes o despues del mediodia [0 am, 1 pm])
 *          gc.get(Calendar.HOUR) => int (Devuelve la hora [O a 11])
 *          gc.get(Calendar.HOUR_OF_DAY) => int (Devuelve la hora del día [O a 23])
 *          gc.get(Calendar.MINUTE) => int (Devuelve los minutos [0-59])
 *          gc.get(Calendar.SECOND) => int (Devuelve los second [0-59])
 *          
*/
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Fechas
{
    public static void main(){
        Date hoy = new Date();
        
        System.out.println(hoy);
        System.out.printf("%tc\n", hoy);
        
        Locale spanish = new Locale("es", "ES", "Traditional_WIN");
        DateFormat formats = DateFormat.getDateInstance(DateFormat.SHORT, spanish);
        
        System.out.println(formats.format(hoy));
        
        
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        
        Date date = gc.getTime();
        
        GregorianCalendar gc2 = new GregorianCalendar(2001, 12-1, 13, 06, 00, 00);
        System.out.println(gc2.get(Calendar.AM_PM));
        
        
    }
    
}
