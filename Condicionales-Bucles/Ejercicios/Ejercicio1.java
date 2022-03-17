package Ejercicios;
/*
 * Año: _2022_
 * Mes: _03_
 * Día: _16_
 * 
 * Han pasado 75 dias desde comienzo de año
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

        if ((mes <= 12 && mes > 0) && (dia > 0 && dia <= 31)){
            int febr = 28;

            if (año % 4 == 0)
                febr = 29;

            int dias = 0;
            if (mes > 2){
                int mPar = 0;
                int mImp = 0;
                
                switch (mes-1){
                    case 11:
                        mPar+=1;
                    case 10: 
                        mImp+=1;
                    case 9:
                        mPar+=1;
                    case 8:
                        mImp+=1;
                    case 7:
                        mImp+=1;
                    case 6:
                        mPar+=1;
                    case 5:
                        mImp+=1;
                    case 4:
                        mPar+=1;
                    case 3:
                        mImp+=1;
                    case 2:
                        dias+=febr;
                        mImp+=1;
                        break;
                }
                dias = (dias + (30 * mPar) + (31 * mImp)) + dia;
            }
            else{
                dias = dia;
                if (mes > 1)
                    dias += 31;
            }
            System.out.printf("Han pasado %d dias desde comienzo de año hasta el %d/%d/%d. \n", dias, dia, mes, año);
        }                
        else{
            System.out.println("El mes no puede ser mayor a 12 o menor que 1");
            System.out.println("Ni el dia no puede ser mayor a 31 o menor que 1");
        }

    }
}
