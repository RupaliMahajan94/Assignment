import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrowserTest {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		  System.setProperty("webdriver.gecko.driver",
		  projectPath+"/drivers/geckodriver/geckodriver.exe"); WebDriver driver = new
		  FirefoxDriver();
		 
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * projectPath+"/drivers/chromedriver/chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver();
		 */
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.bizjournals.com/milwaukee/maps/project-watch");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		List<WebElement> pin = driver.findElements(By.id("//yt-icon[@id='play']"));
		int count = pin.size();
		System.out.println("Count of Input elemtns : "+count);
	 
		
	//	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		
	//	List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
	//	int count = listOfInputElements.size();
		
	//	System.out.println("Count of Input elemtns : "+count);
		
		
		//WebElement textBox = driver.findElement(By.id("lst-ib"));
		
		//textBox.sendKeys("Automation Step by Step");
		
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}
	
}
