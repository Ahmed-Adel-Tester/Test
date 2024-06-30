package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FigureCaption {
    WebElement captian;
    private By username = By.tagName("h5");
    private By profile = By.tagName("a");
    public FigureCaption(WebElement captian) {
    this.captian=captian;
    }
    public String GetUserName(){
        return captian.findElement(username).getText();
    }
    public String getprofile(){
        return captian.findElement(profile).getText();
    }
}
