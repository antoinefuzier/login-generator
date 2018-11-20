package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void init(){
        loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }
    @Test
    public void generateLoginForNomAndPrenom() {
        String verif = loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals("PDUR",verif);
        assertTrue(loginService.loginExists("PDUR"));

    }

    @Test
    public void CT1(){
        String verif = loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals("JRAL2",verif);
        assertTrue(loginService.loginExists("JRAL2"));

    }

    @Test
    public void CT2(){
        String verif = loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals("JROL1",verif);
        assertTrue(loginService.loginExists("JROL1"));

    }

    @Test
    public void CT3(){
        String verif = loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals("PDUR",verif);
        assertTrue(loginService.loginExists("PDUR"));

    }
}