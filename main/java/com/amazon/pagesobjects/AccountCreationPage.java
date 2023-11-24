package com.amazon.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;

/**
 * @author Hitendra
 *
 */
public class AccountCreationPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath = "//h1[normalize-space()='Create Account']")
	private WebElement formTitle;
	

	@FindBy(xpath = "//input[@id='ap_customer_name']")
	private WebElement cstName;

	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement passWord;

	@FindBy(xpath="//input[@id='ap_phone_number']")
	private WebElement mobile;

	@FindBy(name = "submitAccount")
	private WebElement registerBtn;
	
	public AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void createAccount(String fullName, 
			String mobilePhone, 
			String pswd) throws Throwable {
		
		
		
		action.type(cstName, fullName);
		action.type(mobile, mobilePhone);
		action.type(passWord, pswd);
		
	}
	
	public HomePage validateRegistration() throws Throwable {
		registerBtn.click();
		return new HomePage();
	}
	
	public boolean validateAcountCreatePage() throws Throwable {
		 return action.isDisplayed(getDriver(), formTitle);
	}
	
}
