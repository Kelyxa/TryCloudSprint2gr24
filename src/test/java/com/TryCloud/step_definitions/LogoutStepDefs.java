package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.LogoutPage;
import com.TryCloud.utilities.BrowserUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementNotInteractableException;





public class LogoutStepDefs {


    LogoutPage logoutPage = new LogoutPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        loginPage.userName.sendKeys("employee57");
        loginPage.passWord.sendKeys("Employee123");
        loginPage.loginButton.click();


    }
    @When("User click on profile button")
    public void user_click_on_profile_button() {
        logoutPage.profileIcon.click();
    }
    @When("User click on Logout button")
    public void user_click_on_logout_button() {
        logoutPage.logoutLink.click();
    }

    @Then("Users should end up in login page")
    public void users_should_end_up_in_login_page() {
        BrowserUtils.verifyTitle("Trycloud");


    }

    @When("User clicks on the step back arrow button")
    public void user_clicks_on_the_step_back_arrow_button() {
       try {
           logoutPage.goBackArrow.click();
       }catch (ElementNotInteractableException e){
           e.printStackTrace();
       }



    }


    @Then("User should not go back to the home page again")
    public void user_should_not_go_back_to_the_home_page_again() {

        BrowserUtils.verifyTitle("Trycloud");
    }


}
