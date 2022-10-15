package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCPage {

        public HMCPage() {
        PageFactory.initElements(Driver.getDriver(), this);
      }

       @FindBy(xpath = "//*[text()='Log in']")
       public WebElement ilkLogin;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id=\"btnSubmit\"]")
    public WebElement login;

    @FindBy(xpath = "//div[@class=\"page-bar\"]")
    public WebElement basariliGiris;

    @FindBy(xpath = "//h2[text()='Log in']")
    public WebElement basarisizGiris;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement addHotelCodeKutusu;

    @FindBy(xpath = "//select[@id='IDGroup']" )
    public WebElement addHotelDropdown;

    @FindBy(xpath ="//button[@id='btnSubmit']" )
    public WebElement addHotelSaveButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement basariliEklendi;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement lastButtonOK;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;
    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoom;

    @FindBy(xpath = "//input[@id=\"UserName\"]")
    public WebElement iduserName;

    @FindBy(css = ".bootbox-body")
    public WebElement roomReservationText;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement okButton;


    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLogin.click();
        username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        login.click();
    }










}
