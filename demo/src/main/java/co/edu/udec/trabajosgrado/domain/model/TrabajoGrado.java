package co.edu.udec.trabajosgrado.domain.model;

import lombok.Value;

@Value
public class TrabajoGrado {
    String numeroOrden;
    String tema;
    Estudiante estudiante;

}
