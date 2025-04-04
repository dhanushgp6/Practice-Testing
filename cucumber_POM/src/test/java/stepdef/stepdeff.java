package stepdef;
 
import org.openqa.selenium.By;
import org.testng.Assert;
 
import POM_Pages.login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class stepdeff extends Utilities.base_class {
	login_page l;
	

	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		launch_chrome("https://www.saucedemo.com");
	}
	
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		l = new login_page(dr);
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@When("User clicks login button")
	public void user_clicks_login_button() {
		dr.findElement(By.id("login-button")).click();
	}
	
	@Then("User successfully logs in to Products page")
	public void user_successfully_logs_into_products_page() {
		String s = dr.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		Assert.assertEquals(s, "Products");
	}
	
	
}
