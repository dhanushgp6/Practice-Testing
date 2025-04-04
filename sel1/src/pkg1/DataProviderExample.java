package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	String s1="//div[@class='invemtory-list']/div[", s2="]/div[2]//a/div";
	String full_xp;
	static int num=1;
	static WebDriver dr = new ChromeDriver();
	public void loin() {
	dr.get("https://www.saucedemo.com/");
	
	dr.findElement(By.id("user-name")).sendKeys("standard_user");
	dr.findElement(By.id("password")).sendKeys("secret_sauce");
	dr.findElement(By.id("login-button")).click();
	
	}
	@BeforeClass
	public void execute() {
		loin();
		
	}
	
	
	@DataProvider(name="logindata")
	public Object[] getdata(){		
		Object[] names= new Object[]{
			"Sauce Labs Backpack",
			"Sauce Labs Bike Light",
			"Sauce Labs Bolt T-Shirt",
			"Sauce Labs Fleece Jacket",
			"Sauce Labs Onesie",
			"Test.allTheThings() T-Shirt (Red)"
				
				
			
		};
		return names;
	}
	@Test(dataProvider="logindata")
	public void test1(String epname) {
		full_xp=s1+num+s2;
		String pname=dr.findElement(By.xpath(full_xp)).getText();
		Assert.assertEquals(pname,epname);
		num++;
		
		
		
	}}
