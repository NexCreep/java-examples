
public class ClaseA2
{
    private char borderStyle = '*';
    
    public boolean isBis(short year){
        return year % 4 == 0;
    }
    
    public void sayBis(short year){
        if (year % 4 == 0)
            System.out.printf("El año %d es bisiesto.\n", year);
        else
            System.out.printf("El año %d no es bisiesto.\n", year);
    }
    
    private String frameBorder(int limit){
        int limitCorned = limit + 4;
        
        String border = "";
        
        for (int i = 1; i <= limitCorned; i++)
            border += borderStyle;
        
        return border;
    }
    public void frame(String toFrame){
        String border = frameBorder(toFrame.length());
        
        System.out.println(border);
        System.out.printf("%1$c %2$s %1$c\n", borderStyle, toFrame);
        System.out.println(border);
    }
}
