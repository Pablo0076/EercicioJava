package org.example;

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
public class Concesionario {

    public static void main(String[] args){
        //Variables
        //                   0          1          2          3
        String[] coches = {"Mustang", "Ford", "Citroen C4", "Camaro"};
        String inputUsuario = "";
        int numeroCoche;
        Boolean usuarioSigueEscribiendo = true;

        escribirBonito("Se ha creado la lista con los coches");

        //Ordenamos en orden alfabetico
        Arrays.sort(coches);

        escribirBonito("Se ha ordenado por orden alfabetico");

        //Variable declarada más tarde. Se declara más tarde para que la longitud encaje con la de coches.
        String[] cochesInversos = new String[coches.length];

        for(int i = 0; i<coches.length; i++){
            System.out.println("El coche número " + i + " es: " + coches[i]);
        }
        escribirBonito("Se ha ordenado por orden contrario al alfabetico");

        for(int i = coches.length-1; i>=0; i--){
            System.out.println("El coche número " + i + " es: " + coches[i]);
            cochesInversos[i] = coches[i];
        }
    }

    public static void imprimirListaCoches(String[] coches){

    }

    //Muestra el texto que le pases con cierta decoracion para que resalte. Muy util para saber que valores tiene el programa en cada momento
    public static void escribirBonito(String textoAEscribir) {
        System.out.println("-------------------------------");
        System.out.println(textoAEscribir);
        System.out.println("-------------------------------");
    }
}