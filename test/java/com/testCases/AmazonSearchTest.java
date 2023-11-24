package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
   import org.testng.annotations.Test;

import com.pages.AmazonHomePage;
import com.pages.AmazonSearchResultsPage;
import com.util.ExcelUtils;

import java.util.List;

   public class AmazonSearchTest {
       WebDriver driver;
       AmazonHomePage homePage;
       AmazonSearchResultsPage resultsPage;

       @BeforeClass
       public void setUp() {
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\finalproject\\src\\chromedriver.exe");
           driver = new ChromeDriver();
           homePage = new AmazonHomePage(driver);
           resultsPage = new AmazonSearchResultsPage(driver);
       }

       @DataProvider(name = "searchData")
       public Object[][] searchData() {
           // Provide the path to your Excel file and sheet name
           return ExcelUtils.getTestData("C:\\Users\\Administrator\\Desktop\\finalproject\\src\\test\\resources\\testdata\\SearchanItem.xlsx", "Sheet1");
       }

       @Test(dataProvider = "searchData")
       public void amazonSearchTest(String productName) {
           homePage.open();
           homePage.searchProductFromExcel(productName);
           List<String> searchResults = resultsPage.getSearchResults();

           // Implement assertions or other actions based on search results
       }

       @AfterClass
       public void tearDown() {
           driver.quit();
       }
   }
