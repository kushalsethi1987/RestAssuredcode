package LearningRestAssured;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LearningRestAssuredSelf {

   public static void main (String...a)
   {
       Response response = given().auth().basic("sk_test_WJTlE8wgK2mZ6HLN7RqZdx6O","").
               formParam("email","testingbluestacks@gmail.com").
               post("https://api.stripe.com/v1/customers").then().extract().response();
       System.out.println(response.asString());
   }
}
