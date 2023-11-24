package com.amazon.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;
import com.amazon.pagesobjects.OrderConfirmationPage;

public class OrderSummary  extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath="//input[@aria-labelledby='submitOrderButtonId-announce']")
	private WebElement PlaceOrder;
	
	public OrderSummary() {
		PageFactory.initElements(getDriver(), this);
	}

	public OrderConfirmationPage clickOnconfirmOrderBtn() throws Throwable {
		action.click(getDriver(), PlaceOrder);
		return new OrderConfirmationPage();
	}
	
}
