package com.womenshop.pages;

import com.womenshop.core.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is going to handle the DressesPage.
 */
public class DressesPage extends BasePage {

    @FindBy(xpath = "//h2[@class='title_block'][contains(.,'Dresses')]")
    private WebElement categoryDressBox;

    @FindBy(css = "#categories_block_left .last")
    private WebElement summerDressesOption;

    @FindBy(css = "#selectProductSort")
    private WebElement selectProductSort;

    private CatalogBox catalogBox;
    private ItemsPanel itemsPanel;
    Map<String, String> sortByOptions;

    public DressesPage() {
        this.catalogBox = new CatalogBox();
        this.itemsPanel = new ItemsPanel();
        sortByOptions = new HashMap<>();
        sortByOptions.put("Price: Lowest first", "price:asc");
        sortByOptions.put("Price: Highest first", "price:desc");
    }

    /**
     * This method retrieves true if the Category Dress Box is displayed.
     * @return true or false.
     */
    public boolean categoryDressBoxIsDisplayed() {
        return CommonMethods.isElementPresent(categoryDressBox);
    }

    /**
     * This method clicks the SummerDressOption.
     * @return instance of the DressesPage.
     */
    public DressesPage clickSummerDressOption() {
        CommonMethods.clickWebElement(summerDressesOption);
        return this;
    }

    /**
     * This method retrieves the instance of the CatalogBox.
     * @return instance of CatalogBox.
     */
    public CatalogBox getCatalogBox() {
        return catalogBox;
    }

    /**
     * This method retrieves all items from the itemsPanel.
     * @return list of items from the itemsPanel.
     */
    public ItemsPanel getItemsPanel() {
        return itemsPanel;
    }

    /**
     * This method select sort criteria for the items and retrieves the DressesPage instance.
     * @param value to be used as sort criteria.
     * @return DressesPage.
     */
    public DressesPage selectSortBy(String value) {
        CommonMethods.selectAElementComboBox(selectProductSort, sortByOptions.get(value));
        return this;
    }
}
