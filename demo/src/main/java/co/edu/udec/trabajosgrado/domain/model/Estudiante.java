package co.edu.udec.trabajosgrado.domain.model;

import co.edu.udec.trabajosgrado.domain.enums.EstudianteStatus;
import lombok.Value;

@Value
public class Estudiante {
    String id;
    String dni;
    String nombreCompleto;
    EstudianteStatus status;

    public static Estudiante create(
            final String id,
            final String dni,
            final String nombreCompleto,
            final EstudianteStatus status) {
        return new Estudiante(id, dni, nombreCompleto, EstudianteStatus.PENDING);
    }

    public Estudiante activate() {
        return new Estudiante(id, dni, nombreCompleto, EstudianteStatus.ACTIVE);
    }

    public Estudiante deactivate() {
        return new Estudiante(id, dni, nombreCompleto, EstudianteStatus.INACTIVE);
    }
}