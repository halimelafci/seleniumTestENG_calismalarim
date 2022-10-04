package tests.practice_03;

import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilis.Driver;

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
    public void test01(){
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        webUniversityPage.TodosEkle.sendKeys("Kahvaltıyı hazırla");



    }
}
