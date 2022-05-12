public class ClaseEnum
{
    public static void main(){
        Enum diaM = Enum.MONDAY;
        
        System.out.println(diaM.name());
        System.out.println(Enum.THURSDAY);
        System.out.println(Enum.THURSDAY.ordinal());
        
        Enum[] dias = Enum.values();
        for(Enum dia : dias){
            System.out.println(dia);
        }
    }
}
