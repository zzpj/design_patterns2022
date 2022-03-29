package pl.p.lodz.zzpj.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserDataHandlerTest {

    @Test
    public void shouldPassWithoutExceptions() {
        // given
        User user = new User("john", "qwerty");
        String data = "user data";

        // when
        UserDataHandler userAuthentication = new UserDataAuthentication(user, data);
        UserDataHandler userAuthorization = new UserDataAuthorization(user, data);
        UserDataHandler dataValidation = new DataValidation(user, data);
        userAuthentication.setNext(userAuthorization);
        userAuthorization.setNext(dataValidation);

        userAuthentication.handle();
    }

    @Test
    public void shouldNotAuthenticateAndThrowIllegalArgumentException() {
        // given
        User user = new User("mark", "qwerty");
        String data = "user data";

        // when
        UserDataHandler userAuthentication = new UserDataAuthentication(user, data);
        UserDataHandler userAuthorization = new UserDataAuthorization(user, data);
        UserDataHandler dataValidation = new DataValidation(user, data);
        userAuthentication.setNext(userAuthorization);
        userAuthorization.setNext(dataValidation);

        // then
        Exception ex = assertThrows(IllegalArgumentException.class, userAuthentication::handle);
        assertTrue(ex.getMessage().contains("Wrong user name"));
    }

    @Test
    public void shouldNotAuthorizeAndThrowIllegalArgumentException() {
        // given
        User user = new User("john", "qwertyyyyy");
        String data = "user data";

        // when
        UserDataHandler userAuthentication = new UserDataAuthentication(user, data);
        UserDataHandler userAuthorization = new UserDataAuthorization(user, data);
        UserDataHandler dataValidation = new DataValidation(user, data);
        userAuthentication.setNext(userAuthorization);
        userAuthorization.setNext(dataValidation);

        // then
        Exception ex = assertThrows(IllegalArgumentException.class, userAuthentication::handle);
        assertTrue(ex.getMessage().contains("Wrong user password"));
    }

    @Test
    public void shouldNotValidateAndThrowIllegalArgumentException() {
        // given
        User user = new User("john", "qwerty");
        String data = "user data not valid";

        // when
        UserDataHandler userAuthentication = new UserDataAuthentication(user, data);
        UserDataHandler userAuthorization = new UserDataAuthorization(user, data);
        UserDataHandler dataValidation = new DataValidation(user, data);
        userAuthentication.setNext(userAuthorization);
        userAuthorization.setNext(dataValidation);

        // then
        Exception ex = assertThrows(IllegalArgumentException.class, userAuthentication::handle);
        assertTrue(ex.getMessage().contains("Wrong data passed"));
    }

}
