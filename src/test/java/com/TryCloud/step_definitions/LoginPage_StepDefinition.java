package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

public class LoginPage_StepDefinition {


    LoginPage loginPage = new LoginPage();

    @Given("Users Log to the application Trycloud")
    public void Users_Log_to_the_application_Trycloud() {

        Driver.getDriver().get(ConfigurationReader.getProperty("trycloud_url"));

    }

    @Then("user logged in with a valid credentials")
    public void user_logged_in_with_a_valid_credentials(Map<String, String> credentials) {
        loginPage.userName.sendKeys(credentials.get("username"));
        loginPage.passWord.sendKeys(credentials.get("password"));


    }

    @Then("user click on the login button")
    public void user_click_on_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the user is redirected to the dashboard page")
    public void the_user_is_redirected_to_the_dashboard_page() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains("dashboard"));


    }


    @Then("user hit the Enter key from the keyboard")
    public void userHitTheEnterKeyFromTheKeyboard() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(loginPage.passWord, Keys.ENTER).perform();

    }

    @Given("the user enters invalid credentials")
    public void theUserEntersInvalidCredentials(Map<String, String> credentials) {

        loginPage.userName.sendKeys(credentials.get("user"));
        loginPage.passWord.sendKeys(credentials.get("pass"));
        loginPage.loginButton.click();
    }


    @And("an error message should be displayed {string}")
    public void anErrorMessageShouldBeDisplayed(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.pWrongUsernamePassword.getText();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }


    @Given("the user enters a valid password")
    public void theUserEntersAValidPassword(Map<String, String> validPassword) {
        loginPage.passWord.sendKeys(validPassword.get("passWord"));


    }

    @When("the user leaves the username field empty")
    public void theUserLeavesTheUsernameFieldEmpty() {
        loginPage.userName.clear();
        loginPage.loginButton.click();
    }

    @Then("the user should see the  {string} ,message for the username field")
    public void theUserShouldSeeTheMessageForTheUsernameField(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.passWord.getText();
        Assert.assertTrue(expectedErrorMessage.contains(actualErrorMessage));
    }

    @Given("the user enters a valid username")
    public void theUserEntersAValidUsername(Map<String, String> validUsername) {
        loginPage.userName.sendKeys(validUsername.get("username"));

    }

    @When("the user leaves the password field empty")
    public void theUserLeavesThePasswordFieldEmpty() {
        loginPage.passWord.clear();
        loginPage.loginButton.click();
    }

    @Then("the user should see the  {string},message for the password field")
    public void theUserShouldSeeTheMessageForThePasswordField(String expectedErrorMsg) {
        String actualErrorMessage = loginPage.passWord.getText();
        Assert.assertTrue(expectedErrorMsg.contains(actualErrorMessage));
    }


    @Then("the password field should be masked with dots")
    public void thePasswordFieldShouldBeMaskedWithDots() {
        loginPage.passWord.getAttribute("type");
    }

    @And("the user click on the icone eye option")
    public void theUserClickOnTheIconeEyeOption() {
        loginPage.iconeEyeOption.click();
    }

    @Then("the user should see the entered password explicitly")
    public void theUserShouldSeeTheEnteredPasswordExplicitly() {
        String actualPassword = loginPage.passWord.getAttribute("type");
        Assert.assertTrue(actualPassword.contains("text"));
    }

    @Given("the user clicks on the {string} link")
    public void theUserClicksOnTheLink(String expectedLink) {
        loginPage.linkForgotPassword.click();
    }

    @When("the user is redirected to the password reset page")
    public void theUserIsRedirectedToThePasswordResetPage() {
        loginPage.inputResetPasswordSubmit.isDisplayed();

    }

    @Then("the user should see a {string} button")
    public void theUserShouldSeeAButton(String expectedButton) {
        String actualButton = loginPage.inputResetPasswordSubmit.getText();
        Assert.assertTrue(expectedButton.contains(actualButton));
    }

    @Given("the user should see a valid placeholder on the {string} on the box input")
    public void theUserShouldSeeAValidPlaceholderOnTheOnTheBoxInput(String expectedInputName) {
        String actualInputName = loginPage.userName.getAttribute("placeholder");
        Assert.assertTrue(expectedInputName.contains(actualInputName));
    }

    @Then("the user should see a valid placeholder on the {string} field")
    public void theUserShouldSeeAValidPlaceholderOnTheField(String expectedInputPass) {
        String actualInputPass = loginPage.passWord.getAttribute("placeholder");
        Assert.assertTrue(actualInputPass.contains(expectedInputPass));
    }

    @Given("the user enters a username with any case {string}")
    public void theUserEntersAUsernameWithAnyCaseEMPLOYEE(String expectedUserName) {
        loginPage.userName.sendKeys(expectedUserName);

    }

    @Then("the user enters invalid password")
    public void theUserEntersInvalidPassword(Map<String, String> invalidPassword) {

        for (int i = 0; i < 5; i++) {

            loginPage.passWord.sendKeys(invalidPassword.get("pass"));
            loginPage.loginButton.click();
            loginPage.passWord.clear();
        }


    }


    @And("my next login attempt should be delayed by 30 seconds")
    public void myNextLoginAttemptShouldBeDelayedBySeconds() {

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    @And("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        loginPage.ThrottledMsg.getText();


    }
}
