package com.automation.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.test.BaseTest;

public class Nyhomepage extends BaseTest
{
	//Declaring the elements address

	@FindBy(xpath = "(//button[@aria-expanded='false'])[1]")
	private WebElement search_btn;

	@FindBy(xpath = "//input[@data-testid='search-input']")
	private WebElement search_text_field;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Go_btn;

	// Initializing the elements address

	public Nyhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilizing the elements address

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
