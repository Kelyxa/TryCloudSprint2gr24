package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FilesPage extends BasePage {


        @FindBy(xpath = "(//a[@data-sort='name'])[1]")
        public WebElement nameButton;

        @FindBy(xpath = "(//a[@data-sort='size'])[1]")
        public WebElement sizeButton;

        @FindBy(xpath = "(//a[@data-sort='mtime'])[1]")
        public WebElement modifiedButton;

        @FindBy(xpath = "//a[@class='nav-icon-files svg active']")
        public WebElement allFilesButton;

        @FindBy(xpath="//label[@for='select_all_files']")
        public WebElement selectAllCheckbox;

        @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[2]/div/a/span[1]")
        public WebElement totalFilesAndFolders;

        @FindBy(xpath = "//span[@class='nametext']/span[1]")
        public List<WebElement> listOfFileNames;

        public List<String> getAllFileNameText() {
                List<String> fileText=new ArrayList<>();
                List<WebElement>element=Driver.getDriver().findElements(By.xpath("//span[@class='nametext']/span[1]"));

                for (WebElement each : element) {
                        fileText.add(each.getText());
                }
                return fileText;
        }



}
