package com.unicartagena.models;

public class Profesor {
    private String cedula;         // DNI del profesor
    private String nombreCompleto; 
    private String domicilio;      // Dirección de residencia

    public Profesor(String cedula, String nombreCompleto, String domicilio) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
    }


// Getters
    public String getCedula() { 
        return cedula; 
    }
    
    public String getNombreCompleto() { 
        return nombreCompleto; 
    }

    public String getDomicilio() { 
        return domicilio; 
    }
}
