package com.automation.Utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyFile
{
	public static FileInputStream fis;
	public String propertyfile(String key)
	{
		try{
			fis=new FileInputStream("./Property/property.properties");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try 
		{
			prop.load(fis);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
	}
}

