package junit_pkg;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


	@RunWith(Suite.class)
	@SuiteClasses({
		
		junit_pkg.TestAdd.class,
		junit_pkg.testSub.class
		
	})
	
	public class test_suite {
			

}
