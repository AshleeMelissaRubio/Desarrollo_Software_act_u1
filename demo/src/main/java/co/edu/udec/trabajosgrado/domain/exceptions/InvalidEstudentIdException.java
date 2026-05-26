package co.edu.udec.trabajosgrado.domain.exceptions;

public class InvalidEstudentIdException extends DomainException {

    //atributo
    private static final String MESSAGE_EMPTY = "The estudent id must not be empty.";

    //constructor
    private InvalidEstudentIdException(final String message) {
        super(message);
    }

    //método
    public static InvalidEstudentIdException becauseValueIsEmpty() {
        return new InvalidEstudentIdException(MESSAGE_EMPTY);
    }
}
