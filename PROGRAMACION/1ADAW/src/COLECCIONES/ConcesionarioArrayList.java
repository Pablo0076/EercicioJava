package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejercicio para casa: Francisco Roquefort lleva un edificio dedicado a la venta de coches. Hoy le han llegado varios coches,
 * y quiere utilizar Arrays para ordenar su garaje. Crea una lista de arrays. Que tenga de base los siguientes coches.
 * mustang,  Ford, Camaro,  Citroen C4. Y se mostrarán todos estos coches, que son los que ha comprado.
 *
 * Sin embargo, y aunque esto le vale a Francisco Roquefort. Te dará un aumento si logras que además de mostrar los coches se cree un
 * menú donde él pueda escribir los que quiera y se añadan al array y  se lo ordenas por orden alfabético.
 *
 */
public class ConcesionarioArrayList {

    public static void main(String[] args){
        //Variables
        Scanner scan = new Scanner(System.in);
        boolean usuarioSigueEscribiendo = true;
        String inputUsuario = "";
        //        Tipo    Nombre   Inicializacion(Siempre es asi)
        ArrayList<String> coches = new ArrayList<>();

        escribirBonito("Añadiendo valores al arrayList...");

        //Rellenamos ArrayList
        coches.add("Zentorno");
        coches.add("Panto");
        coches.add("Adder");
        coches.add("Sanchez");
        coches.add("Bati");
        coches.add("Akuma");

        //El while es la eleccion del usuario, la interaccion que tiene el con nuestro programa

        escribirBonito("Empezando bucle con seleccion de usuario...");
        while (usuarioSigueEscribiendo){
            System.out.println("Por favor, escribe el nombre del coche para añadir. Pulsa la tecla 0 para dejar de añadirlos");
            inputUsuario = scan.nextLine();

            if(inputUsuario.equals("0")){
                usuarioSigueEscribiendo = false;
            } else if(inputUsuario.isEmpty()) {
                System.out.println("Ceporro! No puede estar vacio! dime el nombre del coche");
            } else {
                System.out.println("Coche añadido!");
                coches.add(inputUsuario);
            }


        }

        escribirBonito("Mostrando resultados...");
        for(int i = 0; i< coches.size();i++){
            System.out.println("El coche " + i + " es: " + coches.get(i));
        }

        escribirBonito("Permitiendo al usuario borrar...");
        usuarioSigueEscribiendo = true;
        while (usuarioSigueEscribiendo){
            System.out.println("Por favor, escribe el coche que quieras borrar");
            inputUsuario = scan.nextLine();

            if(inputUsuario.equals("0")){
                usuarioSigueEscribiendo = false;
            } else if(inputUsuario.isEmpty()) {
                System.out.println("Ceporro! No puede estar vacio! dime el nombre del coche");
            } else {
                for(int i = 0; i< coches.size();i++){
                    if(coches.get(i).equals(inputUsuario)){
                        coches.remove(i);
                    }
                }
            }
            for(int i = 0; i< coches.size();i++){
                System.out.println("El coche " + i + " es: " + coches.get(i));
            }
        }
    }

    //Muestra el texto que le pases con cierta decoracion para que resalte. Muy util para saber que valores tiene el programa en cada momento
    public static void escribirBonito(String textoAEscribir) {
        System.out.println("-------------------------------");
        System.out.println(textoAEscribir);
        System.out.println("-------------------------------");
    }

}

