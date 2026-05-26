package co.edu.udec.trabajosgrado.domain.exceptions.user;

import co.edu.udec.trabajosgrado.domain.exceptions.DomainException;

public class InvalidUserStatusException extends DomainException {

    private static final String MESSAGE_INVALID = "The user status '%s' is not valid.";

    private InvalidUserStatusException(final String message) {
        super(message);
    }

    public static InvalidUserStatusException becauseValueIsInvalid(final String status) {
        return new InvalidUserStatusException(String.format(MESSAGE_INVALID, status));
    }
}
