package com.womenshop.pages;

import com.google.common.collect.Ordering;
import com.womenshop.core.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ItemsPanel extends BasePage {

    private List<WebElement> items;

    public boolean isItemPresent(String itemTitle) {
        return CommonMethods.isElementPresent(driver.findElement(By.cssSelector(".right-block a[title='" + itemTitle + "']")));
    }

    public void itemsList() {
        items = driver.findElements(By.cssSelector(".product-container"));
    }

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

    public List<Double> getPricesList() {
        List<Double> itemsPricesList = new ArrayList<>();
        List<WebElement> itemsPrices = driver.findElements(By.cssSelector(".product-container .right-block .price.product-price"));
        for (WebElement item : itemsPrices) {
            itemsPricesList.add(Double.parseDouble(item.getText().replace("$", "")));
        }

        return itemsPricesList;
    }

    public boolean itemsAreInAscendantOrder() {
        List<Double> pricesList = getPricesList();
        return Ordering.natural().isOrdered(pricesList);
    }
}
