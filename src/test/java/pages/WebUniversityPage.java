package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilis.Driver;

public class WebUniversityPage {
   public WebUniversityPage(){
       PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@type=\"text\"]")
    public   WebElement TodosEkle;

}
