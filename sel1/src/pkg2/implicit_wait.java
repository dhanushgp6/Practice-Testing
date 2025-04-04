package pkg2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr=new ChromeDriver(); 
		dr.get("https://www.saucedemo.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		dr.findElement(By.id("user-name")).sendKeys("qwe");
		
		
		
	}

}
