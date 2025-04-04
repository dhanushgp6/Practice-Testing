package actions;
import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;public class right { 
	public static void main(String[] args) {{
		WebDriver dr=new ChromeDriver();
		dr.get("https://practice.expandtesting.com/context-menu");
		WebElement e =dr.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
		Actions a=new Actions(dr);
		a.contextClick(e).perform();
		Alert al=dr.switchTo().alert();
		al.accept();
		
	
	}
	}

}
