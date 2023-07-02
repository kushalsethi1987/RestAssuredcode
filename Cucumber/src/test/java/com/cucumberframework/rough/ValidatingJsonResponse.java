package com.cucumberframework.rough;

import com.cucumberframework.Utils.ConfigProperties;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;
import io.restassured.specification.RequestSpecification;

import java.io.File;

import static io.restassured.RestAssured.given;

public class ValidatingJsonResponse {

    public static ConfigProperties configproperties;
    @Test
    public void myMethod(){

        Response response = given().auth().basic("sk_test_WJTlE8wgK2mZ6HLN7RqZdx6O", "").
                formParam("email","ramloghia@gmail.com").
                when().post("https://api.stripe.com/v1/customers").then().extract().response();

        JsonPath json = response.jsonPath();
       System.out.println(response.asString());
       String s=json.get("id");
       System.out.println(s);

        ConfigFactory.setProperty("environment","qa");
        configproperties = ConfigFactory.create(ConfigProperties.class);
        System.out.println(configproperties.getBasePath());
        System.out.println(configproperties.getBaseURI());
        RestAssured.basePath = configproperties.getBasePath();
        RestAssured.baseURI = configproperties.getBaseURI();

    }
}
