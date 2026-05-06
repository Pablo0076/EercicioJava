package examenn;

public class Componente {

    private String nombre;
    private String tipoDeComponente;
    private double consumoDelComponente;
    private String Tipo;
    private double Consumo;

    public Componente(String nombre, String tipoDeComponente, double consumoDelComponente) {
        this.nombre = nombre;
        this.tipoDeComponente = tipoDeComponente;
        this.consumoDelComponente = consumoDelComponente;

    }

    public Componente() {
    }

    @Override
    public String toString() {

        return "Componente:  " + nombre + "  Tipo: " + Tipo + "  Consumo:  " + Consumo + " Watios";

    }

}
