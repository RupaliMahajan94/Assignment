package TestCases;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class HTMLUnitDriver {

	public static void main(String[] args) throws RuntimeException, Exception {
		// TODO Auto-generated method stub
  
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
   
		driver.get("http://studio-staging.ap-southeast-2.elasticbeanstalk.com/login");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		WebClient wc = (WebClient) get(driver,"webClient");
		
		
		System.out.println("Browser version is :" + wc.getBrowserVersion());
		
		
		System.out.println("Browser is :" + wc.getBrowserVersion().isChrome());
		
		System.out.println("Browser is :" + wc.getBrowserVersion().isFirefox());
		
		
	}

	private static Object get(Object obj, String field) throws Exception {
		
		
		Field f =obj.getClass().getDeclaredField(field);
		f.setAccessible(true);
		return f.get(obj);
	}

}
