package com.sestek.tests;

import com.sestek.TestBase;
import com.sestek.pages.DashBoard;
import com.sestek.pages.HomePage;
import com.sestek.utilities.BrowserUtils;
import com.sestek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();
    DashBoard dashBoard = new DashBoard();

    @Test
    public void homepageTest() {
        extentLogger = report.createTest("SESTEK HomePage Test");

        extentLogger.info("The user should be on the homePage");
        String expectedText = "The Best Speech Recognition Technology on the Market.";
        String actualText = homePage.homePageTextSecondPart_loc.getText();
        Assert.assertEquals(actualText,expectedText,"You are NOT on the HomePage");

        extentLogger.info("The page language should be english");
        String expectedLanguage = "EN";
        String actualLanguage = dashBoard.dashBoardLocators("EN").getText();
        Assert.assertEquals(actualLanguage,expectedLanguage,"The language of the page is not english");


        extentLogger.info("if the user clicks on the logo it should be on the home page.");
        String expectedTitle = "Sestek Conversational Solutions || SESTEK";
        dashBoard.sestekLogo_loc.click();
        BrowserUtils.waitForVisibility(dashBoard.sestekLogo_loc,2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"SESTEK logo is NOT working");


        extentLogger.info("The user should be on the demo page");
        homePage.seeHowItWorksBTN_loc.click();
        String expectedDemoPageTitle = "Knovvu Demos || SESTEK";
        String actualDemoPageTitle = Driver.get().getTitle();
        Assert.assertEquals(actualDemoPageTitle,expectedDemoPageTitle,"You are NOT on the DemoPage");




    }
}
