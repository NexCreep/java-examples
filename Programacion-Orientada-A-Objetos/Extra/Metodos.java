/*
 * Los tipos primitivo y la clase String se pasa el valor
 * En los objetos y demas tipos especiales como array o collection, se pasa la referencia
 * 
 * Para evitar el paso de la referencia de un array, hay que utilizar el metodo no estatico array.clone()
 * Lo mismo pasaria con un objeto, solo que este caso la clase del objeto deberia contener un metodo que clone la instancia
*/

public class Metodos
{
    public static void main() {
        System.out.println("INTEGER");
        int num = 3;
        mEntero(num);
        System.out.println(num);
        
        System.out.println("\nSTRING");
        String str = "Juan";
        mCadena(str);
        System.out.println(str);
        
        System.out.println("\nOBJECT NO CLONE");
        Clase clase = new Clase("Juana");
        mObjeto(clase);
        System.out.println(clase.getNombre());
        
        System.out.println("\nOBJECT CLONE");
        clase = new Clase("Juana");
        mObjeto(clase.clone());
        System.out.println(clase.getNombre());
        
        System.out.println("\nARRAY NO CLONE");
        int[] aNum = new int[3];
        mArray(aNum);
        System.out.println(aNum[0]);
        
        System.out.println("\nARRAY CLONE");
        aNum = new int[3];
        mArray(aNum.clone());
        System.out.println(aNum[0]);
    }
    
    private static void mEntero(int num){
        System.out.println(num);
        num++;
        System.out.println(num);
    }
    
    private static void mCadena(String str){
        System.out.println(str);
        str = "Pepito";
        System.out.println(str);
    }
    
    private static void mObjeto(Clase c){
        System.out.println(c.getNombre());
        c.setNombre("Pepa");
        System.out.println(c.getNombre());
    }
    
    private static void mArray(int[] aNum){
        System.out.println(aNum[0]);
        aNum[0] = 99;
        System.out.println(aNum[0]);
    }
    
}
