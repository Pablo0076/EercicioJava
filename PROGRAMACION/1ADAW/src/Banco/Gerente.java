package herencia;

public class Gerente extends Empleado {

    int personasBajoCargo;
    double plusConvenio;
    String departamento;
    double plusPuesto = 250;

    public Gerente(String nombre, String apellidos, double sueldoBase, int horasSemanales, int personasBajoCargo, double plusConvenio, String departamento) {
        super(nombre, apellidos, sueldoBase, horasSemanales);
        this.personasBajoCargo = personasBajoCargo;
        this.plusConvenio = plusConvenio;
        this.departamento = departamento;
    }

    @Override
    public double calcularSueldo() {
        double sueldo;
        double sueldoExtra;
        sueldo = horasSemanales * 4;
        sueldo = sueldo * sueldoBase;
        sueldoExtra = personasBajoCargo * 30;
        sueldo += sueldoExtra;
        if (personasBajoCargo >= 15) {
            plusConvenio = plusConvenio * 2;
            plusPuesto = plusPuesto * 2;

        }
        sueldo = sueldo + plusPuesto + plusConvenio;

        return sueldo;
    }

    
     @Override
    public void trabajarJornada() {
        System.out.println("El Gerente " + nombre + " " + apellidos + "entra");
        System.out.println("El Gerente" + nombre + " " + apellidos + "descansa");
        System.out.println("El Gerente" + nombre + " " + apellidos + "se va");
        
    
    }

}
