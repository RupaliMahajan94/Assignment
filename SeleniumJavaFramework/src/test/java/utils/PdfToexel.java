package utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.util.*;
import java.io.*;

public class PdfToexel 
{
 public static void main(String args[]) throws IOException 
 {
  try
  {
   
	 FileInputStream obj =new FileInputStream("E:\\Briq\\SeleniumJavaFramework\\excel\\active licences.pdf");
   PrintWriter File = new PrintWriter("data.xlsx");
   PDDocument document = PDDocument.load(obj);
   document.getClass();
   if (!document.isEncrypted())
   {
    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
    stripper.setSortByPosition(true);
    PDFTextStripper Tstripper = new PDFTextStripper();
    String str = Tstripper.getText(document);
    
    Scanner scnLine = null;     
    scnLine = new Scanner(str);// scanner to read lines from pdf file...
    
    
    
    String line="";
    String NUMBER="";
    String TYPE="";
    String DBA_NAME="";
    String ADDRESS="";
    String CITY="";
    String ST="";
    String ZIP="";
    String PHONE_NUMBER="";
    String EXPIRES="";
    
    while (scnLine.hasNextLine()) 
    {  
     
     line = scnLine.nextLine();
     
     Scanner scnWord = new Scanner(line); // scanner to read words from lines....
     
     NUMBER=scnWord.next();
     
     TYPE=scnWord.next();
     
     DBA_NAME=scnWord.next();
     
     ADDRESS=scnWord.next();
     
     CITY=scnWord.next();
     
     ST=scnWord.next();
     
     ZIP=scnWord.next();
     
     PHONE_NUMBER=scnWord.next();
     
     EXPIRES=scnWord.next();
     
     
     File.println(NUMBER+","+TYPE+","+DBA_NAME+","+ADDRESS+ ","+CITY+","+ ST+","+ZIP+","+PHONE_NUMBER + ","+EXPIRES );
     
    } 
   }
   document.close();
   File.close();
  }
  catch (Exception e) 
  {
   e.printStackTrace();
  }
   
 }
}