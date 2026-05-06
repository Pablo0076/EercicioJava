package herencia;

public class RecursosHumanos extends Empleado {

    int cuotaMinimaContrataciones = 6;
    int contratacionesRealizadas;
    double plusSeleccion;

    public RecursosHumanos(String nombre, String apellidos, double sueldoBase, int horasSemanales, int contratacionesRealizadas, double plusSeleccion) {
        super(nombre, apellidos, sueldoBase, horasSemanales);
        this.contratacionesRealizadas = contratacionesRealizadas;
        this.plusSeleccion = plusSeleccion;
    }

    public int getCuotaMinimaContrataciones() {
        return cuotaMinimaContrataciones;
    }

    public int getContratacionesRealizadas() {
        return contratacionesRealizadas;
    }

    public double getPlusSeleccion() {
        return plusSeleccion;
    }

    public void setCuotaMinimaContrataciones(int cuotaMinimaContrataciones) {
        this.cuotaMinimaContrataciones = cuotaMinimaContrataciones;
    }

    public void setContratacionesRealizadas(int contratacionesRealizadas) {
        this.contratacionesRealizadas = contratacionesRealizadas;
    }

    public void setPlusSeleccion(double plusSeleccion) {
        this.plusSeleccion = plusSeleccion;
    }
    

    @Override
    public double calcularSueldo() {
        double sueldo;
        double sueldoExtra;
        sueldo = horasSemanales * 4;
        sueldo = sueldo * sueldoBase;

        if (cuotaMinimaContrataciones < contratacionesRealizadas) {
            sueldo = sueldo + 250;
        }
        sueldoExtra = contratacionesRealizadas * 25;
        sueldo = sueldo + sueldoExtra;
        return sueldo;
        
        
    }
    
     @Override
    public void trabajarJornada() {
        System.out.println("El de recursos humanos " + nombre + " " + apellidos + "entra");
        System.out.println("El de recursos humanos" + nombre + " " + apellidos + "descansa");
        System.out.println("El de recursos humanos" + nombre + " " + apellidos + "se va");
    }


    @Override
    public String toString() {
        return "RecursosHumanos{" + "cuotaMinimaContrataciones=" + cuotaMinimaContrataciones + ", contratacionesRealizadas=" + contratacionesRealizadas + ", plusSeleccion=" + plusSeleccion + '}';
    }
    
    

}
    
    
    


