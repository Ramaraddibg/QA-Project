package com.automation.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class screenshotclass implements Framework_Constants_QA
{
	public static void getPhoto(WebDriver driver,ITestResult result)
	{
		Date d=new Date();

		String date = d.toString().replace(":", "-");

		TakesScreenshot ts=(TakesScreenshot)driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File dest=new File("./Screenshots/ama1.jpeg "+ " " + date);

		try

		{
			FileHandler.copy(source, dest);
		} 

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
