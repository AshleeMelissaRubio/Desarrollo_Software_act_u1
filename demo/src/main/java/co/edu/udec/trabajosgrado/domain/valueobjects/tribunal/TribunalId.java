package co.edu.udec.trabajosgrado.domain.valueobjects.tribunal;

import co.edu.udec.trabajosgrado.domain.exceptions.InvalidTribunalIdException;

import java.util.Objects;

public record TribunalId(String value) {

    public TribunalId {
        final String normalizedValue = Objects.requireNonNull(value, "TribunalId cannot be null").trim();
        validateNotEmpty(normalizedValue);
        // asigna el valor normalizado al componente
        value = normalizedValue;
    }

    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidTribunalIdException.becauseValueIsEmpty();
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
