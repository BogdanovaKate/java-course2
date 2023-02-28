package Task08;

public class WrongLoginException extends RuntimeException {
    private String message;

    public WrongLoginException(String message) {
        super(message);
    }
}
