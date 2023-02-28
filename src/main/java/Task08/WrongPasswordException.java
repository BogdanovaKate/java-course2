package Task08;

public class WrongPasswordException extends RuntimeException {
    private String message;

    public WrongPasswordException(String message) {
        super (message);
    }
}
