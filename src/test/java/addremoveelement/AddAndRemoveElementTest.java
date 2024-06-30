package addremoveelement;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddAndRemovePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class AddAndRemoveElementTest extends BaseTests {
    @Test
    public void AddRemoveElement(){
        AddAndRemovePage addAndRemovePage = homePage.ClickOnAddAndRemoveLink();
        addAndRemovePage.ClickOnAddElement();
        String actualResult = addAndRemovePage.ValidationMessage();
        String expectedResult = "Delete";
        assertTrue(actualResult.contains(expectedResult));

    }
}
