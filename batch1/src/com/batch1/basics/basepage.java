package com.batch1.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class basepage {
	public static WebDriver driver;
	
	public static String path="./data.properties";
	
	public static String loaddata(String key) throws Exception 
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		
		
		return p.getProperty(key);
	}

    public static void lunch1(String browser,String url) {	
    	
    	if(browser.equalsIgnoreCase("firefox"))
    	{
    	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");

	    driver= new FirefoxDriver();
    	}
	    else if(browser.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");

		    driver= new ChromeDriver();
	    }
	    else if(browser.equalsIgnoreCase("ie"))
	    {
	    	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");

		    driver= new InternetExplorerDriver();
	    }
	    
    	
	    driver.get(url);
}
}