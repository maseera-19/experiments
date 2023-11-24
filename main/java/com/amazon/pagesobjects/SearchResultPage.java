package com.amazon.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;
import com.amazon.pagesobjects.AddToCartPage;

public class SearchResultPage extends BaseClass {
	
	Action action= new Action();
	
//img[@alt='Sponsored Ad - Apple iPhone 13 (128GB) - Starlight']//img[@alt='Sponsored Ad - Apple iPhone 13 (128GB) - Starlight']

	//@FindBy(xpath="//div[@class='a-section a-spacing-none _bXVsd_imgPadding_1Lkpt _bXVsd_container_1DI1V _bXVsd_block_1vI8- _bXVsd_hFull_2lnNw _bXVsd_wFull_3f8b2 _bXVsd_row_3CEm0 _bXVsd_itemsCenter_3flfN _bXVsd_contentCenter_3BjNx']//img[@alt='Apple iPhone 14 (128 GB) - Midnight']//img[@alt='Sponsored Ad - Apple iPhone 13 (128GB) - Starlight']//img[@alt='Sponsored Ad - Apple iPhone 13 (128GB) - Starlight']")
			@FindBy(xpath="img[@alt='Sponsored Ad - Apple iPhone 13 (128GB) - Starlight']")
	private WebElement productResult;
	
	public SearchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean isProductAvailable() throws Throwable {
		return action.isDisplayed(getDriver(), productResult);
	}
	
	public AddToCartPage clickOnProduct() throws Throwable {
		action.click(getDriver(), productResult);
		return new AddToCartPage();
	}



}
