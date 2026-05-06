 VV 
import java.util.Scanner;


public class EjerciciosMaria4 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     // He puesto las operaciones debajo de cuando pido por teclado para que me las haga con los numeros q pido por teclado y no con el 0 de la variable que he creado
     // He declarado numeros
        int numero1 = 0;
        int numero2 = 0;
       
        //Cojo dos numeros desde el teclado        
        System.out.println("Introduce un numero: ");
         numero1= teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        numero2= teclado.nextInt();
        //Calculo los numeros que he pedido por teclado
         int suma= numero1 + numero2;
        int resta= numero1 - numero2;
         int mult= numero1 * numero2;
         int div= numero1 / numero2 ;
         //Muestro por pantalla como quiero q salga
        System.out.println("La suma de "+ numero1 +" y "+ numero2 +" es: " + suma);
         System.out.println("La resta de "+ numero1 +" y "+ numero2 +" es: " + resta);
          System.out.println("La multiplicacion de "+ numero1 +" y "+ numero2 +" es: " + mult);
          System.out.println("La division de "+ numero1 +" y "+ numero2 +" es: " + div);
        
       
      
    }
    
}
