package com.orange.Browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserConfiguration {

    public static WebDriver d;
	
	/**
	 * This method will launch the application based on info passed in config.properties file
	 * @return WebDriver
	 * @throws IOException : this will throw exception if it is not loaded or found.
	 */
	public WebDriver launch() throws IOException
	{
		Properties obj = new Properties();
		FileInputStream fis = new FileInputStream("./src\\main\\resources\\configure.properties");
		obj.load(fis);
		String BrowserName = obj.getProperty("browser");
		String url = obj.getProperty("url");
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			d= new ChromeDriver();
		}
		else 
			if(BrowserName.equalsIgnoreCase("edge"))
			{
				WebDriverManager.chromedriver().setup();
				d= new EdgeDriver();
			}
		d.get(url);
		d.manage().window().maximize();
		return d;
	}
	
	/**
	 * This method will close the current browser opened in the current session.
	 */
	
	public void closecurrentbrowser()
	{
		d.close();
	}
	
	/**
	 * This method will close all the browsers opened in the current session
	 */
	
	public void closeallbrowsers()
	{
		d.quit();
	}
}
