package pkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
public class factory2 {
	static WebDriver dr;
	String browser;
	public factory2(String browser) {
		this.browser=browser;
	}
	@Test
	public void testMethod() {
		switch(browser) {
		case "chrome": 
			dr=new ChromeDriver();
			dr.get("https://www.saucedemo.com/");
			pass(dr);
			break;
		case "edge":
			dr=new EdgeDriver();
			dr.get("https://www.saucedemo.com/");
			pass(dr);
			break;
		case "firefox":
			dr=new FirefoxDriver();
			dr.get("https://www.saucedemo.com/");
			pass(dr);
			break;
}
	}
	@Factory
	public static Object[] fact() {
		Object[] bw = {
				new factory2("chrome"),
				new factory2("edge"),
				new factory2("firefox")	
		};
		return bw;
	}
	public static void pass(WebDriver dr) {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		
	}
	
	

}
