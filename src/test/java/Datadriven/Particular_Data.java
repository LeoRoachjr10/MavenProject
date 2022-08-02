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

public class Particular_Data {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\LEO\\eclipse-workspace\\com.maven_" + "project\\Runner testcase1.xlsx");

		FileInputStream Fils = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(Fils);

		Sheet s = wb.getSheetAt(1);

		Row r = s.getRow(2);

		Cell c = r.getCell(0);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (type.equals(CellType.NUMERIC)) {

			double numeric = c.getNumericCellValue();
			int num = (int) numeric;
			System.out.println(num);
		}

		wb.close();

	}

}
