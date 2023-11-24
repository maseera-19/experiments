package com.amazon.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;
import com.amazon.pagesobjects.AccountCreationPage;
import com.amazon.pagesobjects.HomePage;

public class LoginPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Clickcontinue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;

	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signInBtn;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	private WebElement emailForNewAccount;
	
	//@FindBy(name="SubmitCreate")
	//private WebElement createNewAccountBtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uname, String pswd,HomePage homePage) throws Throwable {
		action.scrollByVisibilityOfElement(getDriver(), userName);
		action.type(userName, uname);
		action.type(password, pswd);
		//action.JSClick(getDriver(), signInBtn);
		//Thread.sleep(2000);
		homePage=new HomePage();
		return homePage;
	}
	public AccountCreationPage createNewAccount(String newEmail) throws Throwable {
		action.type(emailForNewAccount, newEmail);
		//action.click(getDriver(), createNewAccountBtn);
		return new AccountCreationPage();
	}

}
