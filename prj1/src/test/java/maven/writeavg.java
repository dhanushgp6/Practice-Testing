package maven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeavg {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		HashMap<Double,values> s2=new HashMap<>();
		s2=readmarks.read();
		double[] arr1 = new double[3];
		int i=0;
		for(Entry<Double, values> e:s2.entrySet()) {
			values v=e.getValue();
			System.out.println(e.getKey()+" "+v.mark1+" "+v.mark2);
			arr1[i]=(v.mark1+v.mark2)/2;
			System.out.println(arr1[i]);
			i++;
		}
		
		String filename="data.xlsx";
		String sheetname="Sheet3";
		
		FileInputStream fis=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname);
		int k=0;
		for ( int j =2; j<5;j++) {
			
			XSSFRow r=sh.getRow(j);
			XSSFCell cell1 =r.getCell(4);
			cell1.setCellValue(arr1[k]);
			k++;
			
		}		
		
		
		FileOutputStream fs= new FileOutputStream(filename);
		wb.write(fs);
		fs.close();
		wb.close();
		
		
		
	}

}
