package org.apache.maven.archetypes.com.maven_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class Utility_Files {
	//private static final String String = null;
	//private static final boolean Integer = false;
	public static WebDriver driver;

	// getbrowser
	public static WebDriver get_brower(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (name.equalsIgnoreCase(name)) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

	// close()
	public static void close() {
		driver.close();
	}

	// quit()
	public static void quit() {
		driver.quit();

	}

	// navigate().to()
	public static void go_to(String s) {
		driver.navigate().to(s);
	}

	public static void go_back() {
		driver.navigate().back();
	}

	public static void go_forward() {
		driver.navigate().forward();
	}

	public static void go_refresh() {
		driver.navigate().refresh();
	}

	
	public static void alert_handling() {
		driver.switchTo().alert();
	}
	public void get_url(String s) {
driver.get(s);
	}

	// webelement click
	public static void click_On_Element(WebElement e) {
		e.click();
	}

	// webelement clear
	public static void clear_Element(WebElement e) {
		e.clear();
	}

	// webelement sendkeys
	public static void sendkeys(WebElement e, String s) {
		e.sendKeys (s);

	}

	
	
	// actions
	public static void mouse_Actions(WebElement e, String s) {
		Actions a = new Actions(driver);

		if (s.equalsIgnoreCase("click")) {
			a.click(e).build().perform();
		} else if (s.equalsIgnoreCase("clickandhold")) {

			a.clickAndHold(e).build().perform();
		} else if (s.equalsIgnoreCase("doubleclick")) {
			a.contextClick();

		}
	}

	public static void mouse_Actionss(WebElement e, WebElement ele, String s) {
		Actions a = new Actions(driver);
		if (s.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(e, ele);
		}
	}

	// frame
	public static void frame_Handling(int i) {

		driver.switchTo().frame(i);
	}

	public static void frame_Handling(String s) {
		driver.switchTo().frame(s);

	}

	public static void frame_Handling(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public static void frame_Handling(WebDriver d) {
		driver.switchTo().defaultContent();
	}

//robot
	public static void robot_Updown(String s, int n) throws AWTException {
		Robot r = new Robot();

		if (s.equalsIgnoreCase("down")) {
			for (int i = 0; i < n; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);

			}
			if (s.equalsIgnoreCase("up")) {
				for (int i = 0; i < n; i++) {
					r.keyPress(KeyEvent.VK_UP);
					r.keyRelease(KeyEvent.VK_UP);
				}
				if (s.equalsIgnoreCase("enter")) {
					for (int i = 0; i < n; i++) {
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
					}
				}
			}
		}
	}

	public static void window_Switch(String s) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String url : windowHandles) {
			String gettitle = driver.switchTo().window(url).getTitle();
			if (gettitle.contains(s)) {
				driver.switchTo().window(url);
				break;
			}
		}
	}

	public static void dropdown(WebElement e, String type, String data) {
		Select s = new Select(e);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(data);

		}
		else if (type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(data);
		}
		else if(type.equalsIgnoreCase("INDEX")) {
               int i = Integer.parseInt(data);
			    s.selectByIndex(i);
		}
	}

	public static void js_click(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
	}

	public static WebElement find_Element(String xpath) {
		WebElement e = driver.findElement(By.xpath(xpath));
		return e;
	}

	public static void screenshot(String s) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destignation = new File(s);
		FileUtils.copyDirectory(source, destignation);

	}
	
	public static String particular_cell(int sheet_No, int row_No, int cell_No) throws IOException {

	String value =null;

	File f = new File("C:\\Users\\LEO\\eclipse-workspace\\com.maven_project\\src\\test\\java\\Read_project.xlsx");

	FileInputStream Fils = new FileInputStream(f);

	Workbook wb = new XSSFWorkbook(Fils);

	Sheet sh = wb.getSheetAt(sheet_No);

	Row r = sh.getRow(row_No);

	Cell c = r.getCell(cell_No);

	CellType type = c.getCellType();

	if (type.equals(CellType.STRING)) {

		value = c.getStringCellValue();
	} 
	else if (type.equals(CellType.NUMERIC)) {

		int numeric = (int)c.getNumericCellValue();
		value=String.valueOf(numeric);
	 
	}
	return value;
	}



}



