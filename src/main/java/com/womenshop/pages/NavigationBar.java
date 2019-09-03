package com.womenshop.pages;

import com.womenshop.core.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends BasePage {

    @FindBy(linkText = "DRESSES")
    private WebElement dressesTab;

    public DressesPage navigateToDresses() {
        CommonMethods.clickWebElement(dressesTab);
        return new DressesPage();
    }
}
