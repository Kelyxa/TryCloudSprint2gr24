package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.FilesPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FolderView_step_def {
LoginPage loginPage=new LoginPage();
FilesPage filesPage=new FilesPage();
String firstExpectedElement;



    @Given("user is logged in")
    public void userIsLoggedIn() {
       loginPage.login();

    }


    @When("user clicks on the files icon at top left")
    public void user_clicks_on_the_files_icon_at_top_left() {
        loginPage.files.click();
        BrowserUtils.sleep(1);
    }

    @When("user clicks on Name button")
    public void user_clicks_on_name_button() {
        List<String> unSortedList= filesPage.getAllFileNameText();
        Collections.sort(unSortedList);
        firstExpectedElement = unSortedList.get(0);
        filesPage.nameButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user sees list by name")
    public void userSeesListByName() {
        System.out.println(filesPage.getAllFileNameText());
        List<String > sortedList=filesPage.getAllFileNameText();
        System.out.println("sortedList.get(0) = " + sortedList.get(0));
        System.out.println("firstExpectedElement = " + firstExpectedElement);
        Assert.assertEquals(firstExpectedElement,sortedList.get(0));

    }


    @When("user clicks on the Size button")
    public void userClicksOnTheSizeButton() {
        List<String> unSortedList= filesPage.getAllFileSize();
        Collections.sort(unSortedList);
        firstExpectedElement = unSortedList.get(0);
        filesPage.sizeButton.click();
        BrowserUtils.sleep(6);
    }

    @Then("user sees list in order based on size")
    public void userSeesListInOrderBasedOnSize() {
        System.out.println(filesPage.getAllFileSize());
        List<String> sortedList=filesPage.getAllFileSize();
        System.out.println("sortedList.get(0) = " + sortedList.get(0));
        System.out.println("firstExpectedElement = " + firstExpectedElement);
        Assert.assertEquals(firstExpectedElement,sortedList.get(0));

    }

    @When("user clicks on the Modified button")
    public void userClicksOnTheModifiedButton() {
        List<String> unSortedList= filesPage.getAllTimeStamps();
        Collections.sort(unSortedList);
        firstExpectedElement = unSortedList.get(0);
        filesPage.modifiedButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user sees list in order of modified dates")
    public void userSeesListInOrderOfModifiedDates() {
        System.out.println(filesPage.getAllTimeStamps());
        List<String> sortedList=filesPage.getAllTimeStamps();
        System.out.println("sortedList = " + sortedList.get(0));
        Assert.assertEquals(firstExpectedElement,sortedList.get(0));


    }

    @When("user clicks on All files button")
    public void userClicksOnAllFilesButton() {
        filesPage.allFilesButton.click();
    }

    @And("user clicks on Select All checkbox")
    public void userClicksOnSelectAllCheckbox() {
        filesPage.selectAllCheckbox.click();
    }


    @And("total values of folders and files are displayed")
    public void totalValuesOfFoldersAndFilesAreDisplayed() {
        WebElement totalFilesAndFolders= filesPage.totalFilesAndFolders;
        String actualTotalFilesAndFolders=totalFilesAndFolders.getText();

      //  Assert.assertEquals(totalFilesAndFolders,actualTotalFilesAndFolders);

    }



}
