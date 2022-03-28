/* 
 * Paquete java.util:
 *      Clase GregorianCalendar
 *      Clase Date (Disaproved)
 *      Clase Locale //Clase para establecer formatos u obtener los predefinidos
 *      
 * Paquete java.text:
 *      Clase DateFormat //Formatear fechas
*/
import java.util.GregorianCalendar;
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
    }
    
}
