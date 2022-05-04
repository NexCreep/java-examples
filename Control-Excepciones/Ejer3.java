import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ejer3
{
    private static Integer[] nums = new Integer[6];
    private static final Scanner scan = new Scanner(System.in);
    
    private static void setNums() throws NumberFormatException{
        for (int i = 0; i < nums.length; i++){
                System.out.printf("[%d/%d] -> ", i+1, nums.length);
                nums[i] = Integer.parseInt(scan.nextLine());
        }
    }
    
    public static void main(){
        try{
            setNums();
        }
        catch(NumberFormatException err){
            System.out.println("Debes de introducir un numero");
        }
        finally {
            System.out.println(nums.toString());
            Arrays.sort(nums, Collections.reverseOrder());
            System.out.println("El mayor numero es " + nums[0]);
        }
        
    }
}
