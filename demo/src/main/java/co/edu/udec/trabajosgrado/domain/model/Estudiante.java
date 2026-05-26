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

    public void setId(String id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}