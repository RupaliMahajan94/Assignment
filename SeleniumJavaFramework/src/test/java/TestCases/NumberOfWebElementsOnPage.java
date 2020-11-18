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



public class NumberOfWebElementsOnPage {
 
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
	 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	 String Title =  driver.getTitle();	 
     System.out.print("Tile of page is:"+ " "+ Title);
 
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	// driver.findElement(By.linkText("Create New Account")).click();
	 Thread.sleep(1000);
	 List  textboxes=driver.findElements(By.xpath("//input[@type='text']"));
	 System.out.println("total textboxes "+textboxes.size());

	 List  password=driver.findElements(By.xpath("//input[@type='password']"));
	 System.out.println("total password "+password.size());

	
	 List  checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	 System.out.println("total checkboxes "+checkboxes.size());
	
	 
	 List  RadioButton=driver.findElements(By.xpath("//input[@type='radio']"));
	 System.out.println("total RadioButton "+RadioButton.size());
	 
	 List  Button=driver.findElements(By.xpath("//Button[@type='submit']"));
	 System.out.println("total Button "+Button.size());
	
	 
	 List dropdown=driver.findElements(By.tagName("select"));
	 System.out.println("total dropdown lists "+dropdown.size());
	 
	
	 List  totaliFrames=driver.findElements(By.tagName("iframe"));
	 System.out.println("total links "+totaliFrames.size());
	 
	 
	 driver.close();
	 driver.quit();
	 
	}
	
	
}
