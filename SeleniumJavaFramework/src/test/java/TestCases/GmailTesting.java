package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;



public class GmailTesting {
 
	@Test
	public void launchBrowser() throws InterruptedException
	{
		 String projectpath= System.getProperty("user.dir");
	     System.out.print("projectpath:"+ projectpath);
			/*
			 * System.setProperty("webdriver.gecko.driver",
			 * "E:\\SeleniumJavaFramework1-master\\BriqProject\\Driver\\geckodriver.exe");
			 * WebDriver driver =new FirefoxDriver();
			 */
	System.setProperty("webdriver.chrome.driver","E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
	
//	HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 driver.get("https://accounts.google.com/");
	 String Title =  driver.getTitle();	 
     System.out.print("Tile of page is:"+ " "+ Title);
 
	 driver.manage().window().maximize();
	 
	// driver.findElement(By.linkText("Create New Account")).click();
	 

	 driver.close();
	 driver.quit();
	 
	}
	
	
}
