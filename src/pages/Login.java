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
    WebElement txtUser;

    @FindBy (xpath = "//input[@type='password']")
    WebElement txtPass;

    @FindBy(xpath="//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='I forgot my password']")
    WebElement forgotPass;

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
