package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    private By EmailFiled = By.id("email");
    private By RetrievePasswordFiled = By.className("radius");
    public ForgotPasswordPage(WebDriver driver) {
        this.driver=driver;
    }
    public void InsertEmail(){
        driver.findElement(EmailFiled).sendKeys("ahmed.adel@gmail.com");
    }
    public InternalServerPage ClickOnRetrievePasswordFiled(){
        driver.findElement(RetrievePasswordFiled).click();
   return new InternalServerPage(driver);
    }

}
