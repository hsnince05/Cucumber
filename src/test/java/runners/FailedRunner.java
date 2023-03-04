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
                "rerun:target/failedscenarios.txt"
        },
        monochrome=true, // raporlarin console da okunakli sekilde cikmasi icin
        features = "@target/failed_scenarios.txt",// .txt dosyo yolu
        glue = {"stepdefinitions","hooks"}, //stepdefinitions path
        dryRun = false

)
public class FailedRunner {
}
