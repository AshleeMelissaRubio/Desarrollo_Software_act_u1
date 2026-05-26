package co.edu.udec.trabajosgrado.domain.valueobjects.grupoinvestigacion;

import co.edu.udec.trabajosgrado.domain.exceptions.InvalidInvestigGroupNameException;
import co.edu.udec.trabajosgrado.domain.exceptions.InvalidProfessorFullNameException;

import java.util.Objects;

public record GrupoInvestigacionNombre(String value) {

    //atributo
    private static final int MINIMUM_LENGTH = 3;

    //constructor
    public GrupoInvestigacionNombre {
        final String normalizedValue = Objects.requireNonNull(value, "ProfesorNombreCompleto cannot be null").trim();
        validateNotEmpty(normalizedValue);
        validateMinimumLength(normalizedValue);
        value = normalizedValue;
    }

    //métodos
    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidInvestigGroupNameException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_LENGTH) {
            throw InvalidInvestigGroupNameException.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
