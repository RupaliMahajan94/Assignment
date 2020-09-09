package utils;

public class ExcelDataProviderbriq {

	
	
	
	public static void main(String [] args)
	{
		String excelPath ="E:\\Briq\\SeleniumJavaFramework\\excel\\leads.xlsx";
		testexcelData(excelPath,"leads");
	}

	public static void testexcelData(String excelPath, String sheetName) {
	 
  ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
  int rowCount=  excel.getRowCount();
  int columnCount= excel.getColCount();
  
  
  
  for(int i=0;i<rowCount;i++)
  {
	  for(int j=0;j<columnCount;j++)
	  {  
		
		 String cellData = excel.getCellDataString(i, j);
	//	 Double cellNumericData1 = excel.getCellDataNumber(i, j);
	 
		 System.out.print(cellData +" | ");
		 
	  }
	  System.out.println();
	  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	 
	}

	}
}
