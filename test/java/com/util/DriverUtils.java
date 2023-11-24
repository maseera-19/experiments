package com.util;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

	
	static WebDriver driver;
	
	public static void createDriver() {
		
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}
	
	public static void closeDriver() {
		driver.close();
	}
	
	public static void quitDriver() {
		driver.quit();
	}
	

}
