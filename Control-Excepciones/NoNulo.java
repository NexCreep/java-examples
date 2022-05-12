public class NoNulo extends Exception
{
    public NoNulo(){
        super("El objeto insertado no puede ser nulo o con valor 0.");
    }
}
