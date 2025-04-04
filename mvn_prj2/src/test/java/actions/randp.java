package actions;
import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class randp { 
	static WebDriver dr;
	public static void main(String[] args) {
		dr=new ChromeDriver();
		m6();
	
	}
	public static void m3() {
		dr.get("https://practice.expandtesting.com/large");
		String s=dr.findElement(By.xpath("//*[@id=\"large-table\"]/tbody/tr[20]/td[1]")).getText();
		System.out.println(s);
		
	}
	public static void m4() {
		dr.get("https://practice.expandtesting.com/slow");
		Wait<WebDriver> wt=new FluentWait<WebDriver>(dr)
					.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		String u="//*[@id=\"result\"]/p/strong";
		WebElement s=wt.until(ExpectedConditions.elementToBeClickable(By.xpath(u)));
		System.out.println(s.getText());
		//div[@id="result"]//p//strong
	}
	public static void m5() {
		dr.get("https://jqueryui.com/selectmenu");
		dr.findElement(By.xpath("//*[@id=\"speed-button\"]/span[1]")).click();
		WebElement w=dr.findElement(By.xpath("//*[@id=\"ui-id-2\"]"));
		Select s=new Select(w);	
		
	}
	public static void m6() {
		dr.get("https://jqueryui.com/checkboxradio");
		
		WebElement w=dr.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		dr.switchTo().frame(w);
		dr.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]")).click();
		dr.findElement(By.xpath("/html/body/div/fieldset[2]/label[3]")).click();
		dr.findElement(By.xpath("/html/body/div/fieldset[2]/label[4]")).click();
		
	 }
	public static void m8() {
		dr.get("https://jqueryui.com/checkboxradio");
		
		WebElement w=dr.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		dr.switchTo().frame(w);
		dr.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]")).click();
		dr.findElement(By.xpath("/html/body/div/fieldset[2]/label[3]")).click();
		dr.findElement(By.xpath("/html/body/div/fieldset[2]/label[4]")).click();
		
	 }
	
	
	
	

}
