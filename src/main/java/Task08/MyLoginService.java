package Task08;

public class MyLoginService implements LoginService {
    private int maxSize;
    private User[] users;
    private int currentSize = 0;

    public MyLoginService(int size) {
        this.users = new User[size];
        this.maxSize = size;
    }

    @Override

    public void register(final String login, final String password, final String confirmPassword) {
        char[] charLogin = login.toCharArray();
        char[] charPassword = password.toCharArray();
        char[] charConfirmPassword = confirmPassword.toCharArray();
        if (charLogin.length < 3 || charLogin.length > 20) {
            throw new WrongLoginException("Login length is " + charLogin.length + ". Login should be more than 3 and less than 20 symbols");
        }
        for (int i = 0; i < charLogin.length; i++) {
            if (!Character.isLetterOrDigit(charLogin[i]) && charLogin[i] != '_') {
                throw new WrongLoginException("Login has wrong char: " + charLogin[i]);
            }
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getLogin().equals(login)) {
                    throw new WrongLoginException("User with login: " + login + " is already exists");
                }
            }
        }
        if (charPassword.length < 10 || charPassword.length > 20) {
            throw new WrongPasswordException("Password length is " + charPassword.length + ". Password should be more than 10 and less than 20 symbols");
        }
        for (int i = 0; i < charPassword.length; i++) {
            if (!Character.isLetterOrDigit(charPassword[i]) && charPassword[i] != '_' && charPassword[i] != '$' && charPassword[i] != '@') {
                throw new WrongPasswordException("Password has wrong char: " + charPassword[i]);
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password don't match with confirmed password");
        }

        User user1 = new User(login, password.hashCode());
        if (maxSize > currentSize) {
            users[currentSize] = user1;
            currentSize++;
            System.out.println("User " + login + " registered");
        } else {
            throw new UserLimitExceededException("User limit exceeded. Limit is " + maxSize);
        }

    }

    @Override
    public void login(String login, String password) {

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getLogin().equals(login)) {
                    if (users[i].getPasswordHash() == password.hashCode()) {
                        System.out.println("User " + login + " authorization " + "successes");
                        return;
                    } else {
                        throw new AuthException("User authorization failed");
                    }
                }
            }
        }
        throw new AuthException("User authorization failed");
    }

    public static void main(String[] args) {
        MyLoginService myLoginService = new MyLoginService(4);
        myLoginService.register("Ivan", "1111111111", "1111111111");
        myLoginService.register("Pavel", "9388915746", "9388915746");
        myLoginService.register("John", "348387673001", "348387673001");
        myLoginService.login("Pavel", "9388915746");

    }
}

