package stepdef2;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demowebshoplogin extends Utilities.common_methods {
	@Given("Login page is displayed") 
	public void login_page_is_displayed() {
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click(); 
	}
	  
	@When("User enters valid username and password") 
	public void user_enters_valid_username_and_password() {
		dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("zxc420@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("aaaaaa"); 
	}
	
	@When("User clicks login button") 
	public void user_clicks_login_button() {
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click(); 
	}
	

	
	@Then("user is in the Featured Products page")
	public void user_is_in_the_featured_products_page() {
		String s = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[1]/strong")).getText();
		Assert.assertEquals(s, "FEATURED PRODUCTS");
	}
	
	@When("user adds a product to cart")
	public void user_adds_a_product_to_cart() {
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click(); 
	   
	}
	
	@Then("cart contains the same product added to cart")
	public void cart_contains_the_same_product_added_to_cart() {
		String s1=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/h2/a")).getText();
		dr.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[4]/a")).click();	
		String s2=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/a")).getText();
		Assert.assertEquals(s1, s2);
		
	}
	@When("deleteing the product")
	public void delete() {
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).clear();
		

	}
	
	@Then("verify")
	public void verify() {
		String i=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).getDomProperty("value");
		System.out.println(i);
		Assert.assertEquals(0,i);
		
	}
	
	
}
