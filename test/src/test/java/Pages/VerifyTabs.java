package Pages;


import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.How; 

public class VerifyTabs {

	WebDriver driver; 
	  
    public VerifyTabs(WebDriver driver) { 
        this.driver = driver; 
    } 
  
    // Using FindBy for locating elements 
    @FindBy(how = How.XPATH, using = "//*[@id=\"market-btn\"]") 
    WebElement mapMaker; 

    public void verifyTabs()

    {
    	mapMaker.isDisplayed();
    }
	}


