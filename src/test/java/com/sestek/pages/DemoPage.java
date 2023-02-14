package com.sestek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage extends BasePage{

    @FindBy(xpath = "//a[@href=\"tr\"]")
    public WebElement changePageLang_loc;

    @FindBy(xpath = "//span[@id=\"lblResult\"]")
    public WebElement selectVoice_loc;

    @FindBy(xpath = "//textarea[text()='Hello, I am one of the unique voices that my company has developed to help you.']")
    public WebElement insertText_loc;

    @FindBy(xpath = "//a[@id=\"Button1\"]")
    public WebElement speakBTN_loc;

    public WebElement chooseVoice_loc(String NameOfThePerson){
        String person = "//option[text()='"+NameOfThePerson+"']";
        return driver.findElement(By.xpath(person));
    }

}
