package com.insider.tests;

import com.insider.utilities.ConfigurationReader;
import com.insider.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests {

    //Visit https://useinsider.com/ and check Insider home page is opened or not
    @Test
    public void homePageTest(){

        //when user open insider homepage on the browser which is written in the properties
        Driver.getDriver().get(ConfigurationReader.getProperty("homepage"));

        //expected result
        String expectedTitle = "#1 Leader in Individualized, Cross-Channel CX — Insider";

        //actual result
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        //Verify homepage is opened
        Assert.assertEquals(actualTitle,expectedTitle);

    }


}
