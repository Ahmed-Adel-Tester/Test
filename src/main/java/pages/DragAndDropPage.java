package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
    WebDriver driver;
    Actions actions;
    private By Box1 = By.id("column-a");
    private By Box2 = By.id("column-b");
    public DragAndDropPage(WebDriver driver) {
    this.driver=driver;
    }
public void DragAndDrop(){
        actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(Box1),driver.findElement(Box2)).build().perform();
}
public  void DragAndDrop2(){
        actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(Box1)).moveToElement(driver.findElement(Box2)).release();

}
}
