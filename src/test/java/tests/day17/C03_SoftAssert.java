package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilis.BeforeMethodAfterMethod;

public class C03_SoftAssert extends BeforeMethodAfterMethod {

    /* Hard Assertions : JUNit'te öğrendiğimiz assertion ile aynıdır.
     Assert.assertTrue();  Assert.assertFalse();  Assert.assertEquals();
     Hard Assertions'da herhangi bir assertion failed olursa, test method'un çalışmasını durdurur
     ve kalan kodları yürütmez.(stop execution
     Soft Assert : Kullanabilmek için obje oluştururuz, oluşturduktan sonra obje ismi ile kullanırız,
     Herhangi bir hata verdiğinde test methodu
     çalışmaya devam eder, en sonra rapor verir.
     baslangıc  SoftAssert objeadı=new SoftAssert();  bitis objeadı.assertAll();

     */


    @Test
    public void test01(){
        SoftAssert softAssert=new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon11"),"girdiginiz kelimeyi icermiyor");
        //burda Amazon11 hatali oldugu icin testler durmadan calisti en sonda AssertAll methodu ile rapor verdi

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled());
        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
       softAssert.assertTrue(sonuc.isDisplayed());
        //6-arama sonucunun Nutella içerdigini test edin
       softAssert.assertTrue(sonuc.getText().contains("Nutella"));
       softAssert.assertAll();
    }
}
