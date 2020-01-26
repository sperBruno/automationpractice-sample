package com.womenshop.core.selenium;

import com.womenshop.core.utils.PropertiesInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.womenshop.core.utils.Constants.*;

/**
 * This class is going to handle WebDriver that is being used.
 */
public final class DriverManager {
    private static DriverManager instance;
    private WebDriver driver;
    private WebDriverWait wait;

    private DriverManager() {
        initWebDriver();
    }

    /**
     * This function used the singleton patter to retrieve just one instance of a DriverManager.
     * @return an instance of a DriverManager.
     */
    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    /**
     * This method is going to be use initialize an instance of a WebDriver.
     */
    private void initWebDriver() {
        driver = FactoryDriver.getDriver(PropertiesInfo.getInstance().getBrowser().toUpperCase()).initWebDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(LOAD_PAGE_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, WAIT_TIME);
    }

    /**
     * This method retrieves the instance of a WebDriver.
     * @return driver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * This method retrieves the instance of a WebDriverWait.
     * @return wait
     */
    public WebDriverWait getWait() {
        return wait;
    }
}
