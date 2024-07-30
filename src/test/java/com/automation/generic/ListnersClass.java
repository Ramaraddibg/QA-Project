package com.automation.generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass extends BaseClass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case pass");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case is fail"+result.getName());
		screenshotclass.getPhoto(this.driver, result);
	}

	
}


