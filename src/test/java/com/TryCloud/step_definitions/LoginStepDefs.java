package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {


    LoginPage loginPage = new LoginPage();

    @Given("user navigate to the application")
    public void user_navigate_to_the_application() {

       Driver.getDriver().get("http://qa2.trycloud.net/index.php/login");

    }


    @Then("user logged in with a valid credentials")
    public void user_logged_in_with_a_valid_credentials() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("trycloud_username"));
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("trycloud_password"));
    }

    @Then("user click on the login button")
    public void user_click_on_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the user is redirected to the dashboard page")
    public void the_user_is_redirected_to_the_dashboard_page() {


        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Dashboard"));


    }

}
