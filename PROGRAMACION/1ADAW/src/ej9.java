
public class ej9 {

    
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
               int num1;
               int num2;
               int num3;
               int mayor=0;
               int menor=0;
                       
               System.out.println("introduce el primer numero:");
               num1 = teclado.nextint();
                System.out.println("introduce el segundo numero:");
               num2 = teclado.nextint();
                System.out.println("introduce el tercer numero:");
               num3 = teclado.nextint();
               
               if(num1>num2 && num1>num3){
               mayor=num1;
               if(num2>num3){
             
                menor=num3;
                   }
               else
               {
                   menor=num2;
               }
               }
               else if(num2>num1 && num2>num3)
                   {
                     mayor=num2;
                     
                     if(num1>num3){
                         
                   }
                   menor=num3;
                   }
                   else if(num3>num1 && num2>num3){
                           }
                   mayor=num3;
                   
                   if(num1>num2){
                   }
                   menor=num2;
                        
                           }
                  
    
              
               }
                     
               
    }
    
}
