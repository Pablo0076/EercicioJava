import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class eje12 {
//Ejercicio 32 de la relacion
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 int num;
  System.out.print("introduce un numero");
  num = teclado.nextInt();
  while((num%2!=0) && (num%3!=0))
  {
      System.out.print("Error! introduce otro numero");
      num = teclado.nextInt();
  }
        System.out.print ("la division entre dos es: "+(num/2));
        
         System.out.print ("la dicision entre tres es "+(num/3));
  
teclado.close();
}
      
}
