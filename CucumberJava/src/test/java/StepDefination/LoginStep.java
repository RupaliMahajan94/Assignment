package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver  driver =null;
	@Given("user is on login page")
	public void user_is_on_login_page() {
       System.out.println("browser is open");
		
		String ProjectPath =System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Briq\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		System.out.println("User is on login page");

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
	 	
	    driver.navigate().to("http://studio-staging.ap-southeast-2.elasticbeanstalk.com/login");
	    driver.findElement(By.id("email")).sendKeys("username");
	    driver.findElement(By.id("password")).sendKeys("password");
	     
	   System.out.println("User enters username and password");
	
	}

	@When("click on login button")
	public void click_on_login_button() {
	   
		System.out.println("User clicks on login page");
		driver.findElement(By.id("sign-in-btn")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    
		
		driver.findElement(By.xpath("//li[contains(.,'Home')]")).isDisplayed();
		System.out.println("User is navigated to login page");
		driver.close();
		driver.quit();
	
	}


 
}
