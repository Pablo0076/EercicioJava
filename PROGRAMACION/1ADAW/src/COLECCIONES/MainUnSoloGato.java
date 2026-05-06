package org.example.GatoSimple;

import java.util.ArrayList;

public class MainUnSoloGato {
    /**
     * Ejercicio: Crea varios gatos, cada uno tendrá los atributos
     * Nombre, edadEnMeses, altura y raza. Crea una clase Gato que permita
     * inicializar un gato y este maulle y acto seguido coma
     *
     */

    public static void main(String[] args){
        //Creamos un gato
        Gato garfield = new Gato("Garfield", 24, 10.2, "Simplemente Garfield");

        escribirBonito("Vamos a mostrar todos los datos de nuestro gato");
        //Empezamos obteniendo todos los datos del gatete
        System.out.println(garfield.getNombre());
        System.out.println(garfield.getAltura());
        System.out.println(garfield.getEdadEnMeses());
        System.out.println(garfield.getRaza());

        escribirBonito("Garfield ha crecido 2 centimetros, mostrando su nueva altura...");
        //Ahora Garfield ha crecido 2 centimetros.
        garfield.setAltura(10.4);
        System.out.println(garfield.getAltura());

        escribirBonito("Garfield tiene hambre, va a maullar y a comer");

        garfield.gatoMaulla();
        garfield.gatoCome();
    }

    //Muestra el texto que le pases con cierta decoracion para que resalte. Muy util para saber que valores tiene el programa en cada momento
    public static void escribirBonito(String textoAEscribir) {
        System.out.println("-------------------------------");
        System.out.println(textoAEscribir);
        System.out.println("-------------------------------");
    }
}
