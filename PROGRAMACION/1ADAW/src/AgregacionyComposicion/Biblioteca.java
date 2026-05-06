
package AgregacionyComposicion;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    protected String Nombre;
    protected List<String> listaLibros = new ArrayList<>();

    public Biblioteca(String Nombre) {
        this.Nombre = Nombre;
                listaLibros.add("El Diario de Greg");
                listaLibros.add("Los Futbolisimos");
                listaLibros.add("geronimo estilton");
                listaLibros.add("Marvel");
               
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    protected void aniadirLibros(){
    
    
    }
    
    
    
}

