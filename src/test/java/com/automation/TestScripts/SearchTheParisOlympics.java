package com.automation.TestScripts;

import org.testng.annotations.Test;

import com.automation.generic.BaseClass;
import com.automation.generic.pageObjectmodel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.BaseClass;
import com.automation.generic.pageObjectmodel;
@Listeners(com.automation.generic.ListnersClass.class)
public class SearchTheParisOlympics extends BaseClass
{
	//@Test
	public void searchParis()
	{
		pageObjectmodel pom=new pageObjectmodel(driver);

		pom.searchButton().click();

		pom.searchTextField().sendKeys("paris olympics");

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
