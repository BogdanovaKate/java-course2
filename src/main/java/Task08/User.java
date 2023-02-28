
package Task08;

import java.util.Objects;

public class User {
    private final String login;
    private final int passwordHash;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return passwordHash == user.passwordHash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordHash);
    }

    public User(String login, int passwordHash) {
        this.login = login;
        this.passwordHash = passwordHash;
    }


    public int getPasswordHash() {
        return passwordHash;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwordHash=" + passwordHash +
                '}';
    }

    public String getLogin() {
        return login;
    }
}

