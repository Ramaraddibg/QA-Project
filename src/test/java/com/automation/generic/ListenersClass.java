package com.automation.generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.Utility.ScreenshotClass;

	public class ListenersClass extends BaseTest implements ITestListener
	{
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("test case pass");
		}
		
		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("test case is fail"+result.getName());
			ScreenshotClass.getPhoto(this.driver, result);
		}
	}



