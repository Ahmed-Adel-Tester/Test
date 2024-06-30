package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode404Page {
    WebDriver driver;
    private By validation404 =By.className("example");
    public StatusCode404Page(WebDriver driver) {
    this.driver=driver;
    }
public String GetValidation404(){
    String Message404 =   driver.findElement(validation404).getText();
        return Message404;
}
}
