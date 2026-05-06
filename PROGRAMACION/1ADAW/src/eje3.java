import java.util.Scanner;
public class eje3 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                double num1;
                double num2; 
                
                System.out.println("Dime el primer numero:");
                num1 = teclado.nextDouble();
                System.out.println("Dime el segundo numero: ");
                num2 = teclado.nextDouble();
                 System.out.println("la suma de los numeros: "+(num1+num2));
                  System.out.println("la resta de los numeros es: "+(num1-num2));
                   System.out.println("la multiplicacion de los numeros es: "+(num1*num2));
                    System.out.println("la division de los numeros es: "+(num1/num2));
                    teclado.close();
    
    }
    
}
