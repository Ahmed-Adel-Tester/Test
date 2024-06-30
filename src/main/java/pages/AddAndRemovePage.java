package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAndRemovePage {
    WebDriver driver ;
    private By AddElement = By.xpath("//button[@onclick='addElement()']");
    private By ValidationMessage = By.xpath("//button[@class='added-manually']");
    public AddAndRemovePage(WebDriver driver) {
        this.driver=driver;
    }
    public void ClickOnAddElement(){
driver.findElement(AddElement).click();
    }
    public String ValidationMessage(){
        String TextMessage = driver.findElement(ValidationMessage).getText();
        return TextMessage ;
    }
}
