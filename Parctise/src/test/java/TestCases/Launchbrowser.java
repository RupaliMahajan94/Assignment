package TestCases;

	import java.util.Iterator;
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
		System.setProperty("webdriver.chrome.driver","E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     
	     driver.get("https://www.propertycapsule.com");
	       
	  	 driver.manage().window().maximize();
	  	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  	 
	  	System.out.println("Title of page is: "+driver.getTitle()); 
	  	
	  	Thread.sleep(1000);
	    WebElement mapMaker = driver.findElement(By.xpath("//*[@id=\"market-btn\"]")); 
         if (mapMaker.isDisplayed())
         {
        	 System.out.println("Text is displayed as :"+ mapMaker.getText());
        	 mapMaker.click();
        	 
        	 Thread.sleep(1000);
         }
         else
         {
        	 System.out.println("Mapmaker tab is not dispalyed");
         }
        
		 
		 
	/*	 driver.get("https://www.naukri.com/");    
		 String Title =  driver.getTitle();	 
	     System.out.print("Tile of page is:"+ " "+ Title);
	     
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 String parentW =driver.getWindowHandle();
		 System.out.println("window name is"+  parentW);
		 Set<String>childW =driver.getWindowHandles();
		 Iterator<String>itr=childW.iterator();
		 String chieldW=" ";
		 
		 while(itr.hasNext())
		 {
			 chieldW=itr.next();
			 System.out.println("childwindowhandle:"+ chieldW );
			 
			 if(!parentW.equals(chieldW))
			 {
				 driver.switchTo().window(chieldW);
				 System.out.println("title of child windw:"+ chieldW);
				 driver.close();
			 }
			 
			 else
			 {
				 
				 driver.switchTo().window(parentW);
				 System.out.println("title of parent windw:"+ parentW);
		}	 }
	*/
		 
		 driver.close();
		 driver.quit();
		 }
		 
		 
		 
		}
		
		
	


