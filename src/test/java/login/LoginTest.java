package login;
import base.BaseTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {


   @Test(priority = 1)
    public void TestsuccessfulLogin(){
       LoginPage loginPage = homePage.ClickOnFormAuthenticationLink();
      loginPage.insertusername("tomsmith");
      loginPage.insertpassword("SuperSecretPassword!");
      SecureAreaPage secureAreaPage =loginPage.ClickOnLoginButton();
      String ActualResult =secureAreaPage.GetValidationMessage();
      String expectedresult = "You logged into a secure area!";
      assertTrue(ActualResult.contains(expectedresult));
   }
  @Test(priority = 2)
   public void TestInvalidUserName()
  {
      LoginPage loginPage = homePage.ClickOnFormAuthenticationLink();
      loginPage.insertusername("tomsmit");
      loginPage.insertpassword("SuperSecretPassword!");
      loginPage.ClickOnLoginButton();
      String actualresult = driver.findElement(By.id("flash")).getText();
      String expectedresult = "Your username is invalid!";
      assertTrue(actualresult.contains(expectedresult));
  }
    @Test(priority = 3)
    public void TestInvalidPasssword()
    {

        LoginPage loginPage = homePage.ClickOnFormAuthenticationLink();
        loginPage.insertusername("tomsmith");
        loginPage.insertpassword("SuperSecretPasswor");
        loginPage.ClickOnLoginButton();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult = "Your password is invalid!";
        assertTrue(actualresult.contains(expectedresult));

    }
}
