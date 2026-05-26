package co.edu.udec.trabajosgrado.domain.enums;

import co.edu.udec.trabajosgrado.domain.exceptions.InvalidEstudentStatusException;

public enum EstudianteStatus {

    ACTIVE,
    INACTIVE,
    PENDING,
    BLOCKED;

    public static EstudianteStatus fromString(final String value) {
        for (final EstudianteStatus status : values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw InvalidEstudentStatusException.becauseValueIsInvalid(value);
    }
}
