package tests.day20_SmokeTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilis.ConfigReader;
import utilis.Driver;

public class C03_E2ETesti {

    @Test
    public void E2ETest() throws InterruptedException {
        //https://www.hotelmycamp.com adresine git.
        HMCPage hmcPage=new HMCPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hmcPage.ilkLogin.click();

       //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        //Login butonuna tıklayın.
        hmcPage.username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.login.click();



        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("HMCValidPassword")).
                sendKeys(Keys.ENTER).perform();
        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        Thread.sleep(3000);
        hmcPage.hotelManagement.click();
        Thread.sleep(2000);
        hmcPage.roomReservation.click();
        Thread.sleep(2000);
        hmcPage.addRoom.click();
        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker = new Faker();
        hmcPage.iduserName.sendKeys("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("1500").sendKeys(Keys.TAB).sendKeys("10/02/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).sendKeys("skajdlaksjdaasd")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //Save butonuna tıklayın.
        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hmcPage.roomReservationText.isDisplayed());
        //OK butonuna tıklayın.
        hmcPage.okButton.click();


    }
}
