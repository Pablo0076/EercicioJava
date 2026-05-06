package org.example.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Hashmao, interesantes keys, values, get
public class HashMapsPaisYCapital {
    public static void main(String[] args){
        Map <String, String> capitales = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int numeroPaises = 0;
        String pais, capital;
        int BorradoOConsulta = 1;

        //Tanto while como For son para que el usuario añada valores
        while(numeroPaises <= 0){
            System.out.println("Escribe el número de paises que quieres añadir. Numeros 0 o negativos no sirven");
            numeroPaises = scan.nextInt();
            scan.nextLine();
        }


        for(int i = 0; i < numeroPaises; i++){
            System.out.println("Escribe el nombre del pais");
            pais = scan.nextLine();

            System.out.println("¿Cual es la capital del país?");
            capital = scan.nextLine();

            capitales.put(pais, capital);
        }

        //Mostrando al usuario todos los datos
        System.out.println("Ahora vamos a mostrar la lista completa");
        System.out.println(capitales);

        System.out.println("Ahora mostraremos solamente los paises");
        System.out.println(capitales.keySet());

        System.out.println("Y para terminar solamente las capitales");
        System.out.println(capitales.values());

        System.out.println("La cantidad de paises que el usuario ha dado son:");
        System.out.println(capitales.size());

        //Pedir al usuario un pais para darle una capital (Una key y darle el value)

        //Empezamos reseteando el valor de pais
        pais = "";
        while(BorradoOConsulta != 0) {
            System.out.println("0-Terminar programa\n1- Realizar una consulta\n2-Borrar una entrada");
            BorradoOConsulta = scan.nextInt();
            scan.nextLine();

            System.out.println("Escribe el nombre de un país del que quieras obtener la capital");
            pais = scan.nextLine();

            if(capitales.containsKey(pais)){
                System.out.println("El pais está en la lista!");
                if(BorradoOConsulta == 1){
                    System.out.println(capitales.get(pais));
                } else if (BorradoOConsulta == 2){
                    capitales.remove(pais);
                    System.out.println("La entrada ha sido borrada");
                }

            } else {
                System.out.println("El país que buscas no está en la lista, prueba con otro. Recuerda que la primera letra es mayuscula");
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