package com.amazon.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;
import com.amazon.pagesobjects.OrderSummary;

public class PaymentPage  extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath = "//input[@id='pp-gcaXyx-106']")
	private WebElement AmazonPayMethod;
	
	@FindBy(xpath = "//input[@id='pp-gcaXyx-247']")
	private WebElement payByCashMethod;
	
	@FindBy (xpath="//span[@class='a-button-inner']//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")
	private WebElement paymentMethod;
	
	public PaymentPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public OrderSummary clickOnPaymentMethod() throws Throwable {
		action.click(getDriver(), paymentMethod);
		return new OrderSummary();
	}


}
