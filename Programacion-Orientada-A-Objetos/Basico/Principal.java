public class Principal
{
    public static void main(){
        Persona personaM = null;
        personaM = new Persona();
        
        System.out.println(personaM);
        
        personaM.setNif("11111111S");
        personaM.setNombre("Juan Carlo Chupapija");
        personaM.setEdad((short)666);
        
        System.out.println(personaM);
        
        personaM = new Persona("57643120P", "Jose", (short)15);
        System.out.println(personaM);
        
        Persona personaF = new Persona("43685379S", "Carla", (short)16);
        System.out.println(personaF);
    }
}
