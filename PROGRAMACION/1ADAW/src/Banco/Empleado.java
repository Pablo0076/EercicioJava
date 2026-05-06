package herencia;

abstract class Empleado {

    String nombre;
    String apellidos;
    double sueldoBase;
    int horasSemanales;

   public abstract double calcularSueldo();
    

    public abstract void trabajarJornada();
  

    public Empleado(String nombre, String apellidos, double sueldoBase, int horasSemanales) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ",apellidos=" + apellidos + ", sueldoBase=" + sueldoBase + ", horasSemanales=" + horasSemanales + '}';
    }

    
}