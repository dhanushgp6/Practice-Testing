package testeng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class eng {

	
	
	@BeforeClass
	public void bc() {
		System.out.println(" bc ");
		
	}
	@AfterClass
	public void ac() {
		System.out.println(" ac ");
		
	}
	@BeforeMethod
	public void bm() {
		System.out.println(" bm ");
		
	}
	@AfterMethod
	public void am() {
		System.out.println(" am ");
		
	}
	@Test
	public void t1() {
		System.out.println(" t1 ");
		
	}
	@Test
	public void t2() {
		System.out.println(" t2 ");
		
	}
	@Test
	public void t3() {
		System.out.println(" t3 ");
		
	}
	@Test
	public void t4() {
		System.out.println(" t4 ");
		
	}
	
	
	
}
