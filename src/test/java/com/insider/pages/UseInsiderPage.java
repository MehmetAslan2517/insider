package com.insider.pages;

import com.insider.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UseInsiderPage {

    public UseInsiderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "")
    public WebElement m;

}
