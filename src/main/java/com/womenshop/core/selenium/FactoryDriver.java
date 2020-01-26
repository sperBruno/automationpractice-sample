package com.womenshop.core.selenium;

import org.openqa.selenium.WebDriverException;

/**
 * This is the Factory Driver class.
 */
public final class FactoryDriver {
    private static final String BROWSER_NOT_FOUND = "Browser not found";
    private FactoryDriver(){}

    /**
     * This Factory method is going to retrieve an instance of the required WebDriver.
     * @param browser is the name of the required WebDriver to use.
     * @return WebDriver instance.
     */
    public static IDriver getDriver(String browser) {
        switch (Browser.valueOf(browser)) {
            case CHROME:
                return new Chrome();
            case FIREFOX:
                return new Firefox();
            default:
                throw new WebDriverException(BROWSER_NOT_FOUND);
        }
    }
}
