/*
 * Colecciones de longitud fija
 *  ~Arrays
 *      |*|*|*|*|*|
 *       0 1 2 3 4 <- Indices
 *       
 *       Tamaño = 6
 *   Declaraciones
 *     - tipo[] nombre = new tipo[TAM]; (Preferible)
 *     - tipo[] nombre = new tipo[TAM]{valor,...};
 *     - tipo nombre[];
 *     
 *   La inicialización es automática.
 *   Te permite darle tamaño en ejecucion.
 *   
 *   Acceso
 *      A valor = nombre[indice] => x
 *      A tamaño = nombre.length => int
 *      
 *   Clase Arrays
 *      Al ser objetos, si por ejemplo tenemos el objeto array A igualado con B, si modificamos uno, surtira efecto en ambos.
 *          System.arraycopy(arrayO, posO, arrayF, posF, n_elementos);
 *      Otros metodos estaticos
 *          - Arrays.sort(array) => void [Orderna el array de forma ascendente]
 *          - Arrays.sort(array, pos, elemento) => void [Ordena desde una posicion a un elemento]
 *          - Arrays.binarySearch(array, datoABuscar) => int [Te devuelve la posicion de ese dato, si no lo encuentra te devuelve un dato negativo]
 *                                                           [Debe de estar ordenado previamente]
 *          - Arrays.binarySearch(array, pos, elemento, dato) => int [Busca desde una posicion a un elemento]
 *          - Arrays.equals(arrayA, arrayB) => boolean [Compara dos arrays, true si son iguales]
 *          - Arrays.deepEquals(matrixA, matrixB) => boolean [Compara dos matrices, true si son iguales]
 *          - Arrays.fill(array, dato) => void [Rellena el array en el dato]
 *          - Arrays.toString(array) => String [Transforma una array a una cadena]
 *          
 *          
 *   Clase Collections
 *      Metodos estaticos
 *          - Arrays.sort(array, Collections.reverseOrder()) => void [Ordena de forma descendente, puede haber problemas con tipos primitivos]
 *      
 *      
 *  ~Matrices 
 *   -Regulares
 *      |*|*|*|*|*|
 *      |*|*|*|*|*|
 *      |*|*|*|*|*|
 *      
 *      Filas = 3; Columnas = 5
 *      
 *      Declaraciones
 *      - tipo[][] nombre = new tipo[rows][cols];
 *      
 *      Acceso
 *          A valor = nombre[row][col] => x
 *          A tamaño total = nombre.length => int
 *          A tamaño fila = nombre[row].length
 *          
 *   -Irregulares
 *      |*|*|*|*|
 *      |*|*|*|*|*|
 *      |*|*|*|
 *      
 *      Filas = 3; Columnas = ?
 *      
 *      Declaraciones
 *      - tipo[][] nombre = new tipo[3][];
 *      
 *      Inicializacion
 *      - nombre[row] = new tipo[col]
 *      
 *      Acceso
 *          A valor
*/
import java.util.Arrays;
import java.util.Collections;

public class ColeccionesLongFijas
{
    public static void main(){
        Integer[] array = new Integer[]{5,4,7,8};
        
        float[][] matrix = new float[2][4];
        
        char[][] imatrix = new char[5][];
        imatrix[0] = new char[6];
        imatrix[1] = new char[3];
        imatrix[2] = new char[4];
        
        Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());
        
        //Bucle especifico para manejar elementos de collecciones foreach
        Integer[] recorrer = new Integer[]{5, 6, 8, 1, 2};
        
        Arrays.sort(recorrer, Collections.reverseOrder());
        for(int i : recorrer)
            System.out.println(i);
            
        Arrays.sort(recorrer);
        for(int i : recorrer)
            System.out.println(i);
        
        
    }
}
