package actions;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listner1.class)
public class login {
	static WebDriver dr;
	@BeforeMethod
	public void bm() {
		 dr=new ChromeDriver();
		 dr.get("https://www.saucedemo.com");	}	
		
	@Test
	public void test1() {
		 dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		 dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		 dr.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 String s=dr.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		 assertEquals("Product",s);
		 Reporter.log("1st test");
		 
	}
	@Test
	public void test2() {
		 dr.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		 dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauc");
		 dr.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 String s=dr.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		 assertEquals("Product",s);
		 Reporter.log("2nd test fail");
	}

}
