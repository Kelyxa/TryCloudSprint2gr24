package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.LoginPage;

import com.TryCloud.pages.TryCloudPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TryCloud_StepDefinitions extends TryCloudPage {

    LoginPage loginPage = new LoginPage();

    @Given("user  in login page")
    public void user_in_login_page() {
        loginPage.login(ConfigurationReader.getProperty("userName"), ConfigurationReader.getProperty("passWord"));

    }

    @Given("user clicks on files button")
    public void userClicksOnFilesButton() {
        files.click();
    }

    @Then("user clicks plus button")
    public void userClicksPlusButton() {
        BrowserUtils.sleep(3);
        plusButton.click();
    }

    @And("user selects Upload file option")
    public void userSelectsUploadFileOption() {
        BrowserUtils.sleep(3);
        uploadIcon.click();

        try {
            uploadFileButton.sendKeys("files/Elma_Cydeo_Notes (1).txt" + Keys.ENTER);
        } catch (ElementNotInteractableException e) {
            e.printStackTrace();

        }
    }

    @Then("user selects New folder option")
    public void userSelectsNewFolderOption() {
        BrowserUtils.sleep(2);
        //   newFolderButton.click();
    }

    @And("user sends new name for folder")
    public void userSendsNewNameForFolder() {
        BrowserUtils.sleep(2);
        //  newFolderText2.sendKeys("New Tesla" + Keys.ENTER);
    }

//    @Then("user locates new folder text")
//    public void userLocatesNewFolderText() {
//        arrowSign.click();
//        BrowserUtils.sleep(2);
//        newFolderButton.clear();
//    }

    //todo
    @Then("user should see new folder on the list")
    public void userShouldSeeNewFolderOnTheList() {

    }
    //=====================================>>>>>>>Scenario: user can create a new folder^^^^^^


    //TODO
//    @Then("user uploads the file")
//    public void userUploadsTheFile() {
//        BrowserUtils.sleep(3);
//
//        uploadFileButton.sendKeys("/Users/shohruhbarotov/Desktop/Readme.md");
//
//    }
    //   }
    @Given("user clicks new upload file's three dots")
    public void user_clicks_new_upload_file_s_three_dots() {
        //  newUpload3Dots.click();
    }

//    //TODO
//    @And("user should be able to see new file under the Name row")
//    public void userShouldBeAbleToSeeNewFileUnderTheNameRow() {
//
//    }

//
//    @Then("user clicks on delete option")
//    public void userClicksOnDeleteOption() {
//        deleteButton.click();
//    }
//
//    //todo
//    @And("user sees deleted files and folders in trash bin")
//    public void userSeesDeletedFilesAndFoldersInTrashBin() {
//
//    }
//
//    @Given("user should be able to see the total number of files and folders")
//    public void userShouldBeAbleToSeeTheTotalNumberOfFilesAndFolders() {
//        System.out.println("totalNumFilesAndFolders.isDisplayed() = " + totalNumFilesAndFolders.isDisplayed());

}




