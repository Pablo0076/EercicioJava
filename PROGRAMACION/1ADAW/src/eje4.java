import java.util.Scanner;

public class eje4 {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double num1;
       double num2;
       double num3;
       double num4;
       double num5;
       System.out.println("Dime el primer numero:");
                num1 = teclado.nextDouble();
                System.out.println("Dime el segundo numero: ");
                num2 = teclado.nextDouble();
                System.out.println("Dime el primer numero:");
                num3 = teclado.nextDouble();
                System.out.println("Dime el segundo numero: ");
                num4 = teclado.nextDouble();
                System.out.println("Dime el segundo numero: ");
                num5 = teclado.nextDouble();
                 System.out.println("la suma de los numeros: "+((num1+num2+num3+num4+num5)/5));
                  
                    teclado.close();
    }
    
}
