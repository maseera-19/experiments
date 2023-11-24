package com.pages;

    import actiondriver.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.pages.BasePage;

	public class SearchResultPage extends BasePage {
		
		Action action= new Action();
		
		@FindBy(xpath="//*[@id=\"center_column\"]//img")
		private WebElement productResult;
		
		public SearchResultPage() {
			PageFactory.initElements(getDriver(), this);
		}
		
		private WebDriver getDriver() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isProductAvailable() throws Throwable {
			return action.isDisplayed(getDriver(), productResult);
		}
				
	}
