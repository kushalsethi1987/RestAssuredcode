package com.cucumberframework.stepdefinition;

import com.cucumberframework.Setup.CucumberSetup;
import com.cucumberframework.Utils.ConfigProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class CreateCustomerAPISteps extends CucumberSetup {
    RequestSpecification requestSpecification;
    Response response;
    JsonPath jsonresponse;

    @Given("I set the auth for the Create Customer API")
    public void i_set_the_auth_for_the_create_customer_api() {

        requestSpecification = given().auth().basic(configproperties.getsecretkey(), "");
        System.out.println("Hi BDD");
    }

    @When("I pass {string} as the email")
    public void i_pass_as_the_email(String email) {
        requestSpecification.formParam("email", email);
        System.out.println(email);
    }

    @When("I pass the sample description {string}")
    public void i_pass_the_sample_description(String description) {
        requestSpecification.formParam("description", description);
        System.out.println(description);
    }

    @When("I send the post request to the {string}")
    public void i_send_the_post_request_to_the(String endpoint)
    {
        response= requestSpecification.when().post(endpoint).then().extract().response();
        jsonresponse=response.jsonPath();
        //System.out.println(response.asString());
    }

    @Then("I should be able to create the customer")
    public void i_should_be_able_to_create_the_customer() {

        Assert.assertNotNull(jsonresponse.get("id"));
        System.out.println("Hi BDD");
    }

    @Then("the email id in the response should be {string}")
    public void the_email_id_in_the_response_should_be(String expectedEmail) {

        Assert.assertEquals(jsonresponse.get("email"),expectedEmail);
        System.out.println("Hi BDD");
    }

    @Then("the details in the description should be {string}")
    public void the_details_in_the_description_should_be(String description) {

        Assert.assertEquals(jsonresponse.get("description"),description);
        System.out.println("Hi BDD");
    }

    @Then("the status code should be {string}")
    public void the_status_code_should_be(String statusCode) {
        Assert.assertEquals(response.statusCode(),Integer.parseInt(statusCode));
        System.out.println(statusCode);
    }
}
