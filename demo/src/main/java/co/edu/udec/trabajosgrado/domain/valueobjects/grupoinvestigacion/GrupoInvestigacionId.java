package co.edu.udec.trabajosgrado.domain.valueobjects.grupoinvestigacion;

import co.edu.udec.trabajosgrado.domain.exceptions.investgroup.InvalidInvestigGroupIdException;

import java.util.Objects;

public record GrupoInvestigacionId(String value) {

    public GrupoInvestigacionId {
    final String normalizedValue = Objects.requireNonNull(value, "GrupoInvestigacionId cannot be null").trim();
    validateNotEmpty(normalizedValue);
    // asigna el valor normalizado al componente
    value = normalizedValue;
}

    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidInvestigGroupIdException.becauseValueIsEmpty();
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
