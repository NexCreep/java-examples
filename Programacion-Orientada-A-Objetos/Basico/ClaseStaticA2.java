
public class ClaseStaticA2
{
    public static boolean isBis(short year){
        return year % 4 == 0;
    }
    
    public static void sayBis(short year){
        if (year % 4 == 0)
            System.out.printf("El año %d es bisiesto.\n", year);
        else
            System.out.printf("El año %d no es bisiesto.\n", year);
    }
    
    private static String frameBorder(int limit){
        int limitCorned = limit + 4;
        char borderStyle = '*';
        String border = "";
        
        for (int i = 1; i <= limitCorned; i++)
            border += borderStyle;
        
        return border;
    }
    public static void frame(String toFrame){
        char borderStyle = '*';
        String border = frameBorder(toFrame.length());
        
        System.out.println(border);
        System.out.printf("%1$c %2$s %1$c\n", borderStyle, toFrame);
        System.out.println(border);
    }
}
