import java.util.Scanner;



public class eje5 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pulgadas;
         System.out.println("introduce el numero de pulgadas:");
         pulgadas = teclado.nextDouble();
          System.out.println("el cambio de pulgadas a centimetros es "+(pulgadas*2.52));
          teclado.close();
         
    }
    
}
