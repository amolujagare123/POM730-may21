package regression.clients;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Login;
import pages.Menu;

import java.io.IOException;

import static utility.ConfigReader.*;
import static utility.MyDataProvider.getTheData;

public class AddClientTestDataProvider {
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

    @Test (dataProvider = "getData")
    public void addClientTest(
   String name,String surname,String language,String add1,
   String add2,String city,String state,String zip,String country,
   String gender,String birthdate,String phone,String fax,
   String mobile,String email,String web,String vat,String tax,
   String expected, String xpathActual

    )
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);


        addClient.setClientName(name);
        addClient.setClientSurname(surname);
        addClient.setlanguage(language);
        addClient.setClientAdd1(add1);
        addClient.setClientAdd2(add2);
        addClient.setClientCity(city);
        addClient.setClientState(state);
        addClient.setClientZip(zip);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthDate(birthdate); // MM/dd/yyyy
        addClient.setClientPhone(phone);
        addClient.setClientFax(fax);
        addClient.setClientMobile(mobile);
        addClient.setClientEmail(email);
        addClient.setClientWeb(web);
        addClient.setClientVat(vat);
        addClient.setClientTax(tax);
        addClient.clickBtnSave();

        String actual = "";

        try {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e) {

        }

        Assert.assertEquals(actual,expected,"wrong output/message");

    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return  getTheData("MyData/Invoiceplane.xlsx","Sheet1");
    }


}
