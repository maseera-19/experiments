package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
    WebDriver driver;

    // Constructor
    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods for interacting with elements on the home page
    public void open() {
        driver.get("https://www.amazon.com/");
    }

    public void searchProductFromExcel(String productName) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    
}
