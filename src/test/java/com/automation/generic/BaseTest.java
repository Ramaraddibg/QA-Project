package com.automation.generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.automation.POM.LoginPom;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	public ExtentHtmlReporter reporter;
	ExtentReports reports;
	public  WebDriver driver;
	public ExtentTest test;

	@BeforeTest    //Generating the report
	public  void Reports()
	{
		reporter=new ExtentHtmlReporter("./Extent/extentreport.html");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		test = reports.createTest("./Extent/extentreport.html");
	}

	@BeforeClass() //Open the browser
	@Parameters("browser")
	public void Openapp(String browser)
	{

		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}


	@BeforeMethod   //logging into the application
	public  void nyTimeLogin()
	{
		driver.get("https://www.nytimes.com/international/");

		LoginPom login=new LoginPom(driver);

		login.loginBtn().click();
		login.emailText().sendKeys("bgramaraddi@gmail.com");
		login.emailSubmitBtn().click();
		login.passwordText().sendKeys("Wrongpassword@1994");
		login.emailSubmitBtn().click();
		login.subcribeButton().click();



	}

	@AfterMethod //Logout from the application
	public void logout()
	{

	}

	@AfterClass // closing the browser
	public void closeapp()
	{
		driver.quit();
	}

	@AfterTest 
	public void flush()
	{

		reports.flush();
	}
}
