package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdPage {
    WebDriver driver ;
    private By CloseButtton = By.xpath("//div[@class='modal-footer']/p");
    public AdPage(WebDriver driver) {
    this.driver=driver;
    }
public EnterAdPage ClickOnCloseButton(){
        driver.findElement(CloseButtton).click();
        return new EnterAdPage(driver);
}
}
