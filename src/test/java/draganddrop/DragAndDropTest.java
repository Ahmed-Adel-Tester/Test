package draganddrop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTest extends BaseTests {
    @Test
    public void testDragAndDrop() throws InterruptedException {
        DragAndDropPage dragAndDropPage = homePage.ClickOnDragAndDrop();
        //dragAndDropPage.DragAndDrop();
        dragAndDropPage.DragAndDrop2() ;
        Thread.sleep(3000);
    }
}
