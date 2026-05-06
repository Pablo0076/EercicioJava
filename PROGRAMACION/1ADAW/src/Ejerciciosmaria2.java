
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Ejerciciosmaria2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String dni;
        String fecha_de_nacimiento;
        System.out.println("Introduce tu nombre");
        nombre=teclado.nextLine();
        System.out.println("Introduce tu dni");
         dni=teclado.nextLine();
        System.out.println("Introduce tu fecha de nacimiento");
         fecha_de_nacimiento=teclado.nextLine();
         System.out.println("El nombre es: "+ nombre);
         System.out.println("El Dni es: "+ dni);
         System.out.println("La fecha nacimiento es: "+ fecha_de_nacimiento);
        
        
    }
    
}
