package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TabVerification {

	WebDriver driver;

	public TabVerification(WebDriver driver) {
		this.driver = driver; 	}
	
	 @Test(priority=1)
		public void Test1() throws Exception  
		{
			WebElement propertyLogo = driver.findElement(By.xpath("//img[@src='assets/images/pcVTSGreyLogo.png']")); 
		  	Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", propertyLogo);

		  	if (!ImagePresent) {
		  		System.out.println("Image not displayed.");
		  	} else {
		  		System.out.println("Image displayed.");
		  	}

		  	
		}
	 @Test(priority=2)
		public void Test2() throws Exception  
		{

		  WebElement mapMaker =
		  driver.findElement(By.xpath("//*[@id=\"market-btn\"]"));
		  
		  if (mapMaker.isDisplayed()) 
		  { 
			  System.out.println("Text is displayed as :"+
		      mapMaker.getText()); 
			  mapMaker.click(); 
			  Thread.sleep(3000); } 
		  else {
		  System.out.println("Mapmaker tab is not dispalyed"); }
		  
		 }
		  
	 @Test(priority=3)
		public void Test3() throws Exception  
		{
		  WebElement tourBooks =
				  driver.findElement(By.xpath("//*[@id=\"manage-btn\"]")); 
				  if
				  (tourBooks.isDisplayed()) 
				  { 
				  System.out.println("Text is displayed as :"+tourBooks.getText()); 
				  tourBooks.click(); 
				  Thread.sleep(3000); }
				  else {
				  System.out.println("Tourbooks tab is not dispalyed");
		}
				  
	
		}
}
