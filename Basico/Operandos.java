/*
 * Aritmeticos
 *  Suma +
 *  Resta -
 *  Multiplicación *
 *  Division /
 *      Trunca en caso de tipo entero
 *      En caso de real y division de enteros, casteo a su tipo, sino trunca dejando un 0 despues de punto
 *  Mod %
 *  
 *  Suma+1 ++
 *  Resta-1 --
 *  
 *  Tambien se permite para añadir x unidades a una variable esto
 *      int var += x | int var -= x
 *  siendo x la unidad a incrementar o decrementar
 *  
 * Comparación
 *  Igualdad ===
 *  Mayor que >
 *  Menor que <
 *  Mayor/Igual >=
 *  Menor/Igual <=
 *  Diferente !=
 *  
 *  Lógicos
 *      AND &&
 *      OR  || (pipe)
 *      NOT  !
 *   (^ es XOR, no es potencia)
 *  
*/
public class Operandos
{   
    public static void main(String[] args){
        int x = 0;
        
        x++;
        x+=6;
        
        System.out.println(x);
        
    }
}
