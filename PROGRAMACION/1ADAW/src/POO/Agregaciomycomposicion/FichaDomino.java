
package POO.Agregaciomycomposicion;


public class FichaDomino {
    private int lado1;
    private int lado2;
     public FichaDomino(int lado1, int lado2) {
        if (lado1 < 0 || lado1 > 6 || lado2 < 0 || lado2 > 6) {
            throw new IllegalArgumentException("Los valores deben estar entre 0 y 6");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
     }
      public boolean encaja(FichaDomino otra) {
        return this.lado1 == otra.lado1 ||
               this.lado1 == otra.lado2 ||
               this.lado2 == otra.lado1 ||
               this.lado2 == otra.la
    }
}
 
            
        
    
  

