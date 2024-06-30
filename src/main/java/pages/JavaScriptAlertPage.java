package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {
    WebDriver driver;
    private By JsAlert = By.xpath("//button[@onclick=\"jsAlert()\"]");
    private By Text = By.id("result");
    private By Text2 = By.id("result");
    private By JsConfirm= By.xpath(" //button[@onclick='jsConfirm()']");
    private By JsPromot =By.xpath("//button[@onclick='jsPrompt()']");
    public JavaScriptAlertPage(WebDriver driver) {
    this.driver=driver;
    }
    public void ClickOnJSAlert(){
        driver.findElement(JsAlert).click();
    }
    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String Get1Text(){
        String Message2=  driver.findElement(Text).getText();
    return Message2 ;
    }
    public void ClickOnJsConfirm(){
        driver.findElement(JsConfirm).click();
    }
public void RejectAlert(){
        driver.switchTo().alert().dismiss();
}
public String GetNewValidationMessage(){
        String Mmesage = driver.findElement(Text2).getText();
        return Mmesage;
}
public void ClickOnJsPromot(){
        driver.findElement(JsPromot).click();
}
public void InsertJsPromot(String NEWTEXT){
        driver.switchTo().alert().sendKeys(NEWTEXT);
    }
    public String GetNewText(){
        String Message3 = driver.findElement(Text2).getText();
        return Message3;
    }
}
