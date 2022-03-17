package Ejercicios;
/*
 * Solicitamos el numeor de elementos del array y añadimos al array los multiplos de 7.
 * 
 * Nº elementos array: _15_
 * Número: _3_
 * Número: _14_
 * Número: _7_
 * Número: _8_
 * Número: _15_
 * Número: _21_
 * ...
*/
import java.util.Scanner;

public class Ejercicio1
{
    public static void main(){
        Scanner sc = new Scanner(System.in, "UTF-8");
        
        System.out.print("Nº elementos array: ");
        final int size = Integer.parseInt(sc.nextLine());
        
        int[] uArray = new int[size];
        int uNum = 0;
        int i = 0;
        while(i<uArray.length){
            System.out.print("Número: ");
            uNum = Integer.parseInt(sc.nextLine());
            if(uNum % 7 == 0){
                uArray[i] = uNum;
                i++;
            }
        }        
    }
    
}
