package com.testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.util.*;
import com.pages.LoginPage;


public class Login {
	LoginPage lp = new LoginPage();
	
	 
	
	@Test
    public void signin() {
       lp.signIn();      
	}

	/*@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void loginTest(String uname, String pswd){
		lp.enterEmail(uname);
		lp.clickContinue();
		lp.enterPassword(pswd);
		lp.clickSignIn();
	}*/

    @AfterTest
    public void tearDown() {
        // Close the browser
    	DriverUtils.closeDriver();
    }
}