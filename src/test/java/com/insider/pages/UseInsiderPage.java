package com.insider.pages;

import com.insider.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UseInsiderPage {

    public UseInsiderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Company'] ")
    public WebElement companyButton;

    @FindBy(xpath = "//a[.='Careers'] ")
    public WebElement careersButton;

    @FindBy(xpath = "//h2[.='Life at Insider'] ")
    public WebElement lifeAtInsiderText;

    @FindBy(xpath = "//a[.='See all teams'] ")
    public WebElement seeAllTeamsText;

    @FindBy(xpath = "//h3[contains(text(),'Our Locations')]")
    public WebElement ourLocationsText;


}
