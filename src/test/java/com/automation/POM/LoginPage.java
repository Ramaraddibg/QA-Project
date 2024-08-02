package com.automation.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Declaring the address in the web page

	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement Login_btn;

	@FindBy(id = "email")
	private WebElement Email_txt;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement email_submit_btn;

	@FindBy(id = "password")
	private WebElement Password_Text;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement password_submit_btn;

	@FindBy(xpath = "//a[@class='css-1dhib8']")
	private WebElement Subcribe_Btn;

	//Initializing the element address

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//Utilizing the elements address

	public WebElement loginBtn()
	{
		return Login_btn;
	}

	public WebElement emailText()
	{
		return Email_txt;
	}

	public WebElement emailSubmitBtn()
	{
		return email_submit_btn;
	}

	public WebElement passwordText()
	{
		return Password_Text;
	}

	public WebElement passwordSubmitBtn()
	{
		return password_submit_btn;
	}

	public WebElement subcribeButton()
	{
		return Subcribe_Btn;
	}


}
