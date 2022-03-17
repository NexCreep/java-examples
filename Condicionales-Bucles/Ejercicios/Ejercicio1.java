package Ejercicios;
/*
 * Averigua el dia del año a partir de una fecha
 * 
 *      Año: _2022_
 *      Mes: _03_
 *      Día: _16_
 * 
 *      Han pasado 75 dias desde comienzo de año
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1
{
    public static void main() throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        short año = 0;
        do{
            System.out.print("Año: ");
            año = Short.parseShort(buffer.readLine());
        }while (año < 1950 || año > 2100);
        
        byte febr = 28;
        if (año % 4 == 0)
            febr = 29;
        
        byte mes = 0;
        do{
            System.out.print("Mes: ");
            mes = Byte.parseByte(buffer.readLine());
        }while (mes < 1 || mes > 12);
        
        byte[] diasMes = new byte[1];
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = new byte[31];
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = new byte[30];
                break;
            case 2:
                diasMes = new byte[febr];
        }
        for(byte i = 0; i<diasMes.length; i++){
            diasMes[i] = (byte)(i + 1);
        }
        
        byte i = 0;
        boolean inMonth = false;
        byte dia = 0;
        do{
            System.out.print("Día: ");
            dia = Byte.parseByte(buffer.readLine());
            
            i = 0;
            inMonth = false;
            while(i<diasMes.length && !inMonth){
                if (diasMes[i] == dia)
                    inMonth = true;
                i++;
            }
        }while (!inMonth);
        
        short dias = 0;
        if (mes > 2){
            byte mPar = 0;
            byte mImp = 0;
            
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
            }
            dias = (short)((dias + (30 * mPar) + (31 * mImp)) + dia);
        }
        else{
            dias = dia;
            if (mes > 1)
                dias += 31;
        }
        System.out.printf("Han pasado %d dias desde comienzo del mismo año hasta el %d/%d/%d. \n", dias, dia, mes, año);                

    }
}
