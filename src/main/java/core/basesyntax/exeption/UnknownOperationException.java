package core.basesyntax.exeption;

public class UnknownOperationException extends RuntimeException {
    public UnknownOperationException(String massage) {
        super(massage);
    }
}
