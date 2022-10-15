package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

   public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login1;

    @FindBy(xpath = "//*[@name=\"email\"]")
    public WebElement mail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement login2;

    @FindBy(xpath = "//button[@id=\"dropdown-basic-button\"]")
    public WebElement basariliGiris;
}
