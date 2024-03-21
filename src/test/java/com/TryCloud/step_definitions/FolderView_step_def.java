//package com.TryCloud.step_definitions;
//
//import com.TryCloud.pages.BasePage;
//import com.TryCloud.pages.FilesPage;
//import com.TryCloud.pages.LoginPage;
//import com.TryCloud.utilities.BrowserUtils;
//import com.TryCloud.utilities.ConfigurationReader;
//import com.TryCloud.utilities.Driver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class FolderView_step_def {
//    LoginPage loginPage = new LoginPage();
//    FilesPage filesPage = new FilesPage();
//
//    @Given("user is logged in")
//    public void userIsLoggedIn() {
//        loginPage.login();
//
//    }
//
//
//    @When("user clicks on the files icon at top left")
//    public void user_clicks_on_the_files_icon_at_top_left() {
//        loginPage.files.click();
//    }
//
//    @When("user clicks on Name button")
//    public void user_clicks_on_name_button() {
//        BrowserUtils.sleep(2);
//        filesPage.nameButton.click();
//    }
//
//    @Then("user sees list in alphabetical order")
//    public void user_sees_list_in_alphabetical_order() {
//
//    }
//
//
//    @When("user clicks on the Size button")
//    public void userClicksOnTheSizeButton() {
//        BrowserUtils.sleep(5);
//        filesPage.sizeButton.click();
//    }
//
//    @Then("user sees list in order based on size")
//    public void userSeesListInOrderBasedOnSize() {
//    }
//
//    @When("user clicks on the Modified button")
//    public void userClicksOnTheModifiedButton() {
//        filesPage.modifiedButton.click();
//    }
//
//    @Then("user sees list in order of modified dates")
//    public void userSeesListInOrderOfModifiedDates() {
//    }
//
//    @When("user clicks on All files button")
//    public void userClicksOnAllFilesButton() {
//        filesPage.allFilesButton.click();
//    }
//
//    @And("user clicks on Select All checkbox")
//    public void userClicksOnSelectAllCheckbox() {
//        filesPage.selectAllCheckbox.click();
//    }
//
//    @Then("user sees all checkboxes are checked")
//    public void userSeesAllCheckboxesAreChecked() {
//    }
//
//    @And("total values of folders and files are displayed")
//    public void totalValuesOfFoldersAndFilesAreDisplayed() {
//    }
//
//
//}
//}
