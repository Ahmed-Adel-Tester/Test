package dropdownlist;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownListTest extends BaseTests {
@Test
    public void DropDownList1()  {
    String visabilityText ="Option 1";
DropDownPage dropDownPage= homePage.ClickOnDropDownListLink();
dropDownPage.SelectVisabilityFromDropDownList(visabilityText);
}
@Test

    public void DropDownList2(){
    int Index = 2;
    DropDownPage dropDownPage = homePage.ClickOnDropDownListLink();
dropDownPage.SelectIndexFromDropDownList(Index);

}
}
