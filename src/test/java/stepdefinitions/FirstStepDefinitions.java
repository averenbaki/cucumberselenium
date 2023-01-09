package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinitions {
    @Given("ilk feature için cucumber indirdim")
    public void ilk_feature_için_cucumber_indirdim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given step run");
    }
    @When("senaryomu çalıştırdığımda")
    public void senaryomu_çalıştırdığımda() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When step run");
    }
    @Then("senaryomun çalıştığını konsolda görmeliyim")
    public void senaryomun_çalıştığını_konsolda_görmeliyim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then step run");
    }




}
