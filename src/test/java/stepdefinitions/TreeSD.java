package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pages.TreePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TreeSD {
	private TreePage tr = new TreePage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}

@Given("User is on Tree Page")
	public void user_is_on_tree_page() {
	logMessage("User is on Tree Page");   
	    tr.clkTreebtn();
	}

@When("user clicks on Overview of Trees")
	public void user_clicks_on_overview_of_trees() {
		logMessage("user clicks on Overview of Trees");
	    tr.clkOverOfTree();
	    
	}

@When("user clicks on Types of Trees")
	
	public void user_clicks_on_types_of_trees() {
		logMessage("user clicks on Types of Trees");
	    tr.clkTypOfTree();
	}

@When("user clicks on Tree Traversals")
	public void user_clicks_on_tree_traversals() {
		logMessage("user clicks on Tree Traversals");
	    tr.clktreetravers();
	}

@When("user clicks on Traversals-Illustration")
	public void user_clicks_on_traversals_illustration() {
		logMessage("user clicks on Traversals-Illustration");
	    tr.clkTraveIllustrate();
	}

	@When("user clicks on Binary Trees")
	public void user_clicks_on_binary_trees() {
		logMessage("user clicks on Binary Trees");
		tr.clkBinTree();
	    
	}

	@When("user clicks on Types of Binary Trees")
	public void user_clicks_on_types_of_binary_trees() {
		logMessage("user clicks on Types of Binary Trees");
	    tr.clkTypOfBinary();
	}

	@When("user clicks on Implementation in Python")
	public void user_clicks_on_implementation_in_python() {
		logMessage("user clicks on Implementation in Python");
		tr.clkImpPython();
	    
	}

	@When("user clicks on Binary Tree Traversals")
	public void user_clicks_on_binary_tree_traversals() {
		logMessage("user clicks on Binary Tree Traversals");
		tr.clkBtTraverse();
	    
	}

	@When("user clicks on Implementation of Binary Trees")
	public void user_clicks_on_implementation_of_binary_trees() {
		logMessage("user clicks on Implementation of Binary Trees");
		tr.clkImpBt();
	    
	}

	@When("user clicks on Applications of Binary trees")
	public void user_clicks_on_applications_of_binary_trees() {
		logMessage("user clicks on Applications of Binary trees");
	    tr.clkAppsofBt();
	    
	}

	@When("user clicks on Binary Search Trees")
	public void user_clicks_on_binary_search_trees() {
		logMessage("user clicks on Binary Search Trees");
	    tr.clkBinsearchTree();
	    
	}

	@When("user clicks on Implementation Of BST")
	public void user_clicks_on_implementation_of_bst() {
	    logMessage("user clicks on Implementation Of BST");
	    tr.clkimpBST();
	}

	@When("The user clicks on Tree getstarted button")
	public void the_user_clicks_on_tree_getstarted_button() 
	{
		logMessage("The user clicks on Tree getstarted button");
		tr.clkTreebtn();
	}
}
