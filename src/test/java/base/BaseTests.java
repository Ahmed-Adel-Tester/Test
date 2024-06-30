package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.SecureAreaPage;

public class BaseTests {
    public WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage= new HomePage(driver);
        GoHome();
    }
    @BeforeMethod
    public void GoHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }

}
