package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pages.StackPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StackSD {

	private StackPage sp = new StackPage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}
@When("The user clicks on Stack getstarted button")
	public void the_user_clicks_on_stack_getstarted_button() {
		logMessage("The user clicks on Stack getstarted button");
	           sp.clkstackbtn();
	}

@Given("User is on Stack Page")
	public void user_is_on_stack_page() {
		logMessage("User is on Stack Page");
	    sp.clkstackbtn();
	}

@When("User clicks on Operations in Stack")
	public void user_clicks_on_operations_in_stack() {
		logMessage("User clicks on Operations in Stack");
	   sp.clkoperations();
	}



@When("The  user clicks on Implementation")
	public void the_user_clicks_on_implementation() {
		logMessage("The  user clicks on Implementation");
	    sp.clkimplementation();
	}

@When("User clicks on Applications")
	public void user_clicks_on_applications() {
		logMessage("User clicks on Applications");
	  sp.clkstackapplication();
	}

	    
	}

	
	
	
	

