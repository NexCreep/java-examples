public class Principal
{
    public static void main(){
        Persona personaM = null, personaF = null;
        personaM = new Persona();
        System.out.println(personaM.nif + " " + personaM.nombre + " " + personaM.edad);
        
        personaM = new Persona("57643120P", "Jose", (short)15);
        System.out.println(personaM.nif + " " + personaM.nombre + " " + personaM.edad);
        
        personaF = new Persona("43685379S", "Carla", (short)16);
        System.out.println(personaF.nif + " " + personaF.nombre + " " + personaF.edad);
    }
}
