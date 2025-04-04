package actions;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import io.opentelemetry.api.logs.Logger.*;

public class listner1 extends login implements ITestListener {
	
	Logger log=LogManager.getLogger(listner1.class);
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Faild:111 "+result.getName());
		TakesScreenshot ss = ((TakesScreenshot) dr);
		File srcf = ss.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("C:\\Users\\dhanush.gp\\Documents\\ss2.png");
		try {
			FileUtils.copyFile(srcf,  destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Success : "+result.getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		BasicConfigurator.configure();
		log.info("Test name :"=result.getName()+" Started");
		Reporter.log("Test Strated : "+result.getName());
		

		
	}

}
