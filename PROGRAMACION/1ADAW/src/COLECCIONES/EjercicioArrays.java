package AgregacionyComposicion;

public class Libro {

    protected String Titulo;
    protected String fecha;
    protected String Autor;

    public Libro(String Titulo, String fecha, String Autor) {
        this.Titulo = Titulo;
        this.fecha = fecha;
        this.Autor = Autor;
    }
   

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Nombre: " + Titulo + "/n fecha de publicaciÃ³n: " + fecha + "/n Autor: " + Autor;
    }
    
    
    
   
}