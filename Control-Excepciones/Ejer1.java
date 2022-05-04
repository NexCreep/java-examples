public class Ejer1
{
    public static void main(){
        int a = 0;
        int b = 100;
        
        try{
            int c = b/a;
        }
        catch(ArithmeticException ae){
            System.out.println("Se ha producido un error");
        }
        
        System.out.println("Programa finalizado");
    }
}
