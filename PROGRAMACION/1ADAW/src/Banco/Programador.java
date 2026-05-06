package herencia;

public class Programador extends Empleado {

    int horasExtras;
    String lenguajePrincipal;
    double plusProyectos;

    public Programador(String nombre, String apellidos, double sueldoBase, int horasSemanales, int horasExtras, String lenguajePrincipal, double plusProyectos) {
        super(nombre, apellidos, sueldoBase, horasSemanales);

        this.horasExtras = horasExtras;
        this.lenguajePrincipal = lenguajePrincipal;
        this.plusProyectos = plusProyectos;
    }

    @Override
    public double calcularSueldo() {
        double sueldo;
        double dineroHorasExtras;
        sueldo = horasSemanales * 4;
        sueldo = sueldo * sueldoBase;
        dineroHorasExtras = 15 * horasExtras;

        if (lenguajePrincipal.equals("C++")) {
            sueldo = sueldo + 200;
        }
        sueldo = sueldo + dineroHorasExtras;

        return sueldo;
    }

    @Override
    public void trabajarJornada() {
        System.out.println("El programador" + nombre + " " + apellidos + "empieza a programar en java");
        System.out.println("El programador" + nombre + " " + apellidos + "se queda atascaado intentando solucionaar un error");
        System.out.println("El programador" + nombre + " " + apellidos + "termina de trabajar porque se ha agobiao");
    }

}
