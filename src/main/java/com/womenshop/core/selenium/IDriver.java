package com.womenshop.core.selenium;

import org.openqa.selenium.WebDriver;

/**
 * This is the interface of the InitWebDriver function.
 */
@FunctionalInterface
public interface IDriver {

     WebDriver initWebDriver();
}
