package Ejercicio19;
import java.util.Scanner;

public class Principal
{   
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(){
        Series serieA = porDefecto(), serieB = porTituloGuionista(), serieC = porCompleto();
        
        System.out.println("\nLa serie " + serieA);
        System.out.println("La serie " + serieB);
        System.out.println("La serie " + serieC + "\n");
        
        System.out.println("Fin de proceso.");
    }
    
    private static void askActores(Series serie){
        String[] actores = new String[serie.getActores().length];
        String actor = "";
        int i = 0;
        
        do{
            System.out.printf("[%d/%d] Introduce un actor (x para salir): ", i+1, actores.length);
            actor = scan.nextLine();
            if (!actor.equalsIgnoreCase("x"))
                actores[i] = actor;
                i++;

        }while (!actor.equalsIgnoreCase("x") && i < actores.length);
        
        serie.setActores(actores);
    }
    
    private static Series porDefecto(){
        Series serie = new Series();
        
        System.out.print("\nSERIE A\n");
        System.out.print("Introduce un titulo: ");
        serie.setTitulo(scan.nextLine());
        
        System.out.print("Introduce un guionista: ");
        serie.setGuionista(scan.nextLine());
        
        askActores(serie);
        
        System.out.print("Introduce el precio de taquilla: ");
        serie.setPrecio(Float.parseFloat(scan.nextLine()));
        
        return serie;
        
    }
    private static Series porTituloGuionista(){
        Series serie = new Series("2001: A Space Odyssey", "Arthur C. Clarke");
        
        System.out.print("\nSERIE B\n");
        System.out.print("Introduce un titulo: ");
        serie.setTitulo(scan.nextLine());
        
        System.out.print("Introduce el número de capitulos de la serie: ");
        serie.setCapitulos(Short.parseShort(scan.nextLine()));
        
        System.out.print("Introduce el género \nD = Drama (por defecto), S = Suspense, C = Comedia, T = Terror\n>>  ");
        serie.setGenero(scan.nextLine().charAt(0));
        
        System.out.print("Introduce un guionista: ");
        serie.setGuionista(scan.nextLine());
        
        askActores(serie);
        
        System.out.print("Introduce el precio de taquilla: ");
        serie.setPrecio(Float.parseFloat(scan.nextLine()));
        
        return serie;
    }
    private static Series porCompleto(){
        String[] actores = new String[]{"Jeremy Shada", "John DiMaggio", "Tom Kenny", "Hyden Walch", "Olivia Olson"};
        Series serie = new Series("Adventure Time", (short)283, 'C', "Pendleton Ward", actores, 10f);
        
        System.out.print("\nAñadida SERIE C automáticamente\n");
        
        return serie;
    }
    
    
}
