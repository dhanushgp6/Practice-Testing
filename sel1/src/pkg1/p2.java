package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wb = new ChromeDriver();
		wb.get("https://demowebshop.tricentis.com/");
		/*
		 * wb.findElement(By.className("ico-login")).click();
		 * 
		 * wb.findElement(By.id("Email")).sendKeys("aa1111@gmail.com");
		 * wb.findElement(By.id("Password")).sendKeys("raju123");
		 * wb.findElement(By.xpath(
		 * "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"
		 * )).click();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * wb.findElement(By.id("pollanswers-1")).click();
		 * wb.findElement(By.id("vote-poll-1")).click();
		 * 
		 * 
		 * wb.findElement(By.xpath(
		 * "/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"
		 * )).click();
		 * wb.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Dhanush");
		 * wb.findElement(By.id("Email")).sendKeys("aa1111@gmail.com");
		 * wb.findElement(By.id("add-to-cart-button-2")).click();
		 */

		
		wb.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]//a[@href='/books']")).click();
		WebElement w= wb.findElement(By.id("products-orderby"));
		Select s= new Select(w);
		s.selectByIndex(0);
		
		
		
	}

}
