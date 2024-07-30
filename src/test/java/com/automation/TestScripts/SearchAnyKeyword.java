package com.automation.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.POM.Nyhomepage;
import com.automation.generic.BaseTest;
@Listeners(com.automation.generic.ListenersClass.class)
public class SearchAnyKeyword extends BaseTest
{
	@Test
	public void Test()
	{
		Nyhomepage pom = new Nyhomepage(driver);
		
		// Assert that the search button is clickable
        Assert.assertTrue(pom.searchButton().isEnabled(),"Search button is not clickable");
		pom.searchButton().click();
		
		
		// Assert that the search text field is displayed and enabled
        Assert.assertTrue(pom.searchTextField().isDisplayed(), "Search text field is not displayed");
        Assert.assertTrue(pom.searchTextField().isEnabled(), "Search text field is not enabled");
      
		pom.searchTextField().sendKeys("India");
		
		// Assert that the Go button is clickable
        Assert.assertTrue(pom.GoButton().isEnabled(), "Go button is not clickable");
       
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
