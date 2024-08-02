package com.automation.test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.automation.Utility.Listeners.class)
public class HomePageTest extends BaseTest
{
	@Test
	public void VerifyOpinion()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Locate the opinion section address
		WebElement opinion= driver.findElement(By.linkText("Opinion"));
		//Verify the Opinion section present in the web page
		wait.until(ExpectedConditions.visibilityOf(opinion));
		if(opinion.isEnabled())
		{
			System.out.println("Navigated to Opinion section displayed successfully. "+Thread.currentThread().getName());
			test.pass("Test scripts executed");
		}
		else {
			System.out.println("Failed to navigate to Opinion section.");
		}
	}
	@Test
	public void verifyTheWorld()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement worldSection = driver.findElement(By.linkText("World"));
		//Verify the world section present in the web page
		wait.until(ExpectedConditions.visibilityOf(worldSection));
		if(worldSection.isDisplayed())
		{
			System.out.println("World section is Displayed. "+Thread.currentThread().getName());
			test.pass("Test scripts executed");
		}
		else
		{
			System.out.println("World section is not Displayed.");
		}
	}
}

