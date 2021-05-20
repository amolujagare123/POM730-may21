package regression.clients;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;

import java.io.IOException;

import static utility.ConfigReader.*;

public class AddClientTest {
    WebDriver driver;

    @BeforeClass
    public void doLogin() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);

        login.setTxtUSer(getUsername());
        login.setTxtPass(getPassword());
        login.clickLoginBtn();
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();
    }


}
