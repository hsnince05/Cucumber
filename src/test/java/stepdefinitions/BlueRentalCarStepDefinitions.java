package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalCarsLoginPage;
import pages.BlueRentalCarsPage;
import utilities.Driver;

public class BlueRentalCarStepDefinitions {
    BlueRentalCarsPage blueRentalCarsPage ;
    BlueRentalCarsLoginPage blueRentalCarsLoginPage;

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);

    }
    @When("Kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        blueRentalCarsPage = new BlueRentalCarsPage();
        blueRentalCarsPage.loginButton.click();
    }
    @When("Kullanici {string} girer")
    public void kullanici_girer(String string) {
        blueRentalCarsLoginPage = new BlueRentalCarsLoginPage();
        blueRentalCarsLoginPage.email.sendKeys(string);

    }
    @When("{string} girer")
    public void girer(String string) {
        blueRentalCarsLoginPage = new BlueRentalCarsLoginPage();
        blueRentalCarsLoginPage.password.sendKeys(string);

    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {
        blueRentalCarsLoginPage = new BlueRentalCarsLoginPage();
        blueRentalCarsLoginPage.login.click();

    }
    @Then("login islemi gerceklestigini dogrular")
    public void login_islemi_gerceklestigini_dogrular() {
        Driver.wait(2);
        blueRentalCarsPage = new BlueRentalCarsPage();
        Assert.assertFalse(blueRentalCarsPage.kullaniciAdi.getText().equals("Login"));
    }


}
