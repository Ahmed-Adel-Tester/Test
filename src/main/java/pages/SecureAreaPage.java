package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
this.driver=driver;
    }
    private By validation = By.id("flash");
    public String GetValidationMessage(){
String Text = driver.findElement(validation).getText();
return Text;


    }
}
