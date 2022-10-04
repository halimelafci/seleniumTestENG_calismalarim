package tests.practice_03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilis.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_WebUniversity {

    //EXPLORATORY testing demek kesif testing demek yani sayifayi manuel olarak tanima testidir


    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
    // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et,
    // Selenyum çalış, Uyu)
    //Tüm yapılacakların üzerini çiz.
     //Tüm yapılacakları sil.
     //Tüm yapılacakların silindiğini doğrulayın.
    WebUniversityPage webUniversityPage=new WebUniversityPage();
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");


        List<String>isListesi=new ArrayList<>
     (Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen","Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));

        Actions actions=new Actions(Driver.getDriver());
        for (String each:isListesi ) {
            actions.click(webUniversityPage.TodosEkle).sendKeys(each, Keys.ENTER).perform();

        }
        //Tüm yapılacakların üzerini çiz.
        List<WebElement> ustunuciz=webUniversityPage.UstunuCizme;
        for (WebElement each:ustunuciz ) {
            each.click();


        }
        //Tüm yapılacakları sil.
        List<WebElement>silme=webUniversityPage.deleteButtons;
        for (WebElement each:silme) {
            each.click();


        }
        Thread.sleep(3000);
        //Tüm yapılacakların silindiğini doğrulayın.
        List<WebElement> silinmisListe=webUniversityPage.listeyiSilme;
        Assert.assertEquals(0,silinmisListe.size());


    }
}
