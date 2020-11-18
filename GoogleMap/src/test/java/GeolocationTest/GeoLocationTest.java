package GeolocationTest;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Map;
import java.util.*;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocationTest {
 //  protected static ChromeDriver driver;
   
	/*
	 * @BeforeClass public void testSetUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
	 * 
	 * // WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 */
   
   @Test
   public void test_Selenium4_Geolocation() throws InterruptedException {
	   
	   
	  
	   String URL = "https://locations.dennys.com/search.html/";
	   System.setProperty("webdriver.chrome.driver","E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
	   ChromeDriver driver =new ChromeDriver();
       Map< String,Object> coordinates =  
               new HashMap< String,Object>();
       { {
       /* Create a hashmap for latitude, longitude, and accuracy as needed by Google Maps */
       coordinates.put("latitude", 42.1408845); 
       coordinates.put("longitude", -72.5033907);
       coordinates.put("accuracy", 100);
       }};
       /* Command to emulate Geolocation */
       
       driver.getScreenshotAs(null);
       driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
       driver.navigate().to(URL);
       driver.manage().window().maximize();
       
       /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); */
       /* Not a good programming practice, added for demonstration */
       Thread.sleep(5000);
       
       WebElement location_icon = driver.findElement(By.cssSelector(".icon-geolocate"));
       Thread.sleep(2000);
       location_icon.click();

       Thread.sleep(6000);
       System.out.println("Geolocation testing with Selenium is complete");
       driver.close();
   }
   
	/*
	 * @AfterClass public void tearDown() { if (driver != null) { driver.quit(); } }
	 */
}

