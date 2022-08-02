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

public class All_Data {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\LEO\\eclipse-workspace\\com.maven_project\\dummy.xlsx");
		FileInputStream fils= new FileInputStream(f);
		
		Workbook wb =new XSSFWorkbook(fils);
	
		Sheet s=wb.getSheetAt(0);
		
		
		//int Nr = s.getPhysicalNumberOfRows();
		for(int r=0;r<s.getPhysicalNumberOfRows();r++) {
			Row row = s.getRow(r);
			for(int c=0;c<row.getPhysicalNumberOfCells();c++) {
				Cell cells = row.getCell(c);
				//CellType type = cells.getCellType();

                 switch (cells.getCellType()) {
                 case STRING : 
                	 System.out.print(cells.getStringCellValue());
                     break;
                     
                 case NUMERIC: 
                	 double numeric = cells.getNumericCellValue();
                	 int num =(int) numeric;
                	 System.out.print(num);
                	 
                 }
			
			}
			
			System.out.println();
		}
		          
		
		
		 
		
		
		
	}

}
