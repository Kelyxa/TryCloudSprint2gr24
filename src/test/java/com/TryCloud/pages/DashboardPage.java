package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@tabindex='-1']//a")
    public List<WebElement> allTopModules;
    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement userIcon;
    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement usernameText;
    @FindBy(xpath = "//ul[@class='statuses']")
    public WebElement statusContaineronTheDashboard;
    @FindBy(xpath = "//a[contains(@class, 'edit-panels')]")
    public WebElement customizeButton;
    @FindBy(xpath = "//input[@class='checkbox']/..//label")
    public List<WebElement> widgetButtons;
    @FindBy(xpath = "//label[@for='status-checkbox-status']")
    public WebElement statusButtonAlone;
    @FindBy(xpath = "//button[contains(@class, 'user-status-menu-item__toggle')]//span")
    public WebElement setStatusButton;
    //@FindBy(xpath = "//input[@type='radio']/..//label")
    @FindBy(xpath = "//label[contains(@class, 'icon-user-status')]")
    public List<WebElement> statusButtons;
    @FindBy(xpath = "//input[@type='radio']/..//label//em")
    public List<WebElement> elementsForTextRemoval;
    @FindBy(xpath = "//button[@rel='noreferrer noopener']")
    public WebElement closeButtonForCustomizeWidgetsWindow;

    public static WebElement findWidgetButton (List<WebElement> widgetButtons, String expectedWidgetButton) {
        for (WebElement widgetButton : widgetButtons) {
            if (widgetButton.getText().equals(expectedWidgetButton)) {
                return widgetButton;
            }
        }
        return null; // If no matching element is found
    }

}
