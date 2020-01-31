package com.womenshop.pages;

import com.womenshop.core.selenium.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * This class is going to be the BasePage for all the WebApplication Pages.
 */
public abstract class BasePage {
    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }
}
