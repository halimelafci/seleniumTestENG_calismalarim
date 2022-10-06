package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.security.auth.x500.X500Principal;

public class AutomationePage {

    public AutomationePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//img[@src=\"/static/images/home/logo.png\"]")
    public WebElement anaSayfa;

    @FindBy(xpath = "//a[@href=\"/products\"]")
    public WebElement urunler;

    @FindBy(xpath = "//h2[@class=\"title text-center\"]")
    public WebElement tumUrunler;

    @FindBy(xpath = "//input[@id=\"search_product\"]")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//button[@id=\"submit_search\"]")
    public WebElement aramaButonu;

    @FindBy(xpath = "//div[@class=\"productinfo text-center\"]")
    public WebElement arananUrun;

    @FindBy(xpath = "(//h2['Blue Top'])[3]")
     public WebElement BlueTop;


}
