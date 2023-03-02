package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
       Hooks: Her bir Scenario yada Scenari Outline dan ONCE yada SONRA calismasini istedigimiz methodlar konulur
       @Before ve @After Metholdarini icerir
       Burada onemli olan raporlama isleminin ekran goruntusuyle birlikte HOOks yardimiyla yapilmasidir.
     */

    @Before
    public void setUpScenarios(){
        System.out.println("Before Methodu");
    }

    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Methodu");
    //      Eger bir Scenario FAIL ederse, ekran goruntusu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

//                          ekran goruntusu   --       file uzantisi --  ekran goruntusu adi --dinamik olmasi icin
            scenario.attach(failedScreenshot, "image/png", "failed_scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}
