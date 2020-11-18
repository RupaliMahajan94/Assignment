package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.How;
public class TestBase {

	
	 public static WebDriver driver = null; 
	@Test
	    public void initialize() throws IOException { 
		 
		 
	  	  String projectpath= System.getProperty("user.dir");
	  	     System.out.print("projectpath:"+ projectpath);
	  	     
	  			/*
	  			 * System.setProperty("webdriver.gecko.driver",
	  			 * "E:\\test\\BriqProject\\Driver\\geckodriver.exe");
	  			 * WebDriver driver =new FirefoxDriver();
	  			 */
	  			System.setProperty("webdriver.chrome.driver","E:\\Briq\\test\\drivers\\chromedriver\\chromedriver.exe");
	  			driver =new ChromeDriver();
	  			
	  			driver.get("hhttps://www.propertycapsule.com");
	       
	  	 driver.manage().window().maximize();
	  	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  	 
	  	System.out.print("Title of page is: "+driver.getTitle()); 
	  	
	  
	    WebElement mapMaker = driver.findElement(By.xpath("//*[@id=\"market-btn\"]")); 
        mapMaker.isDisplayed();
        
        TestBase.driver.quit();
	  
	}
	
}
