package co.edu.udec.trabajosgrado.domain.exceptions;

public class InvalidEstudentFullNameException extends DomainException{

    //atributos
    private static final String MESSAGE_EMPTY = "The estudent name must not be empty.";
    private static final String MESSAGE_TOO_SHORT = "The estudent name must have at least %d characters.";

    //constructor
    private InvalidEstudentFullNameException(final String message) {
        super(message);
    }

    //métodos
    public static InvalidEstudentFullNameException becauseValueIsEmpty() {
        return new InvalidEstudentFullNameException(MESSAGE_EMPTY);
    }

    public static InvalidEstudentFullNameException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidEstudentFullNameException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }
}
