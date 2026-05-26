package co.edu.udec.trabajosgrado.domain.valueobjects.estudiante;

import co.edu.udec.trabajosgrado.domain.exceptions.InvalidEstudentFullNameException;

import java.util.Objects;

public record EstudianteNombreCompleto(String value) {

    //atributo
    private static final int MINIMUM_LENGTH = 3;

    //constructor
    public EstudianteNombreCompleto {
        final String normalizedValue = Objects.requireNonNull(value, "EstudianteNombreCompleto cannot be null").trim();
        validateNotEmpty(normalizedValue);
        validateMinimumLength(normalizedValue);
        value = normalizedValue;
    }

    //métodos
    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidEstudentFullNameException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_LENGTH) {
            throw InvalidEstudentFullNameException.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
