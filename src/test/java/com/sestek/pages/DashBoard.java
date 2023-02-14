package com.sestek.pages;

import com.sestek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends BasePage{

    @FindBy(xpath = "//img[@title=\"SESTEK\"]")
    public WebElement sestekLogo_loc;

    public WebElement dashBoardLocators(String navigate) {
        String dashBoard_locs = "//span[text()='" + navigate + "']";

        return Driver.get().findElement(By.xpath(dashBoard_locs));
    }
}
