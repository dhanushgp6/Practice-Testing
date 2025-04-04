package pkg2;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample {
	
	String browser;
	
	public FactoryExample(String browser) {
		
		this.browser=browser;
		
		
	}
	
	
	@Test
	public void TestMethod() {
		System.out.println("the order "+browser);
	}
	
	@Factory
	public static Object[] FactoryMethod() {
		Object[] brw= {
				new FactoryExample("chrome"),
				new FactoryExample("lala")
				
		};
		
		
		return brw;
		
		
		
	}
	
	

}
