package util;

import org.testng.annotations.BeforeClass;
import pages.Login;

import java.io.IOException;

import static utility.ConfigReader.getPassword;
import static utility.ConfigReader.getUsername;

public class DoLogin extends  OpenUrl{

    @BeforeClass
    public void doLogin() throws IOException {

        Login login = new Login(driver);

        login.setTxtUSer(getUsername());
        login.setTxtPass(getPassword());
        login.clickLoginBtn();
    }
}
