package com.cucumberframework.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

@CucumberOptions
        (
                features = "FeatureFiles/CreateCustomerAPI.feature",
                glue = {"com/cucumberframework/stepdefinition"}
        )

public class testRunner extends AbstractTestNGCucumberTests{
    private TestNGCucumberRunner testNGCucumberRunner;
    @Test()
    public void testRunnerWithTestng() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

}
