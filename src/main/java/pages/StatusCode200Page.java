package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode200Page {
    WebDriver driver;
    private By Validation200 = By.className("example");
    public StatusCode200Page(WebDriver driver) {
    this.driver=driver;
    }
    public String GetValidation200(){
String Message200 =  driver.findElement(Validation200).getText();
return  Message200 ;
    }
}
