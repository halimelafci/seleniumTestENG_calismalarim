package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_HMC_ConfigReader {

    @Test(groups = "grup2")
    public void test01() {

        //https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HMCPage hmcpage =new HMCPage();
        hmcpage.ilkLogin.click();

        hmcpage.username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        hmcpage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcpage.login.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hmcpage.basariliGiris.isDisplayed());


    }


    }

