package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pages.QueuePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QueueSD {
	
	private QueuePage qp = new QueuePage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}
	
	
	
@Given("The user is on Queue Page")
	public void the_user_is_on_queue_Page() {
	logMessage("The user is on Queue Page");
	
	    qp.clkQueue();
	}

@When("The user clicks on Implementation of Queue in Python")
	public void the_user_clicks_on_implementation_of_queue_in_python() {
	logMessage("The user clicks on Implementation of Queue in Python");
	qp.clkimplist();
	}

	

@When("The user clicks on Implementation using collections deque")
public void the_user_clicks_on_implementation_using_collections_deque() {
	logMessage("The user clicks on Implementation using collections deque");    
	qp.clkimpcollect();
	}

	

@When("The user clicks on Implementation using array")
	public void the_user_clicks_on_implementation_using_array() {
	logMessage("The user clicks on Implementation using array");  
	qp.clkimparray();
	}

	
@When("The user clicks on Queue Operations")
	public void the_user_clicks_on_queue_operations() {
	logMessage("The user clicks on Queue Operations");   
	qp.clkQueOp();
	}
	

}
