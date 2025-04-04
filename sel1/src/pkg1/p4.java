package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class p4 {
	
	public static void valid(WebDriver dr) {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		if(s.equals("Products")) {
			System.out.println("valid Login Credentials : Test case - pass");
			
		}
		dr.findElement(By.id("react-burger-menu-btn")).click();
		dr.findElement(By.xpath("//div[@class='bm-menu-wrap']//a[3]")).click();
		
	}
	public static void invalid(WebDriver dr) {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		if(s.equals("Product")) {
			System.out.println("valid Login Credentials : Test case - fail");
			
		}
			
		
	}
	

}
