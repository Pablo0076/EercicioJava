package org.example.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetsListadoEmpresas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nombreDeEmpresa = "";
        Set<String> empresas = new HashSet<>();
        int numeroEmpresas = 0;

        empresas.add("Microsoft");
        empresas.add("Tesla");
        empresas.add("Electronic arts");

        while(numeroEmpresas <= 0){
            System.out.println("Escribe el número de empresas que quieres añadir");
            numeroEmpresas = scan.nextInt();
            scan.nextLine();
        }


        for(int i = 0; i < numeroEmpresas; i++){
            System.out.println("Escribe el nombre de la empresa a añadir");
            nombreDeEmpresa = scan.nextLine();
            empresas.add(nombreDeEmpresa);
            //empresas.add(scan.nextLine());
        }

        //Mostramos los datos
        System.out.println("Mostrando lista completa...");
        System.out.println(empresas);

        System.out.println("Mostrando cantidad de entradas...");
        System.out.println(empresas.size());

    }
}
