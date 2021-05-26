package pages;

import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {


    @FindBy (xpath="//input[@type='email']")
    public WebElement txtUser;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement txtPass;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='I forgot my password']")
    public WebElement forgotPass;

    @FindBy (xpath = "//label[@for='email']")
    public  WebElement lblEmail;

    public void clickForogtPass()
    {
        forgotPass.click();
    }

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void setTxtUSer(String username)
    {
        txtUser.sendKeys(username);
    }

    public void setTxtPass(String pass)
    {
        txtPass.sendKeys(pass);
    }

    public void clickLoginBtn()
    {
        btnLogin.click();
    }


}
