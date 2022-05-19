public class Electrodomestico
{
    private String modelo = "";
    private float consumo = 0f;
    
    public Electrodomestico(){};
    public Electrodomestico(String modelo, float consumo){
        this.consumo = consumo;
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "Modelo: " + modelo + "- Consumo: " + consumo;
    }
    
}
