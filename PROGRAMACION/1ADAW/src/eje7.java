import java.ava.util.scanner;
import java.util.Scanner;

public class eje7 {
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     int mes;
     int anio;
      System.out.print("introduce el numero de 1 mes");
       mes = teclado.nextInt();
      System.out.print("introduce un año");
       anio = teclado.nextInt();
       if ( (anio%4==0) && (anio%100!=0) && (anio%400==0) )
       {
           if (mes==2)
           {
               System.out.print("El mes tiene 28 dias");
           
           }     
           else if (mes==1 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
           {     
                System.out.print("El mes tiene 31 dias");
           }
           else
           {
                 System.out.print("El mes tiene 30 dias");
           }  
       }
       else
       {
            if (mes==2)
           {
               System.out.print("El mes tiene 29 dias");
           
           }     
           else if (mes==1 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
           {     
                System.out.print("El mes tiene 31 dias");
           }
           else
           {
                 System.out.print("El mes tiene 30 dias");
       }
    }
    }
}
