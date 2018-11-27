package com.batch1.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");

	   WebDriver driver= new FirefoxDriver();
	   driver.get("https://reg.ebay.com/reg/PartialReg?rv4=1");
		
	   //(1)by id
	   driver.findElement(By.id("firstname")).sendKeys("lekhana");
  
	   //(2)by name
	   driver.findElement(By.name("lastname")).sendKeys("gowda");
	   	  
	   //(3)by id
	   driver.findElement(By.id("email")).sendKeys("lekhanangowda@gmail.com");
	  
	   //(4)by xpath
	   driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("9916216485");
	   
	 //(5)by css selector
	   driver.findElement(By.cssSelector(".checkbox__control")).click();
	   
 //(6)by linktext
	   driver.findElement(By.linkText("User Agreement")).click();
	   
	   //(7)by partiallink text
	   driver.findElement(By.partialLinkText("Create a business")).click();
	  	   
	 //(8)by tagname	

		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		driver.close();
	}

}
