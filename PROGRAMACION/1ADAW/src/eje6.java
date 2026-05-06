import java.util.Scanner;
public class eje6 {
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   double base;
   double altura; 
   
    System.out.print("introduce el valor de la base del triangulo:");
     base = teclado.nextDouble();
     System.out.print("introduce un valor para la altura del triangulo:");
      altura = teclado.nextDouble();
      
      
    System.out.print("el area del triangulo es: "+((base*altura)/2));  
    
    
    teclado.close();
    }
    
}
