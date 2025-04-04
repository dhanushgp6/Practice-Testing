package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class p5 {

	public static void main(String[] args) {
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.saucedemo.com/");
		pkg1.p4.valid(wb);
		
		
	
		
		

	}

}
