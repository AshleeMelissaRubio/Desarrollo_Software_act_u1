package co.edu.udec.trabajosgrado.domain.exceptions;

public class InvalidInvestigGroupNameException extends DomainException{

    //atributos
    private static final String MESSAGE_EMPTY = "The professor name must not be empty.";
    private static final String MESSAGE_TOO_SHORT = "The professor name must have at least %d characters.";

    //constructor
    private InvalidInvestigGroupNameException(final String message) {
        super(message);
    }

    //métodos
    public static InvalidInvestigGroupNameException becauseValueIsEmpty() {
        return new InvalidInvestigGroupNameException(MESSAGE_EMPTY);
    }

    public static InvalidInvestigGroupNameException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidInvestigGroupNameException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }
}
