public class Ejercicio15
{
    public static void main(char c){
        
        if (c > '9'){
            if (c > 'Z')
                System.out.printf("El carácter es la vocal minúscula \"%c\"", c);
            else
                System.out.printf("El carácter es la vocal mayúscula \"%c\"", c);
        }else{
            if(c >= '0'){
                String numName = "";
                switch (c){
                    case '0':
                        numName = "cero";
                        break;
                    case '1':
                        numName = "uno";
                        break;
                    case '2':
                        numName = "dos";
                        break;
                    case '3':
                        numName = "tres";
                        break;
                    case '4':
                        numName = "cuatro";
                        break;
                    case '5':
                        numName = "cinco";
                        break;
                    case '6':
                        numName = "seis";
                        break;
                    case '7':
                        numName = "siete";
                        break;
                    case '8':
                        numName = "ocho";
                        break;
                    case '9':
                        numName = "nueve";
                }
                System.out.printf("El carácter es el número %s", numName);
            }else{
                System.out.println("Carácter no contemplado");
            }
            
        }
        
    }
}
