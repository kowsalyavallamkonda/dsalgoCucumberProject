package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.pages.LinkedListPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSD {

	private LinkedListPage linklist = new LinkedListPage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}

@When("The user clicks on LinkedList getstarted button")
	public void the_user_clicks_on_linked_list_getstarted_button_and_selecting_linked_list_from_dropdownlist() {
		logMessage("The user clicks on LinkedList getstarted button");
		linklist.clkLinkedlistbtn();
	}

@When("The user clicks on Introduction")
	public void the_user_clicks_on_introduction() {
		logMessage("The user clicks on Introduction");
		linklist.clkintroduction();
	}

@Given("The user is on LinkedList page")
	public void the_user_is_on_linked_list_page() {
		logMessage("The user is on LinkedList page");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		linklist.clkLinkedlistbtn();

	}

@When("The user clicks on Creating Linked List")
	public void the_user_clicks_on_creating_linked_list() {
		logMessage("The user clicks on Creating Linked List");
		linklist.clkcreatinglinledlist();
	}

@When("The user clicks on Types of Linked List")
	public void the_user_clicks_on_types_of_linked_list() {
		logMessage("The user clicks on Types of Linked List");
		linklist.clktypeslinkedlist();
	}

@When("The user clicks on Implement Linked List in Python")
	public void the_user_clicks_on_implement_linked_list_in_python() {
		logMessage("The user clicks on Implement Linked List in Python");
		linklist.clkimplementlinkedlist();
	}

@When("The user clicks on Traversal")
	public void the_user_clicks_on_traversal() {
		logMessage("The user clicks on Traversal");
		linklist.clktraversal();
	}

@When("The user clicks on Insertion")
	public void the_user_clicks_on_insertion() {
		logMessage("The user clicks on Insertion");
		linklist.clkinsertion();
	}

@When("The user clicks on Insertion Deletion")
	public void the_user_clicks_on_insertion_deletion() {
		logMessage("The user clicks on Insertion Deletion");
		linklist.clkdeletion();
	}

@Then("The user redirected to Linkedlist page with title {string}")
	public void the_user_redirected_to_linkedlist_page_with_title(String string) {
		logMessage("The user redirected to Linkedlist page with title" + string);
		String title = linklist.gettitle();
		Assert.assertEquals(title, string);

	}

}
