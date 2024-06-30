package dynamicloading;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicallyLoadedPage;
import pages.StartPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicLoadingTest extends BaseTests {
   @Test
           public void DynmaicLoad ()  {
       DynamicallyLoadedPage dynamicallyLoadedPage = homePage.ClickOnDynamicLoadingLink();
StartPage startPage =dynamicallyLoadedPage.ClickOnExampleOne();
   startPage.ClickOnStartButton();

   String actualresult = startPage.GetValidationMessage();
String expectedresult = "Hello World!";
assertEquals(actualresult,expectedresult);
   }
   @Test
   public void DynamicLoad2() throws InterruptedException {
    DynamicallyLoadedPage dynamicallyLoadedPage = homePage.ClickOnDynamicLoadingLink();
    StartPage startPage =  dynamicallyLoadedPage.ClickOnExampleTwo();
    startPage.ClickOnStartButton2();
    Thread.sleep(5000);
    String actualresult = startPage.GetValidationText2();
    String expectdresult = "Hello World!";
    assertEquals(actualresult,expectdresult);
   }
}