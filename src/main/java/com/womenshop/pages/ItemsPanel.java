package com.womenshop.pages;

import com.google.common.collect.Ordering;
import com.womenshop.core.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

/**
 * This class handles the ItemPanel in the WebApplication.
 */
public class ItemsPanel extends BasePage {

    private List<WebElement> items;

    /**
     * This method retrieves true if an items is present on the ItemsPanel or false if not.
     * @param itemTitle that should exist on the ItemsPanel.
     * @return true or false.
     */
    public boolean isItemPresent(String itemTitle) {
        return CommonMethods.isElementPresent(driver.findElement(By.cssSelector(".right-block a[title='" + itemTitle + "']")));
    }

    /**
     * This method gathers all the items exist on the ItemsPanel.
     */
    public void itemsList() {
        items = driver.findElements(By.cssSelector(".product-container"));
    }

    /**
     * This method retrieves true if an item with a specific price exists on the ItemsPanel.
     * @param itemTitle to be find.
     * @param price that should have the item.
     * @return true or false.
     */
    public boolean itemExistsWithPrice(String itemTitle, String price) {
        boolean itemExists = false;
        for (WebElement item : items) {
            if (item.getText().contains(itemTitle) && item.getText().contains(price)) {
                itemExists = true;
                break;
            }
        }
        return itemExists;
    }

    /**
     * This method is going to retrieve a list of prices.
     * @return list of prices.
     */
    public List<Double> getPricesList() {
        List<Double> itemsPricesList = new ArrayList<>();
        List<WebElement> itemsPrices = driver.findElements(By.cssSelector(".product-container .right-block .price.product-price"));
        for (WebElement item : itemsPrices) {
            itemsPricesList.add(Double.parseDouble(item.getText().replace("$", "")));
        }

        return itemsPricesList;
    }

    /**
     * This method retrieves true if the items are ordered in an ascendant order based on its prices or false if not.
     * @return true or false
     */
    public boolean itemsAreInAscendantOrder() {
        List<Double> pricesList = getPricesList();
        return Ordering.natural().isOrdered(pricesList);
    }
}
