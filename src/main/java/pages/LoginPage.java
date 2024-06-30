package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    private By usernamefiled = By.id("username");
    private By passwordfiled = By.id("password");
    private By loginbutton=By.className("radius");

public void insertusername(String username){
    driver.findElement(usernamefiled).sendKeys(username);
}
public void insertpassword(String password){
    driver.findElement(passwordfiled).sendKeys(password);
}
public SecureAreaPage ClickOnLoginButton(){
  driver.findElement(loginbutton).click();
  return new SecureAreaPage(driver);
}
}


