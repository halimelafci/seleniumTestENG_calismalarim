package tests.day16;


import org.testng.annotations.Test;
import utilities.BeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends BeforeClassAfterClass {


    @Test
    public void amazonTesti(){
        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestbuyTesti(){
        driver.get("https://www.bestbuy.com");

    }
}
