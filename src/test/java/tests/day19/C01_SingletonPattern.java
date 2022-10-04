package tests.day19;

import org.testng.annotations.Test;
import utilis.ConfigReader;
import utilis.Driver;

public class C01_SingletonPattern {


    @Test
    public void test01(){

        Driver obj=new Driver();
        obj.getDriver().get(ConfigReader.getProperty("amazonUrl"));

       /*
        driver classinda default cons yerine privite bir cons olusturduk ve bu sekilde
      baska claslardan obje olusturulmayacak singletonPattern bunun icin kullanilir
       illada ulasmak istersek class ismi uzerinden ulasabiliriz

        */
}
}