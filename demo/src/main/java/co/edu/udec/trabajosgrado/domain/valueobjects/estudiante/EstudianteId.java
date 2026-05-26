package co.edu.udec.trabajosgrado.domain.valueobjects.estudiante;

import co.edu.udec.trabajosgrado.domain.exceptions.InvalidEstudentDniException;
import co.edu.udec.trabajosgrado.domain.exceptions.InvalidEstudentIdException;

import java.util.Objects;

public record EstudianteId(String value) {

    public EstudianteId {
        final String normalizedValue = Objects.requireNonNull(value, "EstudianteId cannot be null").trim();
        validateNotEmpty(normalizedValue);
        // asigna el valor normalizado al componente
        value = normalizedValue;
    }

    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidEstudentIdException.becauseValueIsEmpty();
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
