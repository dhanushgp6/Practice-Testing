package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class p3 {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		
		dr.get(" https://jqueryui.com/checkboxradio/");	
		dr.findElement(By.xpath("//*[text[0]='Checkboxradio']")).click();
		
		
		
		
		
		
	
	
	
	
	
	
	
	}
}
