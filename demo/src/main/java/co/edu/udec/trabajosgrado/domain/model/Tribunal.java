package co.edu.udec.trabajosgrado.domain.model;

import lombok.Value;

import java.util.Date;

@Value
public class Tribunal {
    String id;
    String lugar_examen;
    int cant_profesor;
    Estudiante estudiante;
    TrabajoGrado trabajoGrado;
    Date fecha_defensa;

}
