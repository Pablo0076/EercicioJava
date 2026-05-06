package org.example;

import java.util.Scanner;

public class EjemploFor {

    /**
     * 1- Al usuario se le pregunta el numero 1 []
     * 2- Al usuario se le pregunta el numero 2 []
     * 3- El programa comprueba que el numero 1 sea menor que el numero 2. []
     * 4- El programa recorre el bucle poniendo todos los numeros entre el 1 y el 2 []
     * 5- El El programa recorre el bucle poniendo todos los numeros entre el 2 y el 1 si el numero 1 es menor que el dos []
     */


    public static void main(String[] args) {

        //1- Variables

        //Inicializamos el Scanner. Que recibe el texto del usuario
        Scanner scan = new Scanner(System.in);
        //Informar al usuario de que se recibirá su texto. Y la linea de debajo recoge lo que escribe
        System.out.println("Escribe el primer numero que quieres");
        int numero1 = scan.nextInt();

        //Lo mismo que antes pero para el segundo número
        System.out.println("Escribe el segundo numero que quieres");
        int numero2 = scan.nextInt();

        //Booleano que representa si el número 1 es menor (Debe comprobarse para ver si invertir el orden)
        boolean esNumero1Menor;

        //Texto informativo
        escribirBonito("1- El valor del numero 1 es: " + numero1);
        escribirBonito("2- El valor del numero 2 es: " + numero2);

        //Usamos el método  esNumero1Menor, que nos informará de si este es el caso.
        esNumero1Menor = comprobarNumeroMenor(numero1, numero2);
        escribirBonito(String.valueOf(esNumero1Menor));

        /**
         *Tenemos dos situaciones posibles, que el numero 1 sea el menor o que lo sea el dos.
         * Esto lo comprobamos en el método anterior. Partimos del numero menor y incrementamos en 1 el valor hasta alcanzar el segundo numero.
         * Se le suma 1 por que el número inicial cómo tal no está entre este y el segundo
         */
        if(esNumero1Menor){
            for(int i = numero1+1; i < numero2; i++){
                System.out.println(i);
            }
        } else {
            for(int i = numero2+1; i < numero1; i++){
                System.out.println(i);
            }
        }
    }

    //Muestra el texto que le pases con cierta decoracion para que resalte. Muy util para saber que valores tiene el programa en cada momento
    public static void escribirBonito(String textoAEscribir) {
        System.out.println("-------------------------------");
        System.out.println(textoAEscribir);
        System.out.println("-------------------------------");
    }


    /**
     *  ComprobarNumeroMenor recibe dos numeros, el 1 y el 2, introducidos por el usuario.
     *  Luego comprueba que número es el menor, ya que este numero será el que se use en el for como numero mas pequeño
     *  Y aumentara hasta llegar al numero 2. Dependiendo de que numero es menor devuelve true o false.
     */


    public static Boolean comprobarNumeroMenor(int numero1, int numero2) {
        if (numero1 < numero2) {
            return true;
        } else {
            return false;
        }
    }
}

