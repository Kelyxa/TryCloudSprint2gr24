package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {



    public LogoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



@FindBy(css = ".avatardiv.avatardiv-shown")
    public WebElement profileIcon;



@FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutLink;


@FindBy(xpath = "//noscript")
    public WebElement goBackArrow;

}
