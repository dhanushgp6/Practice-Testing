package stepdef;

import Utilities.ScenarioContext;
import Utilities.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	static TestContext tContext=new TestContext();
	
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_valid_username_and_password1(String uid,String pwd) {
		
		System.out.println("User enters valid username and password");
		tContext.set(ScenarioContext.USERNAME.toString(),uid);
		tContext.set(ScenarioContext.SESSION_TOKEN.toString(),"asd789");
	}

	@Then(value = "User session should be avaible")
	public void verify_user_session(){
		String storeuid=(String) tContext.get(ScenarioContext.USERNAME.toString());
		String sessionToken=(String) tContext.get(ScenarioContext.SESSION_TOKEN.toString());
		System.out.println("storedid;"+storeuid+"\n sessionToken :"+sessionToken);
	}
	
}
