package com.automation.TestScripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.generic.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.BaseClass;
import com.automation.generic.pageObjectmodel;
@Listeners(com.automation.generic.ListnersClass.class)
public class BrokenLinkVerifyClass extends BaseClass
{
	//@Test
	public void BrokenLink() throws IOException
	{
		// Verify the broken links present in the webpage
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println("total links are "+ links.size() +Thread.currentThread().getId());
		for (int i = 0; i <links.size(); i++) 
		{
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyTheLink(url);
		}
		
	}
	public static void verifyTheLink(String linkurl) throws IOException 
	{
		try {
			URL url = new URL(linkurl); 
			HttpURLConnection httpurlconnect = (HttpURLConnection)url.openConnection();
			httpurlconnect.setConnectTimeout(3000);
			httpurlconnect.connect();
			
			if(httpurlconnect.getResponseCode()==200)
			{
				System.out.println(linkurl=" "+httpurlconnect.getResponseMessage());
			}
			else
			{
				
			}
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
	}
}
