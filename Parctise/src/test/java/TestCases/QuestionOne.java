package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QuestionOne {
	@Test
	public void launchgooglemap() throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get(" https://www.google.com/maps/ ");
	    driver.manage().window().maximize();
	    Thread.sleep(5000); 
	    
	  //b. Search for “Wankhede Stadium” and then click on Maps  
	   WebElement searchBox= driver.findElement(By.xpath("//input[contains(@id,'searchboxinput')]"));
	   searchBox.sendKeys("Wankhede Stadium");
	   searchBox.sendKeys(Keys.ENTER);
	  
		 
	    //e. Verify the Title “Wankhede Stadium - Google Maps”
	   
	   String ExpectedTitle= "Wankhede Stadium - Google Maps";  
	   String ActualTitle = driver.getTitle();
	   System.out.println("Title of google map is" + " "+ ActualTitle);
	   assertEquals(ActualTitle, ExpectedTitle);
	   
		
	 driver.close();   
	    
}

}
