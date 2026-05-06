
package POO;


public class Probando_heroe {

   
    public static void main(String[] args) {
       Heroe presi = new Heroe("Delosman",29,false,1.89);
        System.out.println(presi.nombre );
        System.out.println(presi.altura );
        System.out.println(presi.vuela );
        System.out.println(presi.edad );
        presi.volar();
        
         Heroe samu = new Heroe("Superpresi",30,true,1.74);
        System.out.println(samu.nombre );
        System.out.println(samu.altura );
        System.out.println(samu.vuela );
        System.out.println(samu.edad );
        
        
       
        
    }
    
}
