package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/features/07_Hooks.feature"},
        glue = {"stepdefinitions"},
        plugin ={ "html:target/cucumber-reports.html",
        "json:target/json-reports.json",
        "junit:target/cucumber-xml.xml",
        "pretty"}
)

public class ReportRunner {

}
