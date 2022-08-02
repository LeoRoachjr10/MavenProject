package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Row {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\LEO\\eclipse-workspace\\com.maven_project\\dummy.xlsx");
		FileInputStream fil=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fil);
	Sheet s=wb.getSheetAt(0);
	Row row = s.getRow(1);
	
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		CellType type = cell.getCellType();
	if (type.equals(CellType.STRING)) {
		String stringCellValue = cell.getStringCellValue();
		System.out.print(" "+ stringCellValue);
	}	
	else if (type.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int num=(int)numericCellValue;
		System.out.print(" "+ num);
	}
	}
	}
	
	}
	
	
		
		
	

