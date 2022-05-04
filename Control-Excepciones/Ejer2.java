public class Ejer2
{
    public static void main(){
        int a = 0;
        int b = 100;
        
        try{
            int c = b/a;
        }
        catch(ArithmeticException ae){
            throw ae;
        }
        
        System.out.println("Programa finalizado");
    }
}
