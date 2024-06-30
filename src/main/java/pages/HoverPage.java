package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;
    Actions actions;
    private By figure =By.cssSelector(".figure");
   private By FigureBox= By.cssSelector(".figcaption ");
    public HoverPage(WebDriver driver) {
    this.driver=driver;
    }
    public FigureCaption HoverOverFigure(int index){
actions=new Actions(driver);
        WebElement FiguerImage = driver.findElements(figure).get(index-1);
actions.moveToElement(FiguerImage).perform();
return new FigureCaption(FiguerImage.findElement(FigureBox));
    }
}
