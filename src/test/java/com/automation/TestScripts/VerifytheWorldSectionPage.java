package com.automation.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.generic.BaseTest;

import org.testng.annotations.Listeners;
@Listeners(com.automation.generic.ListenersClass.class)
public class VerifytheWorldSectionPage extends BaseTest
{
	@Test
	public void VeifyTheWorld()
	{
		WebElement worldSection = driver.findElement(By.linkText("World"));
		
		//Verify the world section present in the webpage
		
		if(worldSection.isDisplayed())
		{
			System.out.println("World section is Displayed. "+Thread.currentThread().getId());
		}
		
		else
		{
			System.out.println("World section is not Displayed. "+Thread.currentThread().getId());
		}
	}
}
