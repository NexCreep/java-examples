
public class Numero
{
    public boolean esPrimo(int num){
        int divCont = 1;
        int divCant = 0;
        while (divCont <= num && divCant <= 2){
            if(num % divCont == 0) divCant++;
            divCont++;
        }
        
        return divCant == 2;
    }
    
    public static boolean esPar(int num){
        return num % 2 == 0;
    }
}
