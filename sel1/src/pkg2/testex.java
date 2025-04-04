package pkg2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class testex {
	
	public static void main(String[] args) {
		WebDriver wb=new ChromeDriver();
		wb.get("https://the-internet.herokuapp.com/dynamic_controls");
		wb.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
		WebDriverWait wt=new WebDriverWait(wb,Duration.ofMillis(5000));
		WebElement ele=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']/button")));
		ele.click();
		boolean a;
		WebDriverWait wt2=new WebDriverWait(wb,Duration.ofMillis(5000));
		WebElement ele2=wt2.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']/div/input")));
		a=ele2.isDisplayed();
		
		if(a=true) {
			System.out.println("true");
		}
		
	}

}
