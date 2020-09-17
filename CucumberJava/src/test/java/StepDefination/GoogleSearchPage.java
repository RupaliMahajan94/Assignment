package StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchPage {
    WebDriver  driver =null;
    
	@Given("browser is open")
	public void browser_is_open() {
	 
		System.out.println("browser is open");
		
		String ProjectPath =System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Briq\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//  driver.manage().window().maximize();
	 
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	
	}

	@When("user enters test")
	public void user_enters_test() {
	   
	}

	@And("hits enter")
	public void hits_enter() {
	   
	}

	@Then("user navigated to search result")
	public void user_navigated_to_search_result() {
	  
	}

}
