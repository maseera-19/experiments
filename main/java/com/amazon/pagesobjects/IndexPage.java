package com.amazon.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;
import com.amazon.pagesobjects.LoginPage;
import com.amazon.pagesobjects.SearchResultPage;

public class IndexPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']") 
	private WebElement signInBtn;
	
	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private WebElement amazonLogo;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchProductBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	public LoginPage clickOnSignIn() throws Throwable {
		action.fluentWait(getDriver(), signInBtn, 10);
		action.click(getDriver(), signInBtn);
		return new LoginPage();
	}
	public boolean validateLogo() throws Throwable {
		return action.isDisplayed(getDriver(), amazonLogo);
	}
	//public String getMyStoreTitle() {
		//String Titel=getDriver().getTitle();
		//return Titel;
	//}
	public SearchResultPage searchProduct(String productName) throws Throwable {
		action.type(searchProductBox, productName);
		//action.scrollByVisibilityOfElement(getDriver(), searchButton);
		action.click(getDriver(), searchButton);
		//Thread.sleep(3000);
		return new SearchResultPage();
	}
	

}
