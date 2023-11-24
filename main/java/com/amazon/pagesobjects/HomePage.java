package com.amazon.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;

public class HomePage extends BaseClass {
	
	Action action= new Action();
	
	//@FindBy(xpath="//span[@id='nav-cart-count']")
	//private WebElement cart;
	
	@FindBy(xpath = "//span[normalize-space()='Returns']")
	private WebElement orderHistory;
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	//public boolean validateMyWishList() throws Throwable {
	//	return action.isDisplayed(getDriver(), cart);
	//}
	
	public boolean validateOrderHistory() throws Throwable {
		return action.isDisplayed(getDriver(), orderHistory);
	}
	
	public String getCurrURL() throws Throwable {
		String homePageURL=action.getCurrentURL(getDriver());
		return homePageURL;
	}

}
