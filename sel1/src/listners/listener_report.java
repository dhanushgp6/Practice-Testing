package listners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listner1.class)
public class listener_report {
	
	@Test
	public void test1() {
		Reporter.log("method1");
		Assert.assertTrue(true);
		
	}
	@Test
	public void test2() {
		Reporter.log("method2");
		Assert.assertTrue(false);
		
	}
	
	

}
