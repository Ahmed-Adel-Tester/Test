package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode301Page {
    WebDriver driver;
    private By validation301 =By.className("example");
    public StatusCode301Page(WebDriver driver) {
        this.driver=driver;
    }
    public String GetValidation301() {
        String Message301 = driver.findElement(validation301).getText();
return Message301;
    }

}
