package org.example.GatoSimple;


public class Gato {

    //Ponemos variables: Nombre, edadEnMeses, altura, raza
    private String nombre;
    private int edadEnMeses;
    private Double altura;
    private String raza;

    //Constructor
    public Gato(String nombre, int edadEnMeses, Double altura, String raza){
        this.nombre = nombre;
        this.edadEnMeses = edadEnMeses;
        this.altura = altura;
        this.raza = raza;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getEdadEnMeses(){
        return edadEnMeses;
    }

    public Double getAltura() {
        return altura;
    }

    public String getRaza(){
        return raza;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdadEnMeses(int edadEnMeses) {
        this.edadEnMeses = edadEnMeses;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public void gatoMaulla(){
        System.out.println("El gato " + nombre + " Maulla");
    }

    public void gatoCome(){
        System.out.println("El gato " + nombre + " Come");
    }

    //ToString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edadEnMeses + "\nAltura: " + altura + "\nRaza: " + raza;
    }

}
