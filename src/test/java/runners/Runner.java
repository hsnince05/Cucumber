package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // raporların daha okunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt"
        },
        monochrome=true, // raporlarin console da okunakli sekilde cikmasi icin
        features = "./src/test/resources/features",// features folder path
        glue = {"stepdefinitions","hooks"}, //stepdefinitions path
        tags = "@failed_scenario",//tags = "@iphone or @Tesla"//tags = "@iphone and @Tesla"//tags = "@iphone"//tags = "@google_search"
        dryRun = false


)

public class Runner {
}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
// Runner Class, features file lar ile step definitions i birbirine baglar