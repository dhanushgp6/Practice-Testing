package pkg2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {
	static WebDriver db=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch_chrome("https://demoqa.com/alerts");
		WebElement e=db.findElement(By.xpath("//button[@id='alertButton']"));
		e.click();
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		Alert a=db.switchTo().alert();
		String alert_msg=a.getText();
		System.out.println("Alert Message :" +alert_msg);
		System.out.println("Alert Message");
		a.accept();
	}

	private static void launch_chrome(String string) {
		// TODO Auto-generated method stub
		db.get(string);
		
	}

}
