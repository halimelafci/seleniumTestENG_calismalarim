package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {



    @Test
    public void test01(){
        /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */



        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));

        // -login butonuna bas
        BrcPage brcPage=new BrcPage();
        brcPage.login1.click();

       // -test data user email: customer@bluerentalcars.com ,
       // -test data password : 12345 dataları girip login e basın

        brcPage.mail.sendKeys(ConfigReader.getProperty("bluerentalcarEmail"));
        brcPage.password.sendKeys(ConfigReader.getProperty("bluerentalcarPassword"));
        brcPage.login2.click();

        //-Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

         Assert.assertTrue(brcPage.basariliGiris.isDisplayed());
    }
}
