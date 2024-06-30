package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.Closeable;

public class WYSIWYGEditorpage {
    WebDriver  driver;
    private By CloseButton = By.xpath("//div[@class=\"tox-icon\"]");
    public WYSIWYGEditorpage(WebDriver driver) {
    this.driver=driver;
    }
    public void ClickOnCloseButton(){
        driver.findElement(CloseButton).click();
    }
}
