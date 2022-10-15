package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BeforeMethodAfterMethod;
import utilities.TestBaseCross;

public class C03_SoftAssert extends TestBaseCross {




    @Test
    public void test01() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"girdiginiz kelimeyi icermiyor");
        //burda Amazon11 hatali oldugu icin testler durmadan calisti en sonda AssertAll methodu ile rapor verdi

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled());
        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        Thread.sleep(300);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
       softAssert.assertTrue(sonuc.isDisplayed());
        //6-arama sonucunun Nutella içerdigini test edin
       softAssert.assertTrue(sonuc.getText().contains("Nutella"));
       softAssert.assertAll();
    }
}
