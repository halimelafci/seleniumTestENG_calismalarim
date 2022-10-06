package tests.practice_05;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01 extends TestBaseRapor {
    // 1. Tarayıcıyı başlat
    // 2. 'http://automationexercise.com' url'sine gidin
    // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
    // 4. 'Ürünler' butonuna tıklayın
    // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
    // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
    // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
    // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın

   AutomationePage automationePage=new AutomationePage();


    @Test
    public void test01(){
        extentTest=extentReports.createTest("automation exercise Testi",
                "urun arayıp aranan urunun gorunur oldugu test edilir");

        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("AutomatiUrl"));
    extentTest.info("automatione xercise url ye girin");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        Assert.assertTrue(automationePage.anaSayfa.isDisplayed());
        extentTest.info("ana sayfanın gorunur oldugunu dogrulayin");


        // 4. 'Ürünler' butonuna tıklayın
        automationePage.urunler.click();
        extentTest.info("urunler sayfasına tıklayin");

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(automationePage.tumUrunler.isDisplayed());
        extentTest.info("butun urunlerin gorunur oldugunu dogrulayin");

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        automationePage.aramaKutusu.sendKeys("Blue Top");
        automationePage.aramaButonu.click();
        extentTest.info("arama kutusuna urun adi girin ve aratın");

        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(automationePage.arananUrun.isDisplayed());

        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        Assert.assertTrue(automationePage.BlueTop.isDisplayed());
        extentTest.info("aranan urunude urun isminin gorunur oldugunu dogrulayin");














    }
}
