package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {
    WebDriver driver;
    private By StatusCode200 =  By.xpath("//a[@href='status_codes/200']");
    private By StatusCode301 =  By.xpath("//a[@href='status_codes/301']");
    private By StatusCode404 =  By.xpath("//a[@href='status_codes/404']");
    private By StatusCode500 =  By.xpath("//a[@href='status_codes/500']");


    public StatusCodePage(WebDriver driver) {
        this.driver = driver;
    }
    public StatusCode200Page ClickOnStatusCode200(){
        driver.findElement(StatusCode200).click();
        return new StatusCode200Page(driver);
    }
    public StatusCode301Page ClickOnStatusCode301(){
        driver.findElement(StatusCode301).click();
        return new StatusCode301Page(driver);
    }
    public StatusCode404Page ClickOnStatusCode404(){
        driver.findElement(StatusCode404).click();
        return new StatusCode404Page(driver);
    }
    public StatusCode500Page ClickOnStatusCode500(){
        driver.findElement(StatusCode500).click();
        return new StatusCode500Page(driver);
    }

}




