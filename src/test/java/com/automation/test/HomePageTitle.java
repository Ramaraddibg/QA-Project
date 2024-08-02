package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTitle extends BaseTest
{
	@Test
	public void testTitle()
	{
		// Expected title
		String expectedTitle = "The New York Times International - Breaking News, US News, World News, Videos";

		// Get the actual title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		// Verify the title
		Assert.assertEquals(actualTitle, expectedTitle, "Title match"+Thread.currentThread().getName());
	}
}
