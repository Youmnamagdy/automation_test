package loginTest;

import base.base_test;
import org.testng.annotations.Test;
import pages.login;
import pages.secureArea;
import static org.testng.Assert.*;

public class loginTest extends base_test {
    @Test
    public void testSucessfulLogin(){
        login login  =  homepage.clickFromAuthentication();
        login.setUser("tomsmith");
        login.setPassw("SuperSecretPassword!");
//        secureArea secureAreaPage = login.clickloginbutton();
         secureArea secureArea=login.clickloginbutton();
     assertTrue(secureArea.getAlertText() .contains("You logged into secure Area!"),"alert text is incorrect");

    }
    @Test
    public void testee(){

    }
    @Test
    public void teste1(){

    }

}
