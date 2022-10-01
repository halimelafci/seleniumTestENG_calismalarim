package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilis.Driver;

public class HMCPage {

        public HMCPage() {
        PageFactory.initElements(Driver.getDriver(), this);
      }

       @FindBy(xpath = "//*[text()='Log in']")
       public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id=\"btnSubmit\"]")
    public WebElement giris;

    @FindBy(xpath = "//div[@class=\"page-bar\"]")
    public WebElement basariliGiris;

    @FindBy(xpath = "//h2[text()='Log in']")
    public WebElement basarisizGiris;
}
