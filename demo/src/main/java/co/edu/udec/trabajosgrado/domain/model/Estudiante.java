package co.edu.udec.trabajosgrado.domain.model;

public class Estudiante {
    private String id;
    private String dni;
    private String nombreCompleto;
    
    public Estudiante(String id, String dni, String nombreCompleto) {
        this.id = id;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
    }

    public String getId() {
        return id;
    }

    public String getCedula() { 
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto; 
    }
}