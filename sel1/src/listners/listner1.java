package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listner1 implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Faild: "+result.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Success : "+result.getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Strated : "+result.getName());

		
	}

}
