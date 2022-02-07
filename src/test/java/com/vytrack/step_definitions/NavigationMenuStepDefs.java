package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {


    @When("the user clicks on the Fleet, Module")
    public void the_user_clicks_on_the_Fleet_Module() {
        System.out.println("the user clicks on the Fleet, Module");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("expected and actual titles are matching");
    }

    @When("the user clicks on the Marketing, Campaigns")
    public void the_user_clicks_on_the_Marketing_Campaigns() {
        System.out.println("the user clicks on the Marketing, Campaigns");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("expected and actual titles are matching");
    }

    @When("the user clicks on the Activities, Calendar Events")
    public void the_user_clicks_on_the_Activities_Calendar_Events() {
        System.out.println("the user clicks on the Activities, Calendar Events");
    }

    @Then("the title should be Calendars")
    public void the_title_should_be_Calendars() {
        System.out.println("expected and actual titles are matching");
    }

    @When("the users navigates to {string} {string}")
    public void the_users_navigates_to(String tab, String module) {
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.navigateToModule(tab, module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(int expectedPageNumber) {
        BrowserUtils.waitFor(5);
        int actualPageNumebr = Integer.parseInt(new ContactsPage().pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNumber, actualPageNumebr);
    }

}
