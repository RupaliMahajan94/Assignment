package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String url=" ";
	public String username="sada23131";
	public String password="dsfds";
	
	public WebDriver driver ;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ " ");
		driver =new ChromeDriver();
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
