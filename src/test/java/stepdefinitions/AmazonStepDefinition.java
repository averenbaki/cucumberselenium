package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import pages.AmazonSearchPage;
import utilities.Driver;

public class AmazonStepDefinition {
    @Given("kullanıcı amazon sitesine gider")
    public void kullanıcıAmazonSitesineGider() {

        Driver.getDriver().get("https://www.amazon.com.tr/");

    }

    @When("kullanıcı amazonda {string} aratır")
    public void kullanıcıAmazondaAratır(String arg0) {

        AmazonHomePage hp= new AmazonHomePage(Driver.getDriver());
        hp.searchKeyHitEnter(arg0);

    }

    @Then("kullanıcı arama sonuçlarında {string} görmelidir")
    public void kullanıcıAramaSonuçlarındaGörmelidir(String arg0) {
        AmazonSearchPage sp= new AmazonSearchPage(Driver.getDriver());
        sp.validateResultTextHasKey(arg0);
    }

    @And("kullanıcı ekran görüntüsü alır")
    public void kullanıcıEkranGörüntüsüAlır() {
        System.out.println("kullanıcı ekran görüntüsü alır");
    }

    @And("kullanıcı browser ı kapatır")
    public void kullanıcıBrowserIKapatır() {
        Driver.quitDriver();
    }
}
