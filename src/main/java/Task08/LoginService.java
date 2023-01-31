package Task08;

public interface LoginService {
    void register(final String login, final String password, final String confirmPassword)
        throws WrongLoginException, WrongPasswordException, UserLimitExceededException;
    void login(final String login, final String password)
        throws AuthException;

}