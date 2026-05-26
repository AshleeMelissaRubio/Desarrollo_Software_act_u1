package co.edu.udec.trabajosgrado.domain.exceptions;

public class InvalidEstudentStatusException extends DomainException{

    private static final String MESSAGE_INVALID = "The user status '%s' is not valid.";

    private InvalidEstudentStatusException(final String message) {
        super(message);
    }

    public static InvalidEstudentStatusException becauseValueIsInvalid(final String status) {
        return new InvalidEstudentStatusException(String.format(MESSAGE_INVALID, status));
    }
}
