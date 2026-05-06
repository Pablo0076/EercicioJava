package examenn;

public class Jutsu {

    private String nombre;
    private String rango;
    private int cantidadPoder;
    private String tipo;

    public Jutsu(String nombre, String rango, int cantidadPoder, String tipo) {
        this.nombre = nombre;
        this.rango = rango;
        this.cantidadPoder = cantidadPoder;
        this.tipo = tipo;
    }

    public Jutsu(String nombre, int cantidadPoder) {
        this.nombre = nombre;
        this.cantidadPoder = cantidadPoder;
    }

    @Override
    public String toString() {

        return "Jutsu:  " + nombre + "  Tipo: " + tipo + " Rango: " + rango + "\n Consume: " + cantidadPoder + " puntos de poder.";

    }

}
