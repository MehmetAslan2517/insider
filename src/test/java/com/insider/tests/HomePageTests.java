package com.insider.tests;

import com.insider.pages.UseInsiderPage;
import com.insider.utilities.BrowserUtils;
import com.insider.utilities.ConfigurationReader;
import com.insider.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTests {

    UseInsiderPage homepage = new UseInsiderPage();

    @BeforeClass
    public void accessingHomepage(){

        //when user open insider homepage on the browser which is written in the properties
        Driver.getDriver().get(ConfigurationReader.getProperty("homepage"));

    }

    //Visit https://useinsider.com/ and check Insider home page is opened or not
    @Test
    public void homePageTest(){

        //expected result
        String expectedTitle = "#1 Leader in Individualized, Cross-Channel CX — Insider";

        //actual result
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        //then user can access homepage (Verify homepage is opened)
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    //Select the “Company” menu in the navigation bar, select “Careers” and check Career
    //page, its Locations, Teams, and Life at Insider blocks are open or not

    @Test
    public void careerTest(){

        homepage.companyButton.click();
        homepage.careersButton.click();
        Assert.assertTrue(homepage.lifeAtInsiderText.isDisplayed());
        Assert.assertTrue(homepage.seeAllTeamsText.isDisplayed());
        Assert.assertTrue(homepage.ourLocationsText.isDisplayed());

    }

    /*
    Go to https://useinsider.com/careers/quality-assurance/, click “See all QA jobs”, filter
    jobs by Location: “Istanbul, Turkey”, and Department: “Quality Assurance”, check the
    presence of the job list
     */

    @Test
    public void jobList(){

        homepage.seeAllTeamsText.click();
        homepage.qualityAssuranceText.click();


    }

}
