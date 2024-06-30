package statuscode;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class StatusCode extends BaseTests {
    @Test
    public void SatusCode200(){
        StatusCodePage statusCodePage = homePage.ClickOnStatusCodeLink();
        //driver.findElement(By.linkText("Status Codes")).click();
        StatusCode200Page statusCode200Page = statusCodePage.ClickOnStatusCode200();
        //driver.findElement(By.xpath("//a[@href='status_codes/200']")) .click();
String actualresult = statusCode200Page.GetValidation200();
   //String actualresult = driver.findElement(By.className("example")).getText();
        String expectedresult = "This page returned a 200 status code.";
        assertTrue(actualresult.contains(expectedresult));
    }
    @Test
    public void SatusCode301(){
StatusCodePage statusCodePage = homePage.ClickOnStatusCodeLink();
        //driver.findElement(By.linkText("Status Codes")).click();
        StatusCode301Page statusCode301Page = statusCodePage.ClickOnStatusCode301();
        //driver.findElement(By.xpath("    //a[@href='status_codes/301']")) .click();
        //String actualresult = driver.findElement(By.className("example")).getText();
        String actualresult = statusCode301Page.GetValidation301();
        String expectedresult = "This page returned a 301 status code.";
        assertTrue(actualresult.contains(expectedresult));
    }
    @Test
    public void SatusCode404(){
        StatusCodePage statusCodePage = homePage.ClickOnStatusCodeLink();
        StatusCode404Page statusCode404Page = statusCodePage.ClickOnStatusCode404();
        //driver.findElement(By.linkText("Status Codes")).click();
        //driver.findElement(By.xpath("    //a[@href='status_codes/404']")) .click();
        String actualresult = statusCode404Page.GetValidation404();
        //String actualresult = driver.findElement(By.className("example")).getText();
        String expectedresult = "This page returned a 404 status code";
        assertTrue(actualresult.contains(expectedresult));
    }
    @Test
    public void SatusCode500(){
        StatusCodePage statusCodePage = homePage.ClickOnStatusCodeLink();
        StatusCode500Page statusCode500Page = statusCodePage.ClickOnStatusCode500();
        String actualresult = statusCode500Page.GetValidation500();

        //driver.findElement(By.linkText("Status Codes")).click();
        //driver.findElement(By.xpath("    //a[@href='status_codes/500']")) .click();
        //String actualresult = driver.findElement(By.className("example")).getText();
        String expectedresult = "This page returned a 500 status code.";
        assertTrue(actualresult.contains(expectedresult));
    }



}
