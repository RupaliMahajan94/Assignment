package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver driver;
 
 LoginPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(name="uid")
 @CacheLookup
 WebElement textusername;
 

 public void setUsername(String name)
 {
	 textusername.sendKeys(name);
 }
 
}
