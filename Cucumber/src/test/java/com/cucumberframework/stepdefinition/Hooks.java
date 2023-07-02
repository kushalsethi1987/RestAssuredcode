package com.cucumberframework.stepdefinition;

import com.cucumberframework.Setup.CucumberSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;

public class Hooks {
Response response;
    @Before
    public void beforeMethodOfCucumber(){
        System.out.println("This is Before cucumber");
        CucumberSetup.setupFramework();
    }

    @After
    public void afterMethodOfCucumber(){
        System.out.println("This is After cucumber");
    }

}
