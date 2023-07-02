package com.cucumberframework.Setup;

import com.cucumberframework.Utils.ConfigProperties;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;

public class CucumberSetup {

    public static ConfigProperties configproperties;
    public static void setupFramework()
    {
        ConfigFactory.setProperty("environment","qa");
        configproperties = ConfigFactory.create(ConfigProperties.class);
        System.out.println(configproperties.getBasePath());
        System.out.println(configproperties.getBaseURI());
        RestAssured.basePath = configproperties.getBasePath();
        RestAssured.baseURI = configproperties.getBaseURI();


    }

}
