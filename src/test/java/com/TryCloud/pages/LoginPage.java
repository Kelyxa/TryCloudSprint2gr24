package com.TryCloud.pages;


import com.TryCloud.utilities.Driver;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;




    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        passWord.sendKeys(passwordStr);
        loginButton.click();
        // verification that we logged
    }

}
