package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest {

    @Test
    public void loginTest()
    {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://localhost/invoiceplane");

        Login login = new Login(driver);

        login.setTxtUSer("amolujagare@gmail.com");
        login.setTxtPass("admin123");
        login.clickLoginBtn();

    }


}
