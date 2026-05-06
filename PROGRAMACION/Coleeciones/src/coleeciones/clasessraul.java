package org.example.ListaTareasArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //Declaramos variables
        Scanner scan = new Scanner(System.in);
        List<Tarea> listaTareas = new ArrayList<>();
        Boolean seRepite = true;
        int seleccionUsuario;

        //Inicializamos la lista de tareas,
        listaTareas.add(new Tarea("Hacer los deberes", "Terrible", true, "Hoy"));
        listaTareas.add(new Tarea("Cepillarme los dientes", "Limpieza bucal", true, "Todos los dias"));

        //Ahora vamos a pedirle al usuario añadir las suyas propias.

        while(seRepite){
            separacion();
            System.out.println("1- Escribir una nueva tarea\n 2-Consultar las tareas ya existentes\n 3- Borrar una tarea \n0-Salir");
            seleccionUsuario = scan.nextInt();
            separacion();
            switch(seleccionUsuario){
                case 0:
                    seRepite = false;
                    break;

                case 1:
                    addTarea(listaTareas, scan);
                    break;
                case 2:
                    mostrarTodasLasTareas(listaTareas);
                    break;

                case 3:
                    borrarTarea(listaTareas, scan);
                    break;
            }
        }
    }

    /**
     * Add Tarea añade una tarea con los datos que le pase el usuario
     * @param listaTareas
     * @param scan
     */
    public static void addTarea(List<Tarea> listaTareas, Scanner scan){
        String nombreTarea;
        String descripcionTarea;
        Boolean seRepite;
        String fechaInicio;

        nombreTarea = scan.nextLine();
        System.out.println("Escribe el nombre de la tarea...");
        nombreTarea = scan.nextLine();
        System.out.println("Escribe la descripcion de la tarea");
        descripcionTarea = scan.nextLine();
        System.out.println("Escribe 'true' si la tarea es diaria y 'false' si no lo es");
        seRepite = scan.nextBoolean();
        System.out.println("Establece una fecha a la tarea");
        fechaInicio = scan.nextLine();
        fechaInicio = scan.nextLine(); //Pongo la segunda por que la primera es ignorada tras leer el boolean

        listaTareas.add(new Tarea(nombreTarea, descripcionTarea, seRepite, fechaInicio));
    }

    public static void mostrarTodasLasTareas(List<Tarea> listaTareas){
        for(int i = 0; i < listaTareas.size();i++){
            System.out.println(listaTareas.get(i));
            separacion();
        }
    }

    public static void borrarTarea(List<Tarea> listaTareas, Scanner scan){
        System.out.println("Escribe el nombre de la tarea a borrar");
        String tareaABorrar = scan.nextLine();
        tareaABorrar = scan.nextLine(); //Se repite dos veces por que el primer scan.nextLine() es ignorado

        for(int i = 0; i < listaTareas.size();i++){
            if(listaTareas.get(i).getNombreTarea().equals(tareaABorrar)){ //Si la tarea actual es la que hay que borrar se borra
                listaTareas.remove(i);
            }
        }
    }

    public static void separacion(){
        System.out.println("_______________");
    }
}