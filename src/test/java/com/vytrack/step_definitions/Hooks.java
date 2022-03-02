package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.DBUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUP(){
        System.out.println("\tThis is coming from BEFORE");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUPDb(){
        System.out.println("Connection to the database...");
        DBUtils.createConnection();
    }

    @After("@db")
    public void tearDownDb(){
        System.out.println("Closing the database...");
        DBUtils.destroy();
    }


}
