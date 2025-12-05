package com.practicetestautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class SuccessfulLoginPage extends  BasePage {
    private By logOutButtonLocator = By.linkText("Log out");


    public SuccessfulLoginPage(WebDriver driver) { //this is a parameter
        super(driver);
    }

    public boolean isLogOutButtonDisplayed() {   //checks if Logout button is displayed.
        return isDisplayed(logOutButtonLocator);
        }


        public void load() { //this method waits specifically for the logout button to become visible on the page, this ensures the test only proceeds once the logout button is visible, confirming page has fully loaded and is ready for further interactions
            waitForElement(logOutButtonLocator);
        }

}

