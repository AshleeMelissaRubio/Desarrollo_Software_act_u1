package co.edu.udec.trabajosgrado.domain.model;

import lombok.Value;

@Value
public class Estudiante {
    String id;
    String dni;
    String nombreCompleto;

    public static Estudiante create(
            final String id,
            final String dni,
            final String nombreCompleto) {
        return new Estudiante(id, name, email, password, role, UserStatus.PENDING);
    }

    public Estudiante activate() {
        return new Estudiante(id, name, email, password, role, UserStatus.ACTIVE);
    }

    public Estudiante deactivate() {
        return new Estudiante(id, name, email, password, role, UserStatus.INACTIVE);
    }
}