package herencia;

import java.util.List;

public class CEO extends Empleado {

    double plusCEO = 900;
    double accionesEmpresa;

    public CEO(String nombre, String apellidos, double sueldoBase, int horasSemanales, double accionesEmpresa) {
        super(nombre, apellidos, sueldoBase, horasSemanales);

        this.accionesEmpresa = accionesEmpresa;
    }

    @Override
    public double calcularSueldo() {
        double sueldo;
        double sueldoExtra;
        sueldo = horasSemanales * 4;
        sueldo = sueldo * sueldoBase;

        sueldoExtra = accionesEmpresa * 30;
        sueldo = sueldo + sueldoExtra;
       
        return sueldo;
    }

    public void actualizarAcciones(List<Empleado> listaEmpleado) {
        System.out.println(listaEmpleado.size());
        this.accionesEmpresa = listaEmpleado.size() * 20;
        ;
    }

    @Override
    public void trabajarJornada() {
        System.out.println("El CEO" + nombre + " " + apellidos + "No hace nada");
        System.out.println("El CEO" + nombre + " " + apellidos + "No hace nada");
        System.out.println("El CEO" + nombre + " " + apellidos + "No hace nada");

    }
}
