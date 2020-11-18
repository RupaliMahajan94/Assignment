package com.test.Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory; 
import org.testng.annotations.Test;

import com.Pages.TestBase;
import com.Pages.TabVerification;

public class TabVerificationTest extends TestBase {

//	private static final WebDriver driver = null;

	@Test
    public void init() throws Exception { 
   
		
		TabVerification TB = new TabVerification(driver);
		TB.Test1();
		TB.Test2();
		TB.Test3();
	}
	
}
