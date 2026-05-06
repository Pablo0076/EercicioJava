import java.util.Scanner;
public class eje10bolera {
 
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int precioentrada=20;
           int edad;
    
           double descuento = precioentrada - (precioentrada * 0.25);
           double precio = descuento;
            System.out.print("introduce tu edad");
             edad = teclado.nextInt();
             if((edad<=5) && (edad>65))
             {
                 System.out.print("No pagas");
             }
             else if ((edad>=5) && (edad<=12))
             {
                  System.out.print("tienes un descuento del 25%,la entrada cuesta:"+descuento+"euros");
             }
             else if (edad>=13) && (edad<=50)
             {
                 System.out.print("no hay descuento,la entrada cuesta:"+precioentrada+"euros");
             }
             else if (edad<51 && edad<=65)
             {
                  System.out.print("pagas solo el 75% de la entrada,la entrada cuesta:"+precio);
             }   
        teclado.close();
    }
    
}
