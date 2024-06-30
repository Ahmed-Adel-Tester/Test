package EnterAd;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AdPage;
import pages.EnterAdPage;

import static org.testng.Assert.assertTrue;

public class EnteryAdTest extends BaseTests {
    @Test
    public void CloseAdTest() {
        AdPage adPage = homePage.ClickOnEntryAdLink();
        EnterAdPage enterAdPage = adPage.ClickOnCloseButton();
String actualresult =enterAdPage.GetClickHereButtonText();
String expectedresult = "click here";
assertTrue(actualresult.contains(expectedresult));

    }
}
