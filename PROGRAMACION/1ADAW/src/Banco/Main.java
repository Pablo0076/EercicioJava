package herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Programador Programador1 = new Programador("Pablo", "Estrella", 2000, 40, 8, "C++", 450);
        Programador Programador2 = new Programador("Raul", "Vartolomeo", 2005, 50, 2, "Java", 450);
        Programador Programador3 = new Programador("Antonio", "raphina", 3000, 20, 3, "Python", 350);
        Programador Programador4 = new Programador("Alberto", "Saerrano", 1000, 30, 4, "C-sharp", 250);

        RecursosHumanos RecursosHumanos1 = new RecursosHumanos("Alberto", "Gomez", 1000, 40, 10, 200);
        RecursosHumanos RecursosHumanos2 = new RecursosHumanos("Alberto", "Limones", 1000, 40, 10, 200);
        RecursosHumanos RecursosHumanos3 = new RecursosHumanos("Alberto", "Saerrano", 1000, 40, 10, 200);

        Gerente Gerente1 = new Gerente("Alberto", "Goonzalez", 1000, 10, 15, 200, "intervencion");
        Gerente Gerente2 = new Gerente("Alberto", "dominguez", 1000, 10, 15, 200, "intervencion");

        CEO CEO1 = new CEO("Alberto", "parra", 1000, 900, 0);

        List<Empleado> trabajadores = new ArrayList<>();
        trabajadores.add(Programador1);
        trabajadores.add(Programador2);
        trabajadores.add(Programador3);
        trabajadores.add(Programador4);
        trabajadores.add(RecursosHumanos1);
        trabajadores.add(RecursosHumanos2);
        trabajadores.add(RecursosHumanos3);
        trabajadores.add(Gerente1);
        trabajadores.add(Gerente2);
        trabajadores.add(CEO1);

        CEO1.actualizarAcciones(trabajadores);

        for (int i = 0; i < trabajadores.size(); i++) {

            trabajadores.get(i).trabajarJornada();

            System.out.println("--------------------------------------------------");
            System.out.println(trabajadores.get(i).calcularSueldo());

            System.out.println("--------------------------------------------------");

        }

    }

}
