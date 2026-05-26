package co.edu.udec.trabajosgrado.domain.exceptions;

public class InvalidInvestigGroupIdException extends DomainException{

    //atributo
    private static final String MESSAGE_EMPTY = "The estudent id must not be empty.";

    //constructor
    private InvalidInvestigGroupIdException(final String message) {
        super(message);
    }

    //método
    public static InvalidInvestigGroupIdException becauseValueIsEmpty() {
        return new InvalidInvestigGroupIdException(MESSAGE_EMPTY);
    }
}
