package forgotpassword;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.InternalServerPage;

import static org.testng.Assert.assertTrue;

public class ForgotPassword extends BaseTests {
        @Test
    public void forgetpassword(){
            ForgotPasswordPage forgotPasswordPage = homePage.ClickOnForgotPasswordLink();
            //driver.findElement(By.linkText("Forgot Password")).click();
            forgotPasswordPage.InsertEmail();
            // driver.findElement(By.id("email")).sendKeys("ahmed@gmail.com");
            InternalServerPage internalServerPage =   forgotPasswordPage.ClickOnRetrievePasswordFiled();
            //driver.findElement(By.className("radius")).click();

            String actualresult = internalServerPage.GetValidationPhase();
            //String actualresult = driver.findElement(By.cssSelector("body>h1")).getText();
            String expectedresult = "Internal Server Error" ;
            assertTrue(actualresult.contains(expectedresult));

        }

}
