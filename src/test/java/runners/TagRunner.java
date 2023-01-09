package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/01_Tags.feature"},
        glue = "stepdefinitions",
        tags = "@smoke",//sadece @smoke tgine sahip olan senaryoları çalıştırır
        dryRun = false
)

public class TagRunner {
}
