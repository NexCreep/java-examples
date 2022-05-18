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
        
        Enum actual = Enum.WEDNESDAY;
        Enum mañana = Enum.THURSDAY;
        
        System.out.println(actual.compareTo(mañana));
        System.out.println(actual.compareTo(dias[actual.ordinal()]));
        
        System.out.println(actual.equals(mañana));
        System.out.println(actual.equals(dias[actual.ordinal()]));
        
        
    }
}
