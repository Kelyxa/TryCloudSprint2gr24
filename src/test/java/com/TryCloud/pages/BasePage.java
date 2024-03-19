package com.TryCloud.pages;




import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;



    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement files;

    @FindBy(xpath = "//a[@aria-label='Photos']")
    public WebElement photos;

    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activity;

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talk;

    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contacts;

    @FindBy()
    public WebElement circles;

    @FindBy()
    public WebElement calendar;

    @FindBy()
    public WebElement deck;

    @FindBy()
    public WebElement searchButton;

    @FindBy()
    public WebElement bellButton;

    @FindBy()
    public WebElement searchContacts;

    @FindBy()
    public WebElement userIcon;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        passWord.sendKeys(passwordStr);
        loginButton.click();

    }


    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }

}
