package UITesting;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

public class LoginTest extends OpenUrl {

    Login login;

    @BeforeClass
    public void  initLogin()
    {
        login = new Login(driver);
    }

    @Test
    public void txtUserVisibilityCheck()
    {
       boolean expected = true;
        boolean actual = false;
      try {
          actual = login.txtUser.isDisplayed();
      }
      catch (Exception e)
      {

      }
       Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtUserEnbilityCheck()
    {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUser.isEnabled();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lblEmailSpellCheck()
    {
       String expected = "Email";
       String actual="";

       try {
            actual = login.lblEmail.getText();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtPasswordWatermarkCheck()
    {
        String expected ="Password";
        String actual="";

        System.out.println("expected="+expected);
        try {
            actual = login.txtPass.getAttribute("placeholder");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lblEmailFontSizeCheck()
    {
        String expected = "14px";
        String actual="";

        System.out.println("expected="+expected);
        try {
            actual = login.lblEmail.getCssValue("font-size");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lblEmailFontFamiyCheck()
    {
        String expected ="-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual="";

        System.out.println("expected="+expected);
        try {
            actual = login.lblEmail.getCssValue("font-family");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void btnLoginColorCheck()
    {
        String expected ="#2C8EDD";
        String actual="";

        System.out.println("expected="+expected);
        try {
            String rgbColor = login.btnLogin.getCssValue("background-color");

            actual = Color.fromString(rgbColor).asHex().toUpperCase();

            System.out.println("rgbColor="+rgbColor);
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }
}
