package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src\\test\\resources\\features"},
        glue = {"stepdefinitions"},
        plugin ={ "html:target/reports-parallel/report.html"}
)
public class ParallelRunner {
}
