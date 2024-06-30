package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    Select select ;
    private By dropdownlist= By.xpath("//select[@id='dropdown']");
    public DropDownPage(WebDriver driver) {
this.driver=driver;
    }
    public void SelectVisabilityFromDropDownList(String visableText){
        select=new Select(driver.findElement(dropdownlist));
        select.selectByVisibleText(visableText);
    }
    public void SelectIndexFromDropDownList(int Index){
        select=new Select((driver.findElement(dropdownlist)));
        select.selectByIndex(Index);

    }

}
