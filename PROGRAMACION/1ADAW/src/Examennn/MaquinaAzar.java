package Examennn;

import java.util.ArrayList;

import java.util.List;


public class MaquinaAzar {

    double rizquierda;
    double rcentro;
    double rderecha;
    double cantidadDinero = 10000.0;
    

    public MaquinaAzar(double rizquierda, double rcentro, double rderecha) {
        
        this.rizquierda = rizquierda;
        this.rcentro = rcentro;
        this.rderecha = rderecha;
    }

    public double getRizquierda() {
        return rizquierda;
    }

    public double getRcentro() {
        return rcentro;
    }

    public double getRderecha() {
        return rderecha;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setRizquierda(double rizquierda) {
        this.rizquierda = rizquierda;
    }

    public void setRcentro(double rcentro) {
        this.rcentro = rcentro;
    }

    public void setRderecha(double rderecha) {
        this.rderecha = rderecha;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }
    
    

    public void jugar() {
        if (true) {
            cantidadDinero = cantidadDinero + 25;
        }
        ArrayList<numerolist> numeroArrayList = new ArrayList<>();
        
        if (i = 1) {
            
        }
        
        System.out.println("La jugada ha sido: " rderecha + ", " + rcentro ", "  + rizquierda);

    }

}
