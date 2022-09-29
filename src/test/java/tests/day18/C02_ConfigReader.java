package tests.day18;

import org.testng.annotations.Test;
import utilis.ConfigReader;
import utilis.Driver;

public class C02_ConfigReader {

    @Test
    public void test01(){
       //configuration kullanarak amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        //configuration kullanarak facebook gidelim
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Driver.closeDriver();



    }
}
