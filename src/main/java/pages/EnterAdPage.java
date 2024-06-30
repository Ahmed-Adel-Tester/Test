package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterAdPage {
WebDriver driver;
private By ClickHereButton = By.xpath("//a[@id=\"restart-ad\"]");
    public EnterAdPage(WebDriver driver) {
    this.driver=driver;
    }
public String GetClickHereButtonText(){
      String Text3 =  driver.findElement(ClickHereButton).getText();
      return Text3 ;
}
}
