package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenUtil {
	
	static FileInputStream f1;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static Object [][] o;
	static XSSFCell cell;
	
	public static  Object[][] getData() {
		
		try {
			 f1 = new FileInputStream(new File("C:\\Users\\Shamima Nasrin\\eclipse-workspace\\TestNGProject200926M\\ExcelFile.xlsx"));
			     
				book= new XSSFWorkbook(f1);
			    sheet =book.getSheetAt(0);
			    int rownum = sheet.getLastRowNum();
			    int cellnum = sheet.getRow(0).getLastCellNum();
			    System.out.println(rownum);
			    o= new Object [rownum][cellnum];
			    
			       for (int i = 0; i <=rownum; i++) {
			    	   for(int j=1; j<= cellnum; i++) {
			    		 cell = sheet.getRow(i).getCell(j);
			    		   switch(cell.getCellType()) {
			    		   
			    		   case XSSFCell.CELL_TYPE_NUMERIC:{
			    			  o [i-1][j]= cell.getNumericCellValue();
			    			  break;
			    		   }
			    		   case XSSFCell.CELL_TYPE_STRING:{
			    			   o [i-1][j]= cell.getStringCellValue();
			    			   break;
			    		   }
			    		   
			    		   
			    		   }
			    	   }
				
			}
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
