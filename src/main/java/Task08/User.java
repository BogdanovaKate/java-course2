package Task08;

public class User {
    private final String login;
    private final int passwordHash;

    public User(String login, int passwordHash) {
        this.login = login;
        this.passwordHash = passwordHash;
    }

}
