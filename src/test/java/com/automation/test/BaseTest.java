package com.automation.test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.automation.Utility.propertyFile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public WebDriver driver;
	public ExtentTest test;
	public propertyFile prop;

	@BeforeTest    //Generating the report
	public void reports()
	{
		prop=new propertyFile();
		reporter=new ExtentHtmlReporter("./Extent/extentreport.html");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		test = reports.createTest("./Extent/extentreport.html");
	}

	@BeforeClass() //Open the browser
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless"); // Run in headless mode
			driver = new ChromeDriver(options);
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get((prop.propertyfile("URL")));
	}

	@AfterClass // closing the browser
	public void closeApp()
	{
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterTest 
	public void flush()
	{
		reports.flush();
	}
}
