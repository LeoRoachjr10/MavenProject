package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\leo book\\excel\\leo.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
	wb.createSheet("studentdata").createRow(0).createCell(0).setCellValue("name");
		wb.getSheet("studentdata").getRow(0).createCell(1).setCellValue("age");
		wb.getSheet("studentdata").createRow(1).createCell(0).setCellValue("leo");
		wb.getSheet("studentdata").getRow(1).createCell(1).setCellValue("27");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		
		
	}

}
