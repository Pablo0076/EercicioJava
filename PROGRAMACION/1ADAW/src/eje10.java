import java.util.Scanner;


public class eje10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        double suma = 0;
        int vueltas = 0;
        String cadena = "";
        do{
             System.out.println("introduce un numero, para cuando metas 0:");
             num = teclado.nextInt();               
             suma = suma + num;
             vueltas = vueltas + 1;
             cadena= cadena + " "+ num;
             
          
        }while(num!=0);
        vueltas = vueltas - 1;
        System.out.println("APARTADO A:La suma de los numeros introducidos es:"+suma);
        System.out.println("APARTADO B:La media de los numeros introducidos es:"+(suma/vueltas));
        System.out.println("APARTADO C:La lista de los numeros introducidos es:"+cadena);
      
         teclado.close();
    }
}
