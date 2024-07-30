package com.automation.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.generic.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.BaseClass;
import com.automation.generic.pageObjectmodel;
@Listeners(com.automation.generic.ListnersClass.class)
public class VerifytheWorldSectionPage extends BaseClass
{
	//@Test
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
