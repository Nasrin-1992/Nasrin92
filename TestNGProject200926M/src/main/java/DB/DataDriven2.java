package DB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven2 {

	FileInputStream f1;
	XSSFWorkbook book;
	XSSFSheet sheet;
	Object [][] o;
	XSSFCell cell;


	public Object[][] readXL() {

		try {
			f1 = new FileInputStream(new File("C:\\Users\\Shamima Nasrin\\eclipse-workspace\\TestNGProject200926M\\Book1.xlsx"));
			book = new XSSFWorkbook(f1);
			sheet =  book.getSheetAt(0);
			
			//read one cell
			sheet.getRow(0).getCell(1);

			//cell.getStringCellValue();
			//read all dates
			
			int rowNum = sheet.getLastRowNum();
			int cellNum = sheet.getRow(0).getLastCellNum();

			System.out.println(rowNum);
			o= new Object [rowNum][cellNum];

			for(int i = 1; i<=rowNum;i++) {
				for(int j = 0; j<= cellNum;i++) {
					cell= sheet.getRow(i).getCell(j);

					switch(cell.getCellType()) {

					case
					XSSFCell.CELL_TYPE_NUMERIC:{
						o[i-1][j]=cell.getNumericCellValue();
						break;
					}
					case
					XSSFCell.CELL_TYPE_STRING:{
						o[i-1][j]= cell.getStringCellValue();
						break;
					}

					} 
				}
			}

		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return o;
	}




























}
