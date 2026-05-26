package co.edu.udec.trabajosgrado.domain.exceptions;

public class InvalidProfessorFullNameException extends DomainException{

    //atributos
    private static final String MESSAGE_EMPTY = "The professor name must not be empty.";
    private static final String MESSAGE_TOO_SHORT = "The professor name must have at least %d characters.";

    //constructor
    private InvalidProfessorFullNameException(final String message) {
        super(message);
    }

    //métodos
    public static InvalidProfessorFullNameException becauseValueIsEmpty() {
        return new InvalidProfessorFullNameException(MESSAGE_EMPTY);
    }

    public static InvalidProfessorFullNameException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidProfessorFullNameException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }
}
