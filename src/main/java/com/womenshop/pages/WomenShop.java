package com.womenshop.pages;

import com.womenshop.core.utils.PropertiesInfo;

public class WomenShop extends BasePage {
    private NavigationBar navigationBar;

    public WomenShop() {
        driver.get(PropertiesInfo.getInstance().getUrl());
        navigationBar = new NavigationBar();
    }

    public void closeWindows() {
        driver.close();
        driver.quit();
    }

    public DressesPage navigateToDressesTab() {
        return this.navigationBar.navigateToDresses();
    }
}
