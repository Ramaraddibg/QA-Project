package com.automation.TestScripts;

import org.testng.annotations.Test;

import com.automation.POM.Nyhomepage;
import com.automation.generic.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.automation.generic.ListenersClass.class)
public class SearchTheParisOlympics extends BaseTest
{
	//@Test
	public void searchParis()
	{
		Nyhomepage pom=new Nyhomepage(driver);

		// Assert that the search button is clickable
        Assert.assertTrue(pom.searchButton().isEnabled(), "Go button is not clickable");
        
		pom.searchButton().click();

		// Assert that the search text field is displayed and enabled
        Assert.assertTrue(pom.searchTextField().isDisplayed(), "Search text field is not displayed");
        Assert.assertTrue(pom.searchTextField().isEnabled(), "Search text field is not enabled");
		pom.searchTextField().sendKeys("paris olympics");


		// Assert that the Go button is clickable
        Assert.assertTrue(pom.GoButton().isEnabled(), "Go button is not clickable");
		pom.GoButton().click();

		if(driver.getTitle().contains("search"))
		{
			System.out.println("Search results page loaded. "+Thread.currentThread().getId());

		}
		else {
			System.out.println("Search results page did not load." +Thread.currentThread().getId());
		}

	}

}
