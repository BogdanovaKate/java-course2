package task08.exercise.loginservice;

import Task08.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class LoginServiceTest {
    MyLoginService myLoginService = new MyLoginService(1);

    @BeforeEach
    public void beforeEach() {
        myLoginService = new MyLoginService(1);
    }

    @Test
    public void testRegisterCorrect() {
        myLoginService.register("Ivan", "123456_abcd", "123456_abcd");
    }

    @Test
    public void testShortLogin() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Iv", "123456_abcd", "123456_abcd");
            }
        };
        Assertions.assertThrows(WrongLoginException.class, executable);
    }

    @Test
    public void testWrongSymbolLogin() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Iv$n", "123456_abcd", "123456_abcd");
            }
        };
        Assertions.assertThrows(WrongLoginException.class, executable);
    }

    @Test
    public void testUserAlreadyExists() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Ivan", "123456_abcd", "123456_abcd");
                myLoginService.register("Ivan", "123456_abcd", "123456_abcd");
            }
        };
        Assertions.assertThrows(WrongLoginException.class, executable);
    }

    @Test
    public void testLongPassword() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Ivan", "123456_abcderrytuyuiiui", "123456_abcderrytuyuiiui");
            }
        };
        Assertions.assertThrows(WrongPasswordException.class, executable);
    }
    @Test
    public void testWrongSymbolPassword() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Ivan", "123456_abcd./", "123456_abcd./");
            }
        };
        Assertions.assertThrows(WrongPasswordException.class, executable);
    }
    @Test
    public void testPasswordsNotMatch() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Ivan", "123456_abcd", "654321_abcd");
            }
        };
        Assertions.assertThrows(WrongPasswordException.class, executable);
    }
    @Test
    public void testUserLimitExceeded() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Ivan", "123456_abcd", "123456_abcd");
                myLoginService.register("Ivan1", "654321_abcd", "654321_abcd");
            }
        };
        Assertions.assertThrows(UserLimitExceededException.class, executable);
    }
    @Test
    public void testLogin() {
        myLoginService.register("Ivan", "123456_abcd", "123456_abcd");
        myLoginService.login("Ivan", "123456_abcd");
    }
    @Test
    public void testLoginFail() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("Ivan", "123456_abcd", "123456_abcd");
                myLoginService.login("Ivan", "654321_abcd");
            }
        };
        Assertions.assertThrows(AuthException.class, executable);
    }
}
