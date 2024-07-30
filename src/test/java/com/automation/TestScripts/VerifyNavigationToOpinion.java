package com.automation.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.generic.BaseTest;

public class VerifyNavigationToOpinion extends BaseTest
{
	@Test
	public void VerifyOpinion()
	{
		//Locate the opinion section address
		WebElement opinion= driver.findElement(By.linkText("Opinion"));
		
		//Verify the Opinion section present in the webpage
		if(opinion.isDisplayed())
		{
			System.out.println("Navigated to Opinion section displayed successfully."+Thread.currentThread().getId());

		}
		else {
			System.out.println("Failed to navigate to Opinion section.");
		}

	}
}
