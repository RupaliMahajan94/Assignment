package utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PdfReader {
      @Test
	public void readPDFTest() throws IOException {
		
    	  String projectpath= System.getProperty("user.dir");
    	     System.out.print("projectpath:"+ projectpath);
    			/*
    			 * System.setProperty("webdriver.gecko.driver",
    			 * "E:\\SeleniumJavaFramework1-master\\BriqProject\\Driver\\geckodriver.exe");
    			 * 
    			 * 
    			 * WebDriver driver =new FirefoxDriver();
    			 */
    			System.setProperty("webdriver.chrome.driver","E:\\Briq\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
    			WebDriver driver =new ChromeDriver();
    			
    			driver.get("https://drive.google.com/file/d/1gQETWBIkAQleN3F4Z_seAOXWiZNeXV7K/view");
    	 String currentUrl =driver.getCurrentUrl();
    	 driver.manage().window().maximize();
    	  			
		URL url =new URL(currentUrl);
        InputStream is =url.openStream();
        BufferedInputStream fileparse = new BufferedInputStream(is);
        PDDocument document =null;
        
        document=PDDocument.load(fileparse);
        String pdfContent = new PDFTextStripper().getText(document);
        System.out.println(pdfContent);
	}

}
