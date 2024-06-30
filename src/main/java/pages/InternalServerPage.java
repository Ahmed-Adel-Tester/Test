package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalServerPage {
    WebDriver driver ;
    private By ValidationPhase = By.cssSelector("body>h1");
    public InternalServerPage(WebDriver driver) {
        this.driver=driver;
    }
    public String GetValidationPhase (){
       String phase = driver.findElement(ValidationPhase).getText();
       return phase;
    }
}
