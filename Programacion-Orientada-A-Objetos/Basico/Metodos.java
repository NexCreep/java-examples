public class Metodos
{
    public static void main(){
        System.out.println("INTEGER");
        int num = 3;
        ParamMetodos.mEntero(num);
        System.out.println(num);
        
        System.out.println("\nSTRING");
        String str = "Juan";
        ParamMetodos.mCadena(str);
        System.out.println(str);
        
        System.out.println("\nOBJECT");
        Clase clase = new Clase("Juana");
        ParamMetodos.mObjeto(clase);
        System.out.println(clase.getNombre());
        
        System.out.println("\nARRAY");
        int[] aNum = new int[3];
        ParamMetodos.mArray(aNum);
        System.out.println(aNum[0]);
    }
    
}

class ParamMetodos
{
    public static void mEntero(int num){
        System.out.println(num);
        num++;
        System.out.println(num);
    }
    
    public static void mCadena(String str){
        System.out.println(str);
        str = "Pepito";
        System.out.println(str);
    }
    
    public static void mObjeto(Clase c){
        System.out.println(c.getNombre());
        c.setNombre("Pepa");
        System.out.println(c.getNombre());
    }
    
    public static void mArray(int[] aNum){
        System.out.println(aNum[0]);
        aNum[0] = 99;
        System.out.println(aNum[0]);
    }
    
}
