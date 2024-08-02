package com.automation.test;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.automation.POM.Nyhomepage;
@Listeners(com.automation.Utility.Listeners.class)
public class SearchFunctionalityTest extends BaseTest
{
	public WebDriverWait wait;
	public Nyhomepage pom;
	@Test(invocationCount = 1)
	public void searchAnyKeyword()
	{
		pom=new Nyhomepage(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(pom.searchButton()));
		pom.searchButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(pom.searchTextField()));
		pom.searchTextField().sendKeys("India");
		wait.until(ExpectedConditions.elementToBeClickable(pom.GoButton()));
		pom.GoButton().click();
		if(driver.getPageSource().contains("India"))
		{
			System.out.println("text is present."+Thread.currentThread().getName());	
		}
		else
		{
			System.out.println("text is not present.");
		}
	}

}
