package agregacionycomposicion;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    protected String Nombre;
    protected List<Libro> listaLibros = new ArrayList<>();

    public Biblioteca(String Nombre) {
        this.Nombre = Nombre;
        listaLibros.add(new Libro("Diario de Greg", "11/10/2002", "Greg"));
        listaLibros.add(new Libro("Diario de Raul", "11/01/2000", "Raul"));
        listaLibros.add(new Libro("Diario de paola", "11/06/2006", "Paola"));
    }

    public Biblioteca() {
        this.Nombre = "default";
        listaLibros.add(new Libro("Diario de Greg", "11/10/2002", "Greg"));
        listaLibros.add(new Libro("Diario de Raul", "11/01/2000", "Raul"));
        listaLibros.add(new Libro("Diario de paola", "11/06/2006", "Paola"));

    }

    public Biblioteca(String Nombre, Libro Libro1, Libro Libro2, Libro Libro3) {
        this.Nombre = Nombre;
        listaLibros.add(Libro1);
        listaLibros.add(Libro2);
        listaLibros.add(Libro3);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    protected void aniadirLibros(Libro Libro1) {
        listaLibros.add(Libro1);
    }

    protected void mostrarLibro() {
        for (int i = 0; i < listaLibros.size(); i++) {

            System.out.println(listaLibros.get(i));

        }
    }

    protected void mostrarLibroEspecifico(String nombre) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equals(nombre)) {
                System.out.println(listaLibros.get(i));
            }

        }
    }

    protected void mostrarLibroInvertido() {
        for (int i = listaLibros.size() - 1; i >= 0; i--) {
            System.out.println(listaLibros.get(i));
        }

    }

    protected void eliminarLibro(String nombre) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equals(nombre)) {
               System.out.println("El libro; " + nombre + " ha sido borrado ");
               listaLibros.remove(i);
            }
        }
    }

}