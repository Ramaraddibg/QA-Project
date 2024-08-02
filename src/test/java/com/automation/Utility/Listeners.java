package com.automation.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.automation.test.BaseTest;

public class Listeners extends BaseTest implements ITestListener
{
	public Screenshot screenshot=new Screenshot();
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case pass");
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test case is fail"+result.getName());
		Screenshot.getScreenshot(this.driver, result);
	}
}

