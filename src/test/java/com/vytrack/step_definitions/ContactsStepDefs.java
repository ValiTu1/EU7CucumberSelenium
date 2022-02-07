package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Given("the user logged is as {string}")
    public void the_user_logged_is_as(String userType) {
        //go to login page
       // Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username = null;
        String password = null;

        if(userType.equals("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        }else if(userType.equals("sales manager")){
            username = ConfigurationReader.get("salesmanager_username");
            password = ConfigurationReader.get("salesmanager_password");
        }else if(userType.equals("store manager")){
            username = ConfigurationReader.get("storemanager_username");
            password = ConfigurationReader.get("storemanager_password");
        }else{
            System.out.println("There is no user with this name");
        }

        //send username and password and login
        new LoginPage().login(username, password);

    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        System.out.println("The size of menu options is:" + menuOptions.size());
        System.out.println("menuOptions = " + menuOptions);
        BrowserUtils.waitFor(1);

        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);


        Assert.assertEquals(menuOptions, actualOptions);
    }

    @When("the use logs in using following credentials")
    public void theUseLogsInUsingFollowingCredentials(Map<String, String> userInfo) {

        System.out.println(userInfo);

        //use map information to login and also verify firstname and lastname

        //login with map info
        new LoginPage().login(userInfo.get("username"), userInfo.get("password"));

        //verify firstname and lastname
        String actualFullName = new DashboardPage().getUserName();
        System.out.println(actualFullName);
        String expectedUserName = userInfo.get("firstname") + " " + userInfo.get("lastname");

        Assert.assertEquals(expectedUserName, actualFullName);
    }
}
