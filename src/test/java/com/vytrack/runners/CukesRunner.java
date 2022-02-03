package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",//test description
        glue = "com/vytrack/step_definitions", //test implementation
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}
