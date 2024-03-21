package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModulesPage {

    public ModulesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "(//li[@data-id='dashboard'])[1]")
    public WebElement dashboardModule;

    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//li[@data-id='photos'])[1]")
    public WebElement photosModule;


    @FindBy(xpath = "(//li[@data-id='activity'])[1]")
    public WebElement activityModule;


    @FindBy(xpath = "(//li[@data-id='spreed'])[1]")
    public WebElement talkModule;


    @FindBy(xpath = "(//li[@data-id='contacts'])[1]")
    public WebElement contactsModule;


    @FindBy(xpath = "(//li[@data-id='circles'])[1]")
    public WebElement circlesModule;

    @FindBy(xpath = "(//li[@data-id='calendar'])[1]")
    public WebElement calendarModule;
    @FindBy(xpath = "(//li[@data-id='deck'])[1]")
    public WebElement deckModule;

    @FindBy(xpath = "//div[@class='header-menu unified-search']")
 public WebElement magnifySearchIcon;

    @FindBy(xpath = "//input[@type='search']")
 public WebElement searchInput;

    @FindBy(xpath = "//h3")
    public WebElement file;

    @FindBy(xpath = "//a[@class='filename']")
    public WebElement fileName;

    @FindBy(xpath = "//div[@class='modal-title']")
    public WebElement sideBar;


    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement logoIcon;
}
