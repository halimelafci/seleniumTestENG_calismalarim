package tests.day16;


import org.testng.annotations.Test;
import utilis.BeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends BeforeMethodAfterMethod {

    @Test
    public void amazonTesti(){
        driver.get("https://amazon.com");
    }

    @Test
    public void bestbuyTesti(){
        driver.get("https://www.bestbuy.com");
    }
}
