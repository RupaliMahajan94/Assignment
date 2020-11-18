package com.Pages;

	import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class TestBase {
		public static  WebDriver driver=null;
		@BeforeTest
		public void launchBrowser() throws Exception  
		{
			 String projectpath= System.getProperty("user.dir");
		     System.out.print("projectpath:"+ projectpath);
			
		System.setProperty("webdriver.chrome.driver","E:\\Briq\\Assignment\\drivers\\chromedriver\\chromedriver.exe");
	     driver =new ChromeDriver();
		
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     
	     driver.get("https://www.propertycapsule.com");
	       
	  	 driver.manage().window().maximize();
	  	 
	  	System.out.println("Title of page is: "+driver.getTitle()); 
	  	
	  	Thread.sleep(1000);
		 
		}
	@AfterTest
	public void TearDown()
	{
		driver.close();
		 driver.quit();
	}
		
	}


