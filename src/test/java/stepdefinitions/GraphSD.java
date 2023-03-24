package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pages.GraphPage;
import com.pages.QueuePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class GraphSD {
	
	private GraphPage gp = new GraphPage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}
		
		
@Given("The user is on Graph Page")
	public void the_user_is_on_graph_page() {
	logMessage("The user is on Graph Page");
	    gp.clkGraph();
	}

@When("The user clicks on Graphlink in graph page")
	public void the_user_clicks_on_graphlink_in_graph_page() {
	logMessage("The user clicks on Graphlink in graph page");
	   gp.clkGraphLink();
	}

@When("The user clicks on Graph Representations in graph page")
	public void the_user_clicks_on_graph_representations_in_graph_page() {
	logMessage("The user clicks on Graph Representations in graph page");
	    gp.clkGraphrepresentation();
	}


}
