package co.edu.udec.trabajosgrado.domain.exceptions.tribunal;

import co.edu.udec.trabajosgrado.domain.exceptions.DomainException;

public class InvalidTribunalIdException extends DomainException {

    //atributo
    private static final String MESSAGE_EMPTY = "The tribunal id must not be empty.";

    //constructor
    private InvalidTribunalIdException(final String message) {
        super(message);
    }

    //método
    public static InvalidTribunalIdException becauseValueIsEmpty() {
        return new InvalidTribunalIdException(MESSAGE_EMPTY);
    }
}
