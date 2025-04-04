package maven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class readmarks {

	public static HashMap<Double, values> read() throws IOException {
		HashMap<Double,values> student=new HashMap<>();
		String filename="data.xlsx";
		String sheetname="Sheet2";
		
		FileInputStream fis=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname);
		
		
		for ( int i =2; i<5;i++) {
			
			XSSFRow r=sh.getRow(i);
			XSSFCell cell1 =r.getCell(1);
			double s1=cell1.getNumericCellValue();
			System.out.println(s1);
			XSSFCell cell2 =r.getCell(2);
			double s2=cell2.getNumericCellValue();
			XSSFCell cell3 =r.getCell(3);
			double s3=cell3.getNumericCellValue();
			values v=new values(s1,s2,s3);
			student.put(v.id,v);
			
		}	
		return student;	
	}



	
	
	
	
	
}
