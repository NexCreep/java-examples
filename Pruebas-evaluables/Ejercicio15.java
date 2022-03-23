public class Ejercicio15
{
    public static void main(char c){
        
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            if (c > 'Z'){
                System.out.printf("El carácter es la vocal minúscula \"%c\"", c);
                c -= 32;
            }else
                System.out.printf("El carácter es la vocal mayúscula \"%c\"", c);
        
            String rango = "";
            if (c>='A' && c<='J')
                rango = "A-J";
            else if (c>='K' && c<='R')
                rango = "K-R";
            else if (c>='S' && c<='Z')
                rango = "S-Z";
                
            System.out.printf("\nEl carácter se encuentra en el rango %s.", rango);
                
            
        }else{
            if(c >= '0' && c <= '9'){
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
            }else
                System.out.println("Carácter no contemplado");
            
            
        }
        
    }
}
