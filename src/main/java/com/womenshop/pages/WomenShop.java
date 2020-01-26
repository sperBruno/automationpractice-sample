package com.womenshop.pages;

import com.womenshop.core.utils.PropertiesInfo;

/**
 * This class handles the BaseWebApplicationPage.
 */
public class WomenShop extends BasePage {
    private NavigationBar navigationBar;

    public WomenShop() {
        driver.get(PropertiesInfo.getInstance().getUrl());
        navigationBar = new NavigationBar();
    }

    /**
     * This method closes the WebBrowser window.
     */
    public void closeWindows() {
        driver.close();
        driver.quit();
    }

    /**
     * This method Navigates to the DressesPage.
     * @return DressesPage instance.
     */
    public DressesPage navigateToDressesTab() {
        return this.navigationBar.navigateToDresses();
    }
}
