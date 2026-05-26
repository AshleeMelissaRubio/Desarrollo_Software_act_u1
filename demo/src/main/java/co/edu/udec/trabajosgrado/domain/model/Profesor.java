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


// Getters
    public String getCedula() { 
        return dni;
    }
    
    public String getNombreCompleto() { 
        return nombreCompleto; 
    }

    public String getDomicilio() { 
        return address;
    }
}
