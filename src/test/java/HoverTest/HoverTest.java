package HoverTest;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FigureCaption;
import pages.HoverPage;

public class HoverTest extends BaseTests {
    @Test
        public void testhover(){
       HoverPage hoverPage = homePage.ClickOnHover();
     FigureCaption figureCaption =  hoverPage.HoverOverFigure(1);
System.out.println(figureCaption.GetUserName());
System.out.println(figureCaption.getprofile());



    }
}
