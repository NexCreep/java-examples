public class Ejercicio15
{
    public static void main(char c){
        if ((c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') || (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')){
            if (c > 'Z'){
                System.out.printf("El carácter es la vocal minúscula \"%c\"\n", c);
                c -= 32;
            }else
                System.out.printf("El carácter es la vocal mayúscula \"%c\"\n", c);            

        }else{
            String numName = "";
            switch (c){
                case '0':
                    numName = "cero";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '1':
                    numName = "uno";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '2':
                    numName = "dos";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '3':
                    numName = "tres";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '4':
                    numName = "cuatro";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '5':
                    numName = "cinco";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '6':
                    numName = "seis";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '7':
                    numName = "siete";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '8':
                    numName = "ocho";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                case '9':
                    numName = "nueve";
                    System.out.printf("El carácter es el número %s", numName);
                    break;
                default:
                    System.out.println("Carácter no contemplado");
            }
        }
        
        c = String.valueOf(c).toUpperCase().charAt(0);
        
        String rango = "";
        if (c>='A' && c<='J')
            rango = "A-J";
        else if ((c>='K' && c<='R') || c=='ñ' || c =='Ñ')
            rango = "K-R";
        else if (c>='S' && c<='Z')
            rango = "S-Z";
            
        System.out.printf("El carácter se encuentra en el rango %s.", rango);

    }
}
