package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepDefinition {
    @When("kullanıcı arama kısmına {string} kelimesini aratır")
    public void kullanıcıAramaKısmınaKelimesiniAratır(String key) {
        GoogleSearchPage sp= new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);
    }

    @Then("kullanıcı sayfada {string} geçtiğini doğrular")
    public void kullanıcıSayfadaGeçtiğiniDoğrular(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
        Driver.quitDriver();
    }
}
