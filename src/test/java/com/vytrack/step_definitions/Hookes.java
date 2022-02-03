package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookes {

    @Before
    public void setUP(){
        System.out.println("\tThis is coming from BEFORE");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUPDb(){
        System.out.println("\tconnecting to database... ");
    }

    @After("@db")
    public void tearDownDb(){
        System.out.println("\tdisconnecting to database... ");
    }


}
