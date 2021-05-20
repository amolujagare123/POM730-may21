package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;

import java.io.IOException;

import static utility.ConfigReader.getUrl;

public class ForgotPassTest {

    @Test
    public void forgotPasswordTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(getUrl());

        Login login = new Login(driver);
        login.clickForogtPass();

        ForgotPassword forgotPassword = new ForgotPassword(driver);

        forgotPassword.setTxtEmail("amol@gmail.com");
        forgotPassword.clickBtnReset();
    }
}
