package com.womenshop.core.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.womenshop.core.selenium.DriverManager.getInstance;

/**
 * This class handles common ui actions.
 */
public class CommonMethods {
    private static final Logger LOGGER = Logger.getLogger(CommonMethods.class.getSimpleName());
    private static final WebDriverWait WEB_DRIVER_WAIT = getInstance().getWait();
    private CommonMethods() {
    }

    /**
     * This method validates whether a WebElement is present or not on the WebApplication.
     * @param webElement to find
     * @return true if WebElement is present or false if not.
     */
    public static boolean isElementPresent(WebElement webElement) {
        try {
            webElement.getTagName();
            return true;
        } catch (WebDriverException e) {
            LOGGER.error("Web element not found", e);
            return false;

        }
    }

    /**
     * This method is going to click a WebElement in the WebApplication.
     * @param webElement to be clicked.
     */
    public static void clickWebElement(WebElement webElement) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method is going to check a CheckBox WebElement in the WebApplication.
     * @param webElement checkbox to be checked.
     * @param enable true to check or false to uncheck the Checkbox WebElement.
     */
    public static void setCheckBox(WebElement webElement, boolean enable) {
        if (enable) {
            unCheckBox(webElement);
        } else {
            checkBox(webElement);
        }
    }

    /**
     * This method is going to uncheck the CheckBox WebElement.
     * @param webElement CheckBox to be unchecked.
     */
    private static void unCheckBox(WebElement webElement) {
        if (!webElement.isSelected()) {
            webElement.click();
        }
    }

    /**
     * This method is going to check the CheckBox WebElement.
     * @param webElement CheckBox to be checked.
     */
    private static void checkBox(WebElement webElement) {
        if (webElement.isSelected()) {
            webElement.click();
        }
    }

    /**
     * This method is going to select an option from a ComboBox WebElement in the WebApplication.
     * @param webElementSelect ComboBox WebElement.
     * @param element to be selected from the ComboBox WebElement.
     */
    public static void selectAElementComboBox(WebElement webElementSelect, String element) {
        Select oSelect = new Select(webElementSelect);
        oSelect.selectByValue(element);
    }
}
