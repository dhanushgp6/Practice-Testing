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

public class explicit_wait1 {
	public static void main(String[] args) {
	WebDriver dr=new ChromeDriver();
	dr.get("https://demowebshop.tricentis.com/books");
	WebDriverWait wt=new WebDriverWait(dr,Duration.ofMillis(2000));
	WebElement ele=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")));
	ele.click();
	
	

}}
