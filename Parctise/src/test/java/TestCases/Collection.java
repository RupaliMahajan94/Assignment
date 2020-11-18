package TestCases;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class Collection {
	 
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
		System.setProperty("webdriver.chrome.driver","E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.get("https://money.rediff.com/gainers/bse/daily/groupa");    
		 String Title =  driver.getTitle();	 
	     System.out.println("Tile of page is:"+ " "+ Title);
	 
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 //self
		 driver.findElement(By.xpath("//*[contains(text(),'Blue Star')]")).click();
		 
		  String expectedTile="BLUE STAR LTD.  - Share Price | Ratios | BSE/NSE Performance | Live Stock Quote";
		  if (driver.getTitle().equals(expectedTile))
			  
		  {
			  System.out.println("title is"+driver.getTitle());
			  System.out.println("test pass");
			  
		  }
		  else
		  {
			  System.out.println("test fail");
		  }
		 driver.close();
		 driver.quit();
		 
		}
		
		
	}


