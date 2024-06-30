package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StartPage {
    WebDriver driver;
    WebDriverWait wait ;
    private By StartButton = By.cssSelector("div>button");
    private By ValidationMessage = By.xpath("//div[@id='finish']");
    //private By StartSButton = By.cssSelector("div>button");
//private By ValidationText =By.xpath("h4[text()='Hello World!']");

    public StartPage(WebDriver driver) {
        this.driver=driver;
    }

    public void ClickOnStartButton(){
        driver.findElement(StartButton).click();
    }
    public String GetValidationMessage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(ValidationMessage)));
      String  Message =driver.findElement(ValidationMessage).getText();
        return Message;
    }
        public void ClickOnStartButton2(){
            driver.findElement(StartButton).click();

    }
    public String GetValidationText2(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(ValidationMessage)));
        String Message  = driver.findElement(ValidationMessage).getText();
        return Message;
    }
}
