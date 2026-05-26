package co.edu.udec.trabajosgrado.domain.model;

import java.util.Date;

public class GrupoInvestigacion {
    private String id;
    private String nombre;
    private int cantidadComponentes;
    private Date fechaIncorporacion;

    public GrupoInvestigacion(String id, String nombre, int cantidadComponentes, Date fechaIncorporacion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadComponentes = cantidadComponentes;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadComponentes() {
        return cantidadComponentes;
    }

    public void setCantidadComponentes(int cantidadComponentes) {
        this.cantidadComponentes = cantidadComponentes;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
}


