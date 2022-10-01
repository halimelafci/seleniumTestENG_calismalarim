package tests.day20_SmokeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilis.ConfigReader;
import utilis.Driver;

public class C02_SmokeNegatifTest {

    @Test
    public void yanlisKullanici(){

            //Bir Class olustur : NegativeTest
            //Bir test method olustur NegativeLoginTest()
            // https://www.hotelmycamp.com/ adresine git
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
            HMCPage hmcPage = new HMCPage();
            //login butonuna bas
            hmcPage.login.click();
            //test data username: manager1 ,  test data password : manager1!
            hmcPage.username.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("HMCValidPassword"))
                    .sendKeys(Keys.ENTER).perform();
            //Degerleri girildiginde sayfaya girilemedigini test et

            Assert.assertTrue(hmcPage.basarisizGiris.isDisplayed());
            //Sayfayı kapatınız
            Driver.closeDriver();

    }

    @Test
    public void yanlisSifre() { //2.Seneryo: Doğru kullanıcı, Yanlış Şifre

        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HMCPage hmcPage = new HMCPage();
        //login butonuna bas
        hmcPage.login.click();
        //test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("HMCWrongPassword"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.basarisizGiris.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
    @Test
    public void yanlisKullaniciSifre() { // 3. Senoryo: Yanlış kullanıcı, Yanlış şifre
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HMCPage hmcPage = new HMCPage();
        //login butonuna bas
        hmcPage.login.click();
        //test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("HMCWrongPassword"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.basarisizGiris.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }


}
