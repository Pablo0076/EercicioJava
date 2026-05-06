package examenn;

public class Ninja {

    private String nombre;
    private String clan;
    private int chakra;
    private int edad;
    private Jutsu jutsu1;

    public Ninja(String nombre, String clan, int chakra, int edad, String Jutsu) {
        this.nombre = nombre;
        this.clan = clan;
        this.chakra = chakra;
        this.edad = edad;

    }

    public void realizarJutsu(Jutsu jutsu1) {

    }

    @Override
    public String toString() {

        return nombre + " perteneciente al clan " + clan + "\n Edad: " + edad + "\n Chakra: " + chakra + "\n Jutsu que conoce: " + "\n informacion jutsu 1" + "\n informacion jutsu 2" + "\n ..." + "\n informacion jutsu 10";

    }

}
