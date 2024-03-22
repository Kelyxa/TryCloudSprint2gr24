package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.DashboardPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Dashboard_StepDef extends BasePage {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("user should see below modules on the header")
    public void user_should_see_below_modules_on_the_header(List<String> expectedTopModule) {
        BrowserUtils.waitForVisibility(dashboard, 10);
        List<String> actualTopModules = new ArrayList<>();
        for (WebElement eachTopModule : dashboardPage.allTopModules) {
            actualTopModules.add(eachTopModule.getAttribute("aria-label")); // eachTopModule is WebElement type; eachTopModule.getText() is String type.
        }
        System.out.println("actualTopModules = " + actualTopModules);
        System.out.println("expectedTopModule = " + expectedTopModule);
        Assert.assertEquals(expectedTopModule, actualTopModules);
    }
    @When("user clicks on the user icon")
    public void user_clicks_on_the_user_icon() {
        dashboardPage.userIcon.click();
    }
    @When("user should see the username")
    public void user_should_see_the_username() {
        Assert.assertTrue(dashboardPage.usernameText.isDisplayed());
    }
    @Then("user should be able to click on the customize button")
    public void user_should_be_able_to_click_on_the_customize_button() {
        dashboardPage.customizeButton.click();
        String mainWindowHandle = Driver.getDriver().getWindowHandle();
        String customizeButtonWindowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(customizeButtonWindowHandle);
    }
    @Then("user is able to click on the {string} button")
    public void userIsAbleToClickOnTheButton(String expectedWidgetButtonText){
        WebElement currentWidgetButton = DashboardPage.findWidgetButton(dashboardPage.widgetButtons, expectedWidgetButtonText);
        currentWidgetButton.click();
        Assert.assertEquals(expectedWidgetButtonText, currentWidgetButton.getText());
    }
    @Then("user closes the customize widgets window")
    public void userClosesTheCustomizeWidgetsWindow() {
        dashboardPage.closeButtonForCustomizeWidgetsWindow.click();
    }
    @When("set status button is enabled on the dashboard page")
    public void setStatusButtonIsEnabledOnTheDashboardPage() {
        String mainWindowHandle = Driver.getDriver().getWindowHandle();
        boolean present;
        try {
            BrowserUtils.sleep(3);
            WebElement setStatusCheckbox = Driver.getDriver().findElement(By.xpath("//button[@class ='user-status-menu-item__toggle user-status-menu-item__toggle--inline']"));
            present = true;
        } catch (NoSuchElementException e) {
            BrowserUtils.sleep(3);
            present = false;
            dashboardPage.customizeButton.click();
            String customizeButtonWindowHandle = Driver.getDriver().getWindowHandle();
            Driver.getDriver().switchTo().window(customizeButtonWindowHandle);
            dashboardPage.statusButtonAlone.click();
            System.out.println("Set status button has been enabled!");
            BrowserUtils.sleep(2);
            dashboardPage.closeButtonForCustomizeWidgetsWindow.click();
        }

        Driver.getDriver().switchTo().window(mainWindowHandle);
        BrowserUtils.sleep(2);
    }
    @Then("user should be able to click on the set status button")
    public void user_should_be_able_to_click_on_the_set_status_button() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.sleep(2);
        dashboardPage.setStatusButton.click();
    }
    @Then("user should be able to select below status options")
    public void user_should_be_able_to_select_below_status_options(List<String> expectedSetStatusTexts) {
        String mainWindowHandle = Driver.getDriver().getWindowHandle();
        String setStatusWindowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(setStatusWindowHandle);
        List<String> actualSetStatusTexts = new ArrayList<>();
        for (WebElement eachStatusButton : dashboardPage.statusButtons) {
            eachStatusButton.click();
            String setStatusButtonText = eachStatusButton.getText();
            actualSetStatusTexts.add(setStatusButtonText);
            Driver.getDriver().switchTo().window(mainWindowHandle);
            BrowserUtils.sleep(2);
        }
        System.out.println("actualSetStatusTexts = " + actualSetStatusTexts);
        System.out.println("expectedSetStatusTexts = " + expectedSetStatusTexts);

        for(int i=0; i<expectedSetStatusTexts.size(); i++){
            String actual = actualSetStatusTexts.get(i);
            System.out.println("actual = " + actual);
            String expected = expectedSetStatusTexts.get(i);
            System.out.println("expected = " + expected);
            Assert.assertTrue(actual.contains(expected));
            System.out.println("Assertion is passed!");
        }
    }
}
