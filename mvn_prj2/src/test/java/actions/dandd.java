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
import org.testng.annotations.Test;
public class dandd { 
	public static void main(String[] args) {{
		WebDriver dr=new ChromeDriver();
		dr.get("https://practice.expandtesting.com/drag-and-drop");
		WebElement e =dr.findElement(By.xpath("//*[@id=\"column-a\"]"));
		WebElement f =dr.findElement(By.xpath("//*[@id=\"column-b\"]"));
		Actions a=new Actions(dr);
		a.dragAndDrop(e, f).perform();
		
	
	}
	}

}
