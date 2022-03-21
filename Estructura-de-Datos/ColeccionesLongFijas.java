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
 *   Clase array
 *      Al ser objetos, si por ejemplo tenemos el objeto array A igualado con B, si modificamos uno, surtira efecto en ambos.
 *          System.arraycopy(arrayO, posO, arrayF, posF, n_elementos);
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
public class ColeccionesLongFijas
{
    public static void main(){
        int[] array = new int[4];
        
        float[][] matrix = new float[2][4];
        
        char[][] imatrix = new char[5][];
        imatrix[0] = new char[6];
        imatrix[1] = new char[3];
        imatrix[2] = new char[4];
        
    }
}
