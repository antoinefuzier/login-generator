package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService login;

    @Before public void init(){
        String[] loginsExistants = new String[2];
        loginsExistants[0] = "FCAZ";
        loginsExistants[1] = "AFUZ";
        login = new LoginService(loginsExistants);
    }
    @Test
    public void loginExists() {
        assertTrue(login.loginExists("AFUZ"));
        assertFalse(login.loginExists("PGAN"));
    }

    @Test
    public void addLogin() {
        login.addLogin("GROB");
        assertTrue(login.loginExists("GROB"));

    }

    @Test
    public void findAllLoginsStartingWith() {
        List<String> l = login.findAllLoginsStartingWith("A");
        assertEquals("AFUZ", l.get(0));

    }

    /**
     * Commentaire.
     */
    @Test
    public void findAllLogins() {
        List<String> l = login.findAllLogins();
        for(String s : l){
            assertTrue(login.loginExists(s));
        }

    }
}