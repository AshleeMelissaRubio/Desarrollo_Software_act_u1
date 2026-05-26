package co.edu.udec.trabajosgrado.domain.model;

import java.util.Date;

public class Tribunal {
    private String id;
    private String lugar_examen;
    private int cant_profesor;
    private Estudiante estudiante;
    private TrabajoGrado trabajoGrado;
    private Date fecha_defensa;

    public Tribunal(String id, String lugar_examen, int cant_profesor, Estudiante estudiante, TrabajoGrado trabajoGrado, Date fecha_defensa) {
        this.id = id;
        this.lugar_examen = lugar_examen;
        this.cant_profesor = cant_profesor;
        this.estudiante = estudiante;
        this.trabajoGrado = trabajoGrado;
        this.fecha_defensa = fecha_defensa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugar_examen() {
        return lugar_examen;
    }

    public void setLugar_examen(String lugar_examen) {
        this.lugar_examen = lugar_examen;
    }

    public int getCant_profesor() {
        return cant_profesor;
    }

    public void setCant_profesor(int cant_profesor) {
        this.cant_profesor = cant_profesor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public TrabajoGrado getTrabajoGrado() {
        return trabajoGrado;
    }

    public void setTrabajoGrado(TrabajoGrado trabajoGrado) {
        this.trabajoGrado = trabajoGrado;
    }

    public Date getFecha_defensa() {
        return fecha_defensa;
    }

    public void setFecha_defensa(Date fecha_defensa) {
        this.fecha_defensa = fecha_defensa;
    }
}
