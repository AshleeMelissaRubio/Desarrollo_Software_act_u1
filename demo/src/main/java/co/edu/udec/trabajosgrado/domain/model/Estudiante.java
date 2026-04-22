package com.unicartagena.models;

public class Estudiante {
    private String id;
    private String cedula;
    private String nombreCompleto;
    
    public Estudiante(String id, String cedula, String nombreCompleto) {
        this.id = id;
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
    }

    public String getId() {
        return id;
    }

    public String getCedula() { 
        return cedula; 
    }

    public String getNombreCompleto() {
        return nombreCompleto; 
    }
}