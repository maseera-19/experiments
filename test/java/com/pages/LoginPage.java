package com.pages;


//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
   
	
	@FindBy(xpath = "(//a[contains(@data-nav-role,'signin')])[1]")
	private WebElement signIn;
	
	public void signIn() {
		signIn.click();
	}
    @FindBy(id = "ap_email")
    private WebElement emailInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "ap_password")
    private WebElement passwordInput;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;


    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }
}