package com.sestek.tests;

import com.sestek.TestBase;
import com.sestek.pages.DashBoard;
import com.sestek.pages.DemoPage;
import com.sestek.pages.HomePage;
import com.sestek.utilities.BrowserUtils;
import com.sestek.utilities.ConfigurationReader;
import com.sestek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoPageTest extends TestBase {

    HomePage homePage = new HomePage();
    DashBoard dashBoard = new DashBoard();
    DemoPage demoPage = new DemoPage();


    @Test
    public void demoPageTest(){
        extentLogger = report.createTest("SESTEK DemoPage Test");

        extentLogger.info("The user should be on the DemoPage");
        homePage.seeHowItWorksBTN_loc.click();
        String expectedTitle = Driver.get().getTitle();
        String actualTitle = "Knovvu Demos || SESTEK";
        Assert.assertEquals(actualTitle,expectedTitle,"You are NOT on the DemoPage");

        extentLogger.info("The page language should be Turkish");
        String expectedTitleLang = Driver.get().getTitle();
        dashBoard.dashBoardLocators("EN").click();
        demoPage.changePageLang_loc.click();
        String actualTitleLang = Driver.get().getTitle();
        Assert.assertFalse(expectedTitleLang.equals(actualTitleLang),"Language button working");

        extentLogger.info("The user should be able to run text using Emily's voice");
        Driver.get().get(ConfigurationReader.get("url"));
        homePage.seeHowItWorksBTN_loc.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(3);
        demoPage.selectVoice_loc.click();
        demoPage.insertText_loc.clear();
        demoPage.insertText_loc.sendKeys("Hello I Am Emily How may I help you");
        demoPage.speakBTN_loc.click();
        BrowserUtils.waitFor(6);





    }

}
