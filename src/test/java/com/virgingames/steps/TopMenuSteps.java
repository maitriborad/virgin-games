package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TopMenuSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }
    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().clickOnAcceptCookies();
    }
    @Then("^User can see all option on TopMenuBar$")
    public void userCanSeeAllOptionOnTopMenuBar(DataTable dataTable) {
        List<String> options = dataTable.asList(String.class);
        SoftAssert softAssert=new SoftAssert();
        for(int i = 1; i <= options.size()-1; i++){
            softAssert.assertTrue(new HomePage().isOptionsInTopMenu(options.get(i)),"'"+options.get(i)+"'not found");
        }
        softAssert.assertAll();
    }

    @And("^I click on Online Slots$")
    public void iClickOnOnlineSlots() {
        new HomePage().clickOnOnlineSlots();
    }

    @Then("^Verify that User navigated successfully with \"([^\"]*)\"$")
    public void verifyThatUserNavigatedSuccessfullyWith(String expected){
        Assert.assertTrue(new HomePage().verifyOnlineSlotsText().contains(expected),"User is not navigated");
    }

    @And("^I click on Live Casino$")
    public void iClickOnLiveCasino() {
        new HomePage().clickOnLiveCasino();
    }

    @And("^I click on Casino$")
    public void iClickOnCasino() {
        new HomePage().clickOnCasino();
    }
}
