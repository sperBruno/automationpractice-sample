package com.womenshop.pages;

import com.womenshop.core.utils.CommonMethods;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogBox extends BasePage {

    @FindBy(xpath = "//p[@class='title_block'][contains(.,'Catalog')]")
    private WebElement catalogBoxElement;

    @FindBy(id = "layered_id_attribute_group_3")
    private WebElement sizeL;

    @FindBy(id = "layered_id_attribute_group_2")
    private WebElement sizeM;

    @FindBy(id = "layered_id_attribute_group_16")
    private WebElement colorYellow;

    @FindBy(id = "layered_id_attribute_group_15")
    private WebElement colorGreen;

    public void setSize(final String value) {
        switch (value.toUpperCase()) {
            case "L":
                CommonMethods.setCheckBox(sizeL, true);
                break;
            case "M":
                CommonMethods.setCheckBox(sizeM, true);
                break;
            default:
                throw new WebDriverException("Element Not Found");
        }

    }

    /**
     * This method retrieves true if the CategoryCatalogBox is displayed on the WebApplication.
     * @return true or false.
     */
    public boolean categoryCatalogBoxIsDisplayed() {
        return CommonMethods.isElementPresent(catalogBoxElement);
    }

    /**
     * This method is going to select a CheckBox WebElement based on the color property.
     * @param color
     */
    public void setColor(String color) {

        switch (color.toUpperCase()) {
            case "GREEN":
                CommonMethods.setCheckBox(colorGreen, true);
                break;
            case "YELLOW":
                CommonMethods.setCheckBox(colorYellow, true);
                break;
            default:
                throw new WebDriverException("Element Not Found");
        }

    }
}
