package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_coloumn {
	public static void main(String[] args) throws IOException {

	File f=new File("C:\\Users\\LEO\\eclipse-workspace\\com.maven_project\\dummy.xlsx");
	FileInputStream fil=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fil);
Sheet s=wb.getSheetAt(0);


	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
		Cell c = row.getCell(1);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			String stringCellValue = c.getStringCellValue();
			System.out.print(" "+ stringCellValue);
		}	
		else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			int num=(int)numericCellValue;
			System.out.print(" "+ num);
		}
	}
	}



}