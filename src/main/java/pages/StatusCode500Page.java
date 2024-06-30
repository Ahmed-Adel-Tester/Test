package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode500Page {
    WebDriver driver;
    private By validation500 =By.className("example");
    public StatusCode500Page(WebDriver driver) {
    this.driver=driver;
    }
    public String GetValidation500(){
        String Message500 = driver.findElement(validation500).getText();
        return Message500 ;
    }
}
