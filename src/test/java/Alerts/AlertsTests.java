package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertPage;

import static org.testng.Assert.assertTrue;

public class AlertsTests extends BaseTests {
    @Test
    public void TestAcceptAlert() {
        JavaScriptAlertPage javaScriptAlertPage = homePage.ClickOnJavaScriptAlertsLink();
        javaScriptAlertPage.ClickOnJSAlert();
        javaScriptAlertPage.AcceptAlert();
        String actualresult = javaScriptAlertPage.Get1Text();
        String expectedresult = "You successfully clicked an alert";
        assertTrue(actualresult.contains(expectedresult));

    }

    @Test
    public void TestRejectionAlert() {
        JavaScriptAlertPage javaScriptAlertPage = homePage.ClickOnJavaScriptAlertsLink();
        javaScriptAlertPage.ClickOnJsConfirm();
        javaScriptAlertPage.RejectAlert();
        String actualresult = javaScriptAlertPage.GetNewValidationMessage();
        String expectedresult = "You clicked: Cancel";
        assertTrue(actualresult.contains(expectedresult));
    }
@Test
    public void TestJsPromotAlert(){

        JavaScriptAlertPage javaScriptAlertPage =homePage.ClickOnJavaScriptAlertsLink();
        javaScriptAlertPage.ClickOnJsPromot();
        javaScriptAlertPage.InsertJsPromot("hello");
        javaScriptAlertPage.AcceptAlert();
        String actualresult= javaScriptAlertPage.GetNewText();
       String expectedresult= "You entered: hello";
       assertTrue(actualresult.contains(expectedresult));

}
}