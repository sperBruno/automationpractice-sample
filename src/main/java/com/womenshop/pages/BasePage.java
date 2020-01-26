package com.womenshop.pages;

import com.womenshop.core.selenium.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.womenshop.core.utils.Constants.WAIT_TIME;

/**
 * This class is going to be the BasePage for all the WebApplication Pages.
 */
public abstract class BasePage {
    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = new WebDriverWait(driver, WAIT_TIME);
        PageFactory.initElements(driver, this);
    }
}
