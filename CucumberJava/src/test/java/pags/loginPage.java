package pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
//objects	
By txt_username=By.id("email");
By txt_password=By.id("password");
By btn_login=By.id("sign-in-btn");

public loginPage(WebDriver driver)
{
	//to maintain the same session
 this.driver=driver;
if(!driver.getTitle().equals("Studio Next"))
{ 
	throw new  IllegalStateException("This is not login page and current page is"+ driver.getCurrentUrl());
	}
 
}
public void enterUserPass(String username ,String password)
{
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);
	
}

public void clickLogin()
{
	driver.findElement(btn_login).click();
}
}
