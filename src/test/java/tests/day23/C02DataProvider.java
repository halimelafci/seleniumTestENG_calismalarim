package tests.day23;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02DataProvider {
    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"hlm@gmail.com","12345"},{"sdgahd@gmail.com","33556"},{"dfdhg@gmail.com","56578"}};
    }

    //https://www.bluerentalcars.com/ adresine git
    //login butonuna bas
    //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
    //login butonuna tiklayin
    //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et


    @Test(dataProvider = "kullanicilar")
    public void test01(String email,String password){

        //https://www.bluerentalcars.com/ adresine git
        //login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));
        BrcPage brcPage=new BrcPage();
        brcPage.login1.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        brcPage.mail.sendKeys(email);
        brcPage.password.sendKeys(password);
        brcPage.login2.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.login2.isDisplayed());

    }
}
