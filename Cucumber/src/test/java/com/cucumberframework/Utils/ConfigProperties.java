package com.cucumberframework.Utils;

import org.aeonbits.owner.Config;
@Config.Sources({
        "file:src\\test\\resources\\propertyfiles\\${environment}.properties"
})
public interface ConfigProperties extends Config {

    @Key("secretkey")
    String getsecretkey();
    @Key("baseURI")
    String getBaseURI();
    @Key("basePath")
    String getBasePath();


}
