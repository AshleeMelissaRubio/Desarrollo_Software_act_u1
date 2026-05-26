package co.edu.udec.trabajosgrado.domain.exceptions.user;

import co.edu.udec.trabajosgrado.domain.exceptions.DomainException;

public class InvalidUserIdException extends DomainException {

    //atributo
    private static final String MESSAGE_EMPTY = "The estudent id must not be empty.";

    //constructor
    private InvalidUserIdException(final String message) {
        super(message);
    }

    //método
    public static InvalidUserIdException becauseValueIsEmpty() {
        return new InvalidUserIdException(MESSAGE_EMPTY);
    }
}
