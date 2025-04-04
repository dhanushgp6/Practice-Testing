package maven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexceldata {
	
	public static void main(String[] args) throws IOException {
		String filename="data.xlsx";
		String sheetname="Sheet1";
		
		FileInputStream fis=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname);
		XSSFRow r=sh.getRow(0);
		XSSFCell cell1=r.getCell(1);
		cell1.setCellValue("yaa");
		FileOutputStream fs= new FileOutputStream(filename);
		wb.write(fs);
		fs.close();
		wb.close();
		
		
		
	}
	
	

}
