package com.testCases;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class AmazonSearchTestCase {
	    private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Set up WebDriver (Assuming ChromeDriver here, download and set path accordingly)
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\finalproject\\src\\chromedriver.exe");
	        driver = new ChromeDriver();
	    }

	    @Test
	    public void testAmazonSearch() {
	        // Open Amazon
	        driver.get("https://www.amazon.in");

	        // Find the search box and enter the search term
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("iphone");

	        // Click the search button
	        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
	        searchButton.click();

	        // You can add assertions here to verify the search results if needed
	        // For example, verify that the search results page contains the expected elements.
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
