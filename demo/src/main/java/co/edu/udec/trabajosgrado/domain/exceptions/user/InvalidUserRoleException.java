package co.edu.udec.trabajosgrado.domain.exceptions.user;

import co.edu.udec.trabajosgrado.domain.exceptions.DomainException;

public class InvalidUserRoleException extends DomainException {

    private static final String MESSAGE_INVALID = "The user role '%s' is not valid.";

    private InvalidUserRoleException(final String message) {
        super(message);
    }

    public static  InvalidUserRoleException becauseValueIsInvalid(final String role) {
        return new InvalidUserRoleException(String.format(MESSAGE_INVALID, role));
    }
}
