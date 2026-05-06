package org.example.ListaTareasArrayList;

public class Tarea {
    private String nombreTarea;
    private String descripcionTarea;
    private Boolean tareaSeRepite;
    private String fechaInicioTarea;

    public Tarea(String nombreTarea, String descripcionTarea, Boolean tareaSeRepite, String fechaInicioTareaTarea) {
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
        this.tareaSeRepite = tareaSeRepite;
        this.fechaInicioTarea = fechaInicioTareaTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getFechaInicioTarea() {
        return fechaInicioTarea;
    }

    public void setFechaInicioTarea(String fechaInicioTarea) {
        this.fechaInicioTarea = fechaInicioTarea;
    }

    public Boolean getTareaSeRepite() {
        return tareaSeRepite;
    }

    public void setTareaSeRepite(Boolean tareaSeRepite) {
        this.tareaSeRepite = tareaSeRepite;
    }

    @Override
    public String toString() {
        if (tareaSeRepite) {
            return "Tarea: " + nombreTarea + "\nDescripción tarea: " + descripcionTarea + "\nFecha de inicio de la tarea: " + fechaInicioTarea + "\nLa tarea se repite";
        } else {
            return "Tarea: " + nombreTarea + "\nDescripción tarea: " + descripcionTarea + "\nFecha de inicio de la tarea: " + fechaInicioTarea + "\nLa tarea es de una sola vez";
        }
    }
}
