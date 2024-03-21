package com.TryCloud.pages;


import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongUsernamePassword;

    @FindBy(id="message")
    public WebElement errorMessage;

    @FindBy(css = "a[class='toggle-password'] img")
    public WebElement iconeEye;

    @FindBy(id = "lost-password")
    public WebElement linkLostPassword;

    @FindBy(css = "input[id='reset-password-submit']")
    public WebElement inputResetPasswordSubmit;



    public void login(String userName, String passWord) {
        LoginPage loginPage=new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

    }



}