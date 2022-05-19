public class Frigorifico extends Electrodomestico
{
    private float temperatura = 0f;
    
    public Frigorifico(String modelo, float consumo, float temperatura){
        super(modelo, consumo);
        this.temperatura = temperatura;
    }
    
    protected float pasoFarenheit(){
        return (temperatura * 9 / 5) + 32;
    }
    
    @Override
    public String toString(){
        return super.toString() + "- Temperatura: " + temperatura + " ºC";
    }
    
}
