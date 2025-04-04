package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mm1 {
	public static void main(String[] args) {
	WebDriver db=new ChromeDriver();
	db.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
	WebElement w1=db.findElement(By.xpath("//div[@id='draggable']"));
	WebElement w2=db.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions a = new Actions(db);
	a.dragAndDrop(w1, w2);
	
	
	}
}
