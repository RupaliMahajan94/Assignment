package test;

import org.openqa.selenium.support.PageFactory; 
import org.testng.annotations.Test; 
import Pages.VerifyTabs;



public class TestCase1 extends TestBase{

	 @Test
	    public void init() throws Exception 
	 { 
		 VerifyTabs vt =PageFactory.initElements(driver, 
				 VerifyTabs.class); 
		 
		 vt.verifyTabs();
	}

}
