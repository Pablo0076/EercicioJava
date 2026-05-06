package org.example;

import java.util.Scanner;

public class CalcularMedia {

    /**
     * 1- Cómo se hace la media en matematicas normales? (Sumar en varios)
     * 1- Se recogen varios números
     * 2- Se hace la media de esos números
     * @param args
     */

    public static void main(String[] args) {

        //Declaramos Scanner
        Scanner scan = new Scanner(System.in);

        //Recogemos los 4 numeros que pase el usuario
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        double numero3 = scan.nextDouble();
        double numero4 = scan.nextDouble();

        //Hacemos la media sumandolos y dividiendo entre la cantidad de numeros que hay
        double resultado = (numero1 + numero2 + numero3 + numero4) / 4;
        //Imprimimos resultado
        System.out.println(resultado);

    }
}
