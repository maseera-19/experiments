package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearchResultsPage {
    WebDriver driver;

    // Constructor
    public AmazonSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods for interacting with elements on the search results page
    public List<String> getSearchResults() {
        List<String> results = new ArrayList<>();
        List<WebElement> resultElements = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//a/span"));

        for (WebElement element : resultElements) {
            results.add(element.getText());
        }

        return results;
    }
}
