package com.automation.generic;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.automation.POM.LoginPage;
import com.automation.test.BaseTest;
@Listeners(com.automation.Utility.Listeners.class)
public class Login extends BaseTest
{	
	@Test
	public void loginPage()
	{ 
		//logging into the application
		LoginPage login=new LoginPage(driver);
		login.loginBtn().click();
		login.emailText().sendKeys(prop.propertyfile("Email"));
		login.emailSubmitBtn().click();
		login.passwordText().sendKeys(prop.propertyfile("Password"));
		login.emailSubmitBtn().click();
		login.subcribeButton().click();
	}
}
