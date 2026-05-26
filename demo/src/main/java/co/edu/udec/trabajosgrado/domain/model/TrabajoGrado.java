package co.edu.udec.trabajosgrado.domain.model;

public class TrabajoGrado {
    private String numeroOrden;
    private String tema;
    private Estudiante estudiante;

    public TrabajoGrado(String numeroOrden, String tema, Estudiante estudiante) {
        this.numeroOrden = numeroOrden;
        this.tema = tema;
        this.estudiante = estudiante;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
