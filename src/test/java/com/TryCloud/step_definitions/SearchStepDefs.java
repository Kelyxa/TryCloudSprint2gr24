package com.TryCloud.step_definitions;

import com.TryCloud.pages.ModulesPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;

public class SearchStepDefs {
    ModulesPage modulesPage = new ModulesPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user click on Files module")
    public void userClickOnFilesModule() {

        modulesPage.filesModule.click();
    }

    @When("User click on the magnifying glass icon")
    public void user_click_on_the_magnifying_glass_icon() {

        (modulesPage.magnifySearchIcon).click();
    }

    @When("User type the file name in search input box")
    public void user_type_the_file_name_in_search_input_box() {
        modulesPage.searchInput.sendKeys("Readme" + Keys.ENTER);

        actions.moveToElement(modulesPage.file).click().perform();

    }

    @Then("User should be able to open the file and see the details side page of the file.")
    public void user_should_be_able_to_open_the_file_and_see_the_details_side_page_of_the_file() {


        Assert.assertTrue(modulesPage.fileName.getText().contains("Readme.md"));

    }


    @When("User click on Files module")
    public void usersClickOnFilesModule() {
        modulesPage.filesModule.click();

    }

    @And("User click on TryCloud icon at the top left corner")
    public void userClickOnTryCloudIconAtTheTopLeftCorner() {
        modulesPage.logoIcon.click();

    }

    @Then("Users should be able to navigate to the Dashboard page")
    public void usersShouldBeAbleToNavigateToTheDashboardPage() {
        BrowserUtils.verifyTitle("Dashboard - Trycloud");
    }
}