package tests.practice_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilis.BeforeMethodAfterMethod;

public class C01 extends BeforeMethodAfterMethod {



    @Test
    public void test01() throws InterruptedException {

           // ...Exercise3...
          // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

         //fill the firstname
     WebElement firstName= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
      firstName.sendKeys("Halime");

         //fill the lastname
        WebElement lastName=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastName.sendKeys("Lafci");


         //check the gender
        driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();

         //check the experience
        driver.findElement(By.xpath("//input[@id=\"exp-0\"]")).click();

         //fill the date
       WebElement tarih= driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
       tarih.sendKeys("28.09.2022");
        Thread.sleep(3000);

         //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();



         //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

         //choose your continent -> Antartica
        WebElement dropDownContinent=driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(dropDownContinent);
        select.selectByVisibleText("Antartica");

         //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//select[@id=\"selenium_commands\"]/option[1]")).click();

        //click submit button
        driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();

}
}
