package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilis.Driver;

public class C01_FacebookTest {



    @Test
    public void test01(){

        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();

          //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
       facebookPage.email.sendKeys(faker.internet().emailAddress());
       facebookPage.password.sendKeys(faker.internet().password());
       facebookPage.login.click();

       //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilamadi.isDisplayed());


    }
}
