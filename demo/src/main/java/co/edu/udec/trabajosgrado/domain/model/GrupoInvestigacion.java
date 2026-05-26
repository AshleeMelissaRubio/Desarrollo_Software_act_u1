package co.edu.udec.trabajosgrado.domain.model;

import lombok.Value;

import java.util.Date;

@Value
public class GrupoInvestigacion {
    String id;
    String nombre;
    int cantidadComponentes;
    Date fechaIncorporacion;

}


