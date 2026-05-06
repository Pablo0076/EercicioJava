package AgregacionyComposicion;

public class Telefono {

    protected String numero;
    protected int tiempocoversacion;

    //constructor
    protected Telefono(String numero) {
        this.numero = numero;
        this.tiempocoversacion = 0;  

    }
    
    
    //metodo
    public void realizarLlamada (Telefono receptor, int segundos){
    tiempocoversacion+= segundos;
    receptor.tiempocoversacion+= segundos;
    
    }
    
    
    @Override
    public String toString() {

        return "Nº  " + numero + "-" +  tiempocoversacion  + "seg de conversacion  ";

    }

}


