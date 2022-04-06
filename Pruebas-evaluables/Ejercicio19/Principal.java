package Ejercicio19;

public class Principal
{
    public static void main(){
        Series serieA = new Series("Human Resources", "Un fumado");
        
        System.out.println(serieA);
        
        serieA.setActores(new String[]{"Crackhead", "un tio", "otro tio", "ahora una tia", "mama?"});
        System.out.println(serieA);
        
        serieA.setGenero('C');
        System.out.println(serieA.getGenero());
    }
}
