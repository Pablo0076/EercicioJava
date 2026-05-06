package org.example.GatoSimple;

import java.util.ArrayList;
import java.util.Scanner;

public class MainVariosGatos {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        Boolean usuarioSigueBorrando = true;
        String inputUsuario = "";

        gatos.add(new Gato ("Flulflils", 15, 12.5, "Gato creo"));
        gatos.add(new Gato ("Perro", 1, 11.5, "Se nos ha colao un perro"));
        gatos.add(new Gato ("Firulais", 30, 10.5, "Nombre chulo"));
        gatos.add(new Gato ("Pochoclo", 20, 20.5, "Siames"));
        gatos.add(new Gato ("Bills", 10, 10.2, "Egipcio"));

        //Metodo para que todos los gatos se vayan a comer
        for(int i = 0; i<gatos.size(); i++){
            System.out.println(gatos.get(i).toString());
            System.out.println("-----------------------");
        }

        while(usuarioSigueBorrando){
            System.out.println("Escribe el nombre del gato a borrar");
            inputUsuario = scan.nextLine();

            if(inputUsuario.isEmpty()){
                System.out.println("Escribe algo anda");
            } else if (inputUsuario.equals("0")){
                System.out.println("Saliendo de menú de borrado...");
                usuarioSigueBorrando = false;
            } else {
                for(int i = 0; i<gatos.size(); i++){
                    if(gatos.get(i).getNombre().equals(inputUsuario)){
                        gatos.remove(i);
                    } else {
                        System.out.println("El gato que has escrito no está en la lista, busca que encaje bien");
                    }
                    System.out.println(gatos.get(i).toString());
                    System.out.println("--------------");
                }
            }
        }
    }
}
