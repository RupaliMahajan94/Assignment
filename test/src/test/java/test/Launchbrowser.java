package test;

	
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class Launchbrowser {
	 
		@Test
		public void launchBrowser() throws Exception  
		{
			 String projectpath= System.getProperty("user.dir");
		     System.out.print("projectpath:"+ projectpath);
				/*
				 * System.setProperty("webdriver.gecko.driver",
				 * "E:\\SeleniumJavaFramework1-master\\BriqProject\\Driver\\geckodriver.exe");
				 * WebDriver driver =new FirefoxDriver();
				 */
		System.setProperty("webdriver.chrome.driver","E:\\Briq\\Test\\drivers\\chromedriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		
	     
		 driver.manage().window().maximize();
		 driver.get("https://www.propertycapsule.com");
	       
	 
		 
	
		 driver.close();
		 driver.quit();
		 
		 }
		 
	
		}
		
		
	


