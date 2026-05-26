package co.edu.udec.trabajosgrado.domain.exceptions.user;

import co.edu.udec.trabajosgrado.domain.exceptions.DomainException;

public class InvalidUserFullNameException extends DomainException {

    //atributos
    private static final String MESSAGE_EMPTY = "The estudent name must not be empty.";
    private static final String MESSAGE_TOO_SHORT = "The estudent name must have at least %d characters.";

    //constructor
    private InvalidUserFullNameException(final String message) {
        super(message);
    }

    //métodos
    public static InvalidUserFullNameException becauseValueIsEmpty() {
        return new InvalidUserFullNameException(MESSAGE_EMPTY);
    }

    public static InvalidUserFullNameException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidUserFullNameException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }
}
