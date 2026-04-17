package com.unicartagena.models;

public class TrabajoGrado {
    private String numeroOrden;
    private String tema;
    private Estudiante estudiante;

    public TrabajoGrado(String numeroOrden, String tema, Estudiante estudiante){
        this.numeroOrden = numeroOrden;
        this.tema = tema;
        this.estudiante = estudiante;
    }

    //Getters
    public String getNumeroOrden() {return numeroOrden;}
    public String getTema() {return tema;}
    public Estudiante getEstudiante() { return estudiante;}
}
