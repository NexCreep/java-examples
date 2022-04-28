public class ClaseConInterfaz implements InterfazA, InterfazB
{
    public void imprimirMensajeA(String mensaje){
        System.out.println(InterfazC.mensajeA + " - " + mensaje);
    }
    
    public void imprimirMensajeB(String mensaje){
        System.out.println(InterfazC.mensajeB + " - " + mensaje);
    }
}
