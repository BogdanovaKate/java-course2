package Task08;

public class UserLimitExceededException extends RuntimeException{
    private String message;

    public UserLimitExceededException (String message) {
        super (message);
    }
}
