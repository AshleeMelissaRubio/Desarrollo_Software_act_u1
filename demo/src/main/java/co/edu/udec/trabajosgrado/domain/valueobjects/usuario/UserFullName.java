package co.edu.udec.trabajosgrado.domain.valueobjects.usuario;

import co.edu.udec.trabajosgrado.domain.exceptions.user.InvalidUserFullNameException;

import java.util.Objects;

public record UserFullName(String value) {

    //atributo
    private static final int MINIMUM_LENGTH = 3;

    //constructor
    public UserFullName {
        final String normalizedValue = Objects.requireNonNull(value, "EstudianteNombreCompleto cannot be null").trim();
        validateNotEmpty(normalizedValue);
        validateMinimumLength(normalizedValue);
        value = normalizedValue;
    }

    //métodos
    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidUserFullNameException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_LENGTH) {
            throw InvalidUserFullNameException.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
