import java.ava.util.scanner;

public class ejer2 {
    public static void main(String[] args) {
     
        scanner scr= new Scanner(System.in)
                
                System.out.println("dime tu nombre");
                
                
                String Name = scr.nextLine() ;
                System.out.println("Dime tu DNI");
                String DNI;
                
                DNI = scr.nextLine();
                
                
                
               System.out.println("Dime tu fecha de nacimiento:");
               
               String fechanaci = scr.nextLine();
               
               System.out.println("Nombre:"+Name);
               System.out.println("DNI:"+DNI);
               System.out.println("Fecha de Nacimiento:"+Fechanaci);
               scr.close ();
        
    }
    
}
