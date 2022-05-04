public class ThrowThrows
{
    static void demoproc() throws IllegalAccessException {
        System.out.println("Antes de lanzar la excepcion");
        throw new IllegalAccessException("demo");
    }
    
    public static void main(){
        try{
            demoproc();
        }
        catch(IllegalAccessException e) {
            System.out.println("Capturado: " + e);
        }
    }
}
