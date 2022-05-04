public class Excepciones
{
    public static void main(){
        int[] nums = new int[4];
        
        try{
             System.out.println("Ante de la excepcion");
             nums[4]=10;
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Indice fuera de los limites");
            
        }finally{
            System.out.println("Despues de que se genere la excepcion");
        }
    }
}
