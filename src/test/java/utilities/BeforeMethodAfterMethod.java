package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BeforeMethodAfterMethod {

    protected WebDriver driver;
    protected Actions actions;

    @BeforeMethod(groups = "grup1")
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions=new Actions(driver);
    }
    @AfterMethod(groups = "grup1")
    public void tearDown() {
        driver.close();
    }
}
