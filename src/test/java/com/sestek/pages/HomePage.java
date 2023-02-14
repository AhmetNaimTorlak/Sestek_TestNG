package com.sestek.pages;

import com.sestek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//span[text()='The Best Speech Recognition']")
    public WebElement homePageTextFirstPart_loc;

    @FindBy(xpath = "//*[text()=' Technology on the Market.']")
    public WebElement homePageTextSecondPart_loc;

    @FindBy(xpath = "//a[text()='Read Comparison Test']")
    public WebElement readComparsionTestBTN_loc;

    @FindBy(xpath = "//a[text()='See How it Works']")
    public WebElement seeHowItWorksBTN_loc;


}


