package com.womenshop.pages;

import com.womenshop.core.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class handles the navigation through the WebApplication.
 */
public class NavigationBar extends BasePage {

    @FindBy(linkText = "DRESSES")
    private WebElement dressesTab;

    /**
     * This method navigates to the DressesPage.
     * @return DressesPage instance.
     */
    public DressesPage navigateToDresses() {
        CommonMethods.clickWebElement(dressesTab);
        return new DressesPage();
    }
}
