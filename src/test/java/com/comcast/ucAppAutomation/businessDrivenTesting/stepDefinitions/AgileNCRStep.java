package com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.comcast.ucAppAutomation.mobile.pages.android.AgendaPage;
import com.comcast.ucAppAutomation.utils.DriverFactory;
import com.comcast.ucAppAutomation.mobile.pages.android.HomePage;
import com.comcast.ucAppAutomation.mobile.pages.android.SpeakersPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class AgileNCRStep {
 
    DriverFactory df = new DriverFactory();
    HomePage hp = new HomePage();
    AgendaPage ag = new AgendaPage();
    SpeakersPage sp = new SpeakersPage();
 
    @Test
    @Given("^user is on Application Home Page$")
    public void user_is_on_Application_Home_Page() throws MalformedURLException  {
        hp.verifyHomePage();
    }
    @Then("^user gets an option to choose Agenda, Speakers, Locaton and My sechedule$")
    public void user_gets_an_option_to_choose_Agenda_Speakers_Locaton_and_My_sechedule() {
        hp.verifyHomePageOptions();
    }
 
    @When("^user selects Agenda$")
    public void user_selects_Agenda() {
        hp.clickAgenda();
    }
    @Then("^user is on Agenda Screen$")
    public void user_is_on_Agenda_Screen() {
        ag.verifyAgendaPage();
    }
    @When("^user chooses to go back$")
    public void user_chooses_to_go_back() {
        hp.clickBack();
    }
    @When("^user selects Speakers$")
    public void user_selects_Speakers() {
        hp.clickSpeakers();
    }
    @Then("^user is on Speakers Screen$")
    public void user_is_on_Speakers_Screen() {
        sp.verifySpeakersPage();
    }
}
