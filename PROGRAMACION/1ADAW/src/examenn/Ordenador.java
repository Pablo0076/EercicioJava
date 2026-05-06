package examenn;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {

    private String marca;
    private String modelo;
    private List<Componente> listacomponentes = new ArrayList<>();
    private int numero;

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

    }

    public Ordenador() {
    }

    public void aniadirComponente(Componente componente1) {
        listacomponentes.add(componente1);
    }

    public void aniadirComponentes(String nombre, String tipo, double consumo) {

    }

    @Override
    public String toString() {

        return "marca_ordenador" + "-" + " Modelo_ordenador" + "\n Componentes:" + "\n informacion componente 1" + "\n informacion componente 2" + "\n ..." + "\n informacion ultimo componente ";

    }

}
