package co.edu.udec.trabajosgrado.domain.exceptions;

public class DomainException extends RuntimeException {

    protected DomainException(String message) {
        super(message);
    }

    protected DomainException(final String message, final Throwable cause) {
    super(message, cause);
    }
}
