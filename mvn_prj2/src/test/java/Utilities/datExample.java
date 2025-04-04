package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datExample {
	
	
public  Object[][] getdata() throws IOException {
	String filename="Book420.xlsx";
	String sheetname="Sheet1";
	Object[][] sb = null;
	FileInputStream fis=new FileInputStream(filename);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet(sheetname);
	
	XSSFRow r=sh.getRow(0);
	XSSFCell cell =r.getCell(0);
	String s=cell.getStringCellValue();
	sb[0][1]=r;
	sb[0][1]=cell;
	
	return sb ;
	

}}
