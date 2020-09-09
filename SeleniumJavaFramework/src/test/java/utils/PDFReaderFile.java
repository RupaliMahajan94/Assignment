package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;



public class PDFReaderFile {

	
	public static void main(String [] args) throws IOException
	{				
		FileInputStream obj =new FileInputStream("E:\\Briq\\SeleniumJavaFramework\\excel\\sample statement.PDF");
		PDDocument doc = PDDocument.load(obj);
		PDFTextStripper stripper = new 	PDFTextStripper();
		
		  String pdfContent = stripper.getText(doc); 
		  System.out.println(pdfContent);
		 
		Assert.assertTrue(pdfContent.contains("1000 Walnut\r\n" + "Kansas City MO 64106-3686")); 
	
		
	     /*
		 * 1. Bank Address 2. Customer Name 3. Customer Address 4. Account Number 5.
		 * Statement Date 6. Ending Balance 7. Total Withdrawals 8. Total Deposits 9.
		 * Total Checks
		 */
	}
}