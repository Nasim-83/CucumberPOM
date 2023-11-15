package com.crm.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/com/crm/feature",
        glue = {"stepdefinations"}
//        tags={"~@SmokeTest"}
              )
public class TestRunner {

}
