/*
 * Las interfaces incluyen solo metodos abstractos, y va a obligar 
 * a sus hijos a redefinir sus metodos.
 * 
 * Puede incluir atributos
 * Los atributos que haya en las interfaces siempre seran 
 * publicos, estaticos y tipo constante
 * 	(public static final...)
 * 
 * A la hora de heredar se utiliza la palabra reservada implements
 * 
*/

public interface Interfaz
{
    void imprimirMensaje(String mensaje);
   
}
