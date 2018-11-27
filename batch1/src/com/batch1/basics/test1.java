package com.batch1.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {
 WebDriver driver;
	@Test()
	void c() {
		
    System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");

    driver= new FirefoxDriver();
	System.out.println("test");	
	}
	
	@Test(dependsOnMethods="c")
	void a()
	
	{
		System.out.println("test2");
		driver.close();
	}
}
