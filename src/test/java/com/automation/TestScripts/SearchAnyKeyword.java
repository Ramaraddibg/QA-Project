package com.automation.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.BaseClass;
import com.automation.generic.pageObjectmodel;
@Listeners(com.automation.generic.ListnersClass.class)
public class SearchAnyKeyword extends BaseClass
{
	@Test
	public void Test()
	{
		pageObjectmodel pom=new pageObjectmodel(driver);
		
		pom.searchButton().click();
		pom.searchTextField().sendKeys("India");
		pom.GoButton().click();
		
		if(driver.getPageSource().contains("India"))
		{
			System.out.println("text is present. "+Thread.currentThread().getId());	
		}
		else
		{
			System.out.println("text is not present. "+Thread.currentThread().getId());
			Assert.fail();
		}

	}

}
