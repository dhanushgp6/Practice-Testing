package com.selnium.mvn_prj2;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class p1 {
 
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
	}
 
}
 
 