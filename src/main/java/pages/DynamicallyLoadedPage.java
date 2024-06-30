package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DynamicallyLoadedPage {
    WebDriver driver;
    private By ExampleOne = By.xpath("//a[@href='/dynamic_loading/1']");
    private By ExampleTwo = By.xpath("//a[@href='/dynamic_loading/2']");
    public DynamicallyLoadedPage(WebDriver driver) {
        this.driver=driver;
    }
public StartPage ClickOnExampleOne(){
        driver.findElement(ExampleOne).click();
        return new StartPage(driver);
}
public StartPage ClickOnExampleTwo(){
      driver.findElement(ExampleTwo).click();
        return  new StartPage(driver);
}
}