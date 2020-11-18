package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QuestionTwo {

	
	@Test
	public void launchwebsite() throws Exception
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get(" https://www.qaagility.com ");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	 //Question2: a) verify the title of the page 
		
		  String ExpectedTitle= "QAAgility"; String ActualTitle = driver.getTitle();
		  System.out.println("Title of page is" + " "+ ActualTitle);
		  assertEquals(ActualTitle, ExpectedTitle);
		 	 
	//Question2: b)Get the size attributes for the QAAgility logo on top left corner
	   
	  WebElement logo=  driver.findElement(By.xpath("(//img[contains(@title,'QAAgility Technologies')])[1]"));
	   
	  System.out.println("Logo Size is" + " "+ logo.getSize());
	  
	 
	
	// Question 3:  Verify that Twitter” button is present in the middle of page. Ensure that the footer text is “QAAgility Technologies Pvt. Ltd. © 2018. All Rights Reserved.”  
	   
	  WebElement twittersymbol=  driver.findElement(By.xpath("//a[@href='https://twitter.com/qaagility']"));
	  twittersymbol.isDisplayed();
	  
	  
	  String ExpectedFooter = "QAAgility Technologies Pvt. Ltd. © 2018. All Rights Reserved";
	  
	  WebElement footer =driver.findElement(By.xpath("//div[@class='copyright-bar'][contains(.,'QAAgility Technologies © 2020. All Rights Reserved')]"));
	  
	 	  
	  String ActualFooter= footer.getText();
	  System.out.println("Footer of page is" + " "+ ActualFooter);
	
	  assertEquals(ActualFooter, ExpectedFooter, "The footer doesnt match");	
	  
	  driver.close();
		

	}

}
