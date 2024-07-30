package com.automation.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjectmodel 
{
	//Declaring the elements address
	
	@FindBy(xpath = "(//button[@aria-expanded='false'])[1]")
	private WebElement search_btn;
	
	@FindBy(xpath = "//input[@data-testid='search-input']")
	private WebElement search_text_field;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Go_btn;
	
	// Initialising the elements address
	
	public pageObjectmodel(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilising the elements address
	
	public WebElement searchButton()
	{
		return search_btn;
	}
	public WebElement searchTextField()
	{
		return search_text_field;
	}
	public WebElement GoButton()
	{
		return Go_btn;
	}
	
	
}
