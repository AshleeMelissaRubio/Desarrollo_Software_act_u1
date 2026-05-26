package co.edu.udec.trabajosgrado.domain.model;

public class Profesor {
    private String dni;         // DNI del profesor
    private String nombreCompleto; 
    private String address;      // Dirección de residencia

    public Profesor(String dni, String nombreCompleto, String address) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
