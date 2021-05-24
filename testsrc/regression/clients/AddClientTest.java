package regression.clients;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Clients.AddClient;
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

        AddClient addClient = new AddClient(driver);


        addClient.setClientName("Akshay123");
        addClient.setClientSurname("Yadav");
        addClient.setlanguage("English");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("pqr");
        addClient.setClientCity("Pune");
        addClient.setClientState("MH");
        addClient.setClientZip("7887878");
        addClient.setCountry("Hungary");
        addClient.setGender("Male");
        addClient.setBirthDate("02/21/1990"); // MM/dd/yyyy
        addClient.setClientPhone("898989");
        addClient.setClientFax("787878");
        addClient.setClientMobile("7878");
        addClient.setClientEmail("a@b.com");
        addClient.setClientWeb("www.xyz.com");
        addClient.setClientVat("8989");
        addClient.setClientTax("8989");
        addClient.clickBtnSave();

    }


}
