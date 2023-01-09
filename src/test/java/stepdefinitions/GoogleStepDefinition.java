package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDefinition {
    @Given("kullanıcı google sayfasındadır")
    public void kullanıcıGoogleSayfasındadır() {
        Driver.getDriver().get("https://www.google.com.tr/");
    }

    @When("kullanıcı arama kısmına samsung kelimesini aratır")
    public void kullanıcıAramaKısmınaSamsungKelimesiniAratır() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");
    }


    @Then("kullanıcı sayfada samsung geçtiğini doğrular")
    public void kullanıcıSayfadaSamsungGeçtiğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));
        Driver.quitDriver();
    }


}
