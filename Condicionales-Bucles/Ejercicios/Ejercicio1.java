package Ejercicios;
/*
 * Año: _2022_
 * Mes: _03_
 * Día: _16_
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1
{
    public static void main() throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Año: ");
        int año = Integer.parseInt(buffer.readLine());
        System.out.print("Mes: ");
        int mes = Integer.parseInt(buffer.readLine());
        System.out.print("Día: ");
        int dia = Integer.parseInt(buffer.readLine());

        if (mes <= 12 && mes > 0){
            int febr = 28;
            int mDias = 0;
            int dias = 0;

            if (año % 4 == 0)
                febr = 29;

            switch (mes){
                case 12:
                    if (mes == 12)
                        mDias = 31;
                    dias = dias + 31;
                case 11:
                    if (mes == 11)
                        mDias = 30;
                    dias = dias + 30;
                case 10: 
                    if (mes == 10)
                        mDias = 31;
                    dias = dias + 31;
                case 9:
                    if (mes == 9)
                        mDias = 30;
                    dias = dias + 30;
                case 8:
                    if (mes == 8)
                        mDias = 31;
                    dias = dias + 31;
                case 7:
                    if (mes == 7)
                        mDias = 31;
                    dias = dias + 31;
                case 6:
                    mDias = 30;
                    dias = dias + 30;
                case 5:
                    mDias = 31;
                    dias = dias + 31;
                case 4:
                    mDias = 30;
                    dias = dias + 30;
                case 3:
                    mDias = 31;
                    dias = dias + 31;
                case 2:
                    if ()
                    mDias = 31;
                    dias = dias + 31 + febr;
                    break;
            }
            
            System.out.println("Dias año: " + dias);

            if (dias > 0)
                System.out.println(dias - (mDias - dia));
            else
                System.out.println(dia);
        }
        else
            System.out.println("El mes no puede ser mayor a 12 y menor que 1");

    }
}
