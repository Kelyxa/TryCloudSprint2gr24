package com.TryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryCloudPage extends BasePage {


    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement files;

    @FindBy(xpath = "//div[@role='tooltip']]")
    public WebElement arrowSign;


    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement newFolderText2;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusButton;

    @FindBy(xpath = "(//span[@class='displayname'])[1]")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadIcon;

    @FindBy(xpath = "//span[@class='icon icon-folder svg']")
    public WebElement newFolderButton;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[1]")
    public WebElement getNewFolder3Dots;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement newUpload3Dots;

    @FindBy(xpath = "//span[.='Delete folder']")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFilesTrashBin;

    @FindBy(xpath = "(//span[@class='info'])[3]")
    public WebElement totalNumFilesAndFolders;


}
