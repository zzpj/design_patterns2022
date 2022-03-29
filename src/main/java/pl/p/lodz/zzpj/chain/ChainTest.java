package pl.p.lodz.zzpj.chain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.p.lodz.zzpj.chain.handlers.ActorHandler;
import pl.p.lodz.zzpj.chain.handlers.AuthHandler;
import pl.p.lodz.zzpj.chain.handlers.Handler;
import pl.p.lodz.zzpj.chain.handlers.ValidationHandler;
import pl.p.lodz.zzpj.chain.model.Actor;
import pl.p.lodz.zzpj.chain.model.DataBase;
import pl.p.lodz.zzpj.chain.model.User;

import static org.junit.jupiter.api.Assertions.*;

public class ChainTest {

    DataBase dataBase;
    Handler handler;

    @BeforeEach
    public void init() {
        dataBase = new DataBase();
        dataBase.add(new User("229963","haslo", Actor.CLIENT));
        handler = new AuthHandler();
        handler.setNext(new ActorHandler()).setNext(new ValidationHandler());
        dataBase.add(new User("229344","haslo", null));
    }


    @Test
    @DisplayName("Testing authentication")
    public void authTest() {
        String email = "daniel@emal.com";
        assertTrue(handler.check(dataBase,"229963","haslo",email));
        assertFalse(handler.check(dataBase,"zly","haslo",email));
        assertFalse(handler.check(dataBase,"229963","zle",email));
    }

    @Test
    @DisplayName("Testing user with actor and without actor")
    public void actorTest() {
        String email = "daniel@emal.com";
        assertFalse(handler.check(dataBase,"229344","haslo",email));
        assertTrue(handler.check(dataBase,"229963","haslo",email));
    }

    @Test
    @DisplayName("Testing email validation")
    public void validationTest() {
        String email = "daniel@emal.com";
        assertTrue(handler.check(dataBase,"229963","haslo",email));
        email = "@wp.pl";
        assertFalse(handler.check(dataBase,"229963","haslo",email));
        email = "email";
        assertFalse(handler.check(dataBase,"229963","haslo",email));
    }

}
