package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private By FormAuthentication = By.linkText("Form Authentication");
    private By AddAndRemoveElement = By.linkText("Add/Remove Elements");
    private By ForgotPassword = By.linkText("Forgot Password");
    private By StatusCode = By.linkText("Status Codes");
    private By DynamicLoading = By.linkText("Dynamic Loading");
    private By DropDownList = By.linkText("Dropdown");
    private By JavaScriptAlert = By.linkText("JavaScript Alerts");
    private By EnterAd = By.linkText("Entry Ad");
    private  By Hover = By.linkText("Hovers");
    private By DragAndDrop = By.linkText("Drag and Drop");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private void Click(By locator){
driver.findElement(locator).click();

    }
public LoginPage ClickOnFormAuthenticationLink(){
        Click(FormAuthentication);
        return new LoginPage(driver);
}
public AddAndRemovePage ClickOnAddAndRemoveLink(){
        Click(AddAndRemoveElement);
    return new AddAndRemovePage(driver);
    }
    public ForgotPasswordPage ClickOnForgotPasswordLink(){
        Click(ForgotPassword);
        return new ForgotPasswordPage(driver);
    }
    public StatusCodePage ClickOnStatusCodeLink(){
        Click(StatusCode);
        return new StatusCodePage(driver);
    }
    public DynamicallyLoadedPage ClickOnDynamicLoadingLink(){
       Click(DynamicLoading);
        return new DynamicallyLoadedPage (driver);
    }
    public DropDownPage ClickOnDropDownListLink(){
        Click(DropDownList);
        return new DropDownPage(driver);
    }
    public JavaScriptAlertPage ClickOnJavaScriptAlertsLink(){
        Click(JavaScriptAlert);
        return new JavaScriptAlertPage(driver);
    }
    public AdPage ClickOnEntryAdLink(){
        Click(EnterAd);
        return new AdPage(driver);
    }
public HoverPage ClickOnHover(){
        Click(Hover);
        return new HoverPage(driver);
}
public DragAndDropPage ClickOnDragAndDrop(){
        Click(DragAndDrop);
        return new DragAndDropPage(driver);

}

}
