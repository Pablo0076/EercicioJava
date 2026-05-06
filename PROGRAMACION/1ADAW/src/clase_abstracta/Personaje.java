
package clase_abstracta;


public class Personaje {
    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    public void subirNivel(){
    
    }
    
    
    public void tipoPersonaje(){
    
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", nivel=" + nivel + '}';
    }
    
    
}

