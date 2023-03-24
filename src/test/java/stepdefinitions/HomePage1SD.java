package stepdefinitions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.pages.HomePage1;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage1SD {
	private HomePage1 homePage = new HomePage1(DriverFactory.getDriver());
	private static String title;
	
    private  Logger logger= LogManager.getLogger(this.getClass());
	
	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}
@Given("The user opens homepage")
	public void the_user_opens_homepage() {
		logMessage("The user opens homepage");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");

	}

@When("The user gets title of the page")
	public void the_user_gets_title_of_the_page() {
		logMessage("The user gets title of the page");
		title = DriverFactory.getDriver().getTitle();
	}

@Then("The user should land in DS Algo portal page {string}")
	public void the_user_should_land_in_ds_algo_portal_page(String string) {
		logMessage("The user should land in DS Algo portal page");
		title = DriverFactory.getDriver().getTitle();
		Assert.assertEquals(title, string);
	}

@When("The user clicks GetStarted button under DatStrucures")
	public void the_user_clicks_get_started_button_under_dat_strucures() {
		logMessage("The user clicks GetStarted button under DatStrucures");
		homePage.clkDatastructure();

	}

@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
		logMessage("It should alert the user with a message" + string );
		String msg = homePage.alertMsg();
		Assert.assertEquals(msg, string);

	}

@When("The user clicks GetStarted button under Array")
	public void the_user_clicks_get_started_button_under_array() {
		logMessage("The user clicks GetStarted button under Array");
		homePage.clkArray();

	}

@When("The user clicks GetStarted button under LinkedList")
	public void the_user_clicks_get_started_button_under_linked_list() {
		logMessage("The user clicks GetStarted button under LinkedList");  
		homePage.clkLinkedlist();
	}

@When("The user clicks GetStarted button under Stack")
	public void the_user_clicks_get_started_button_under_stack() {
		logMessage("The user clicks GetStarted button under Stack");
		homePage.clkStack();
	}

@When("The user clicks GetStarted button under Queue")
	public void the_user_clicks_get_started_button_under_queue() {
		logMessage("The user clicks GetStarted button under Queue"); 
		homePage.clkQueue();
	}

@When("The user clicks GetStarted button under Tree")
	public void the_user_clicks_get_started_button_under_tree() {
		logMessage("The user clicks GetStarted button under Tree");
		homePage.clkTree();

	}

	@When("The user clicks GetStarted button under Graph")
	public void the_user_clicks_get_started_button_under_graph() {
		logMessage("The user clicks GetStarted button under Graph");
		homePage.clkGraph();

	}

	@When("The user clicks on Register button")
	public void the_user_clicks_on_register_button() {
		logMessage("The user clicks on Register button");
		homePage.clkRegister();
	}

	@Then("It should navigate to register form with title {string}")
	public void it_should_navigate_to_register_form_with_title(String string) {
		logMessage("It should navigate to register form with title" + string);
		String registertitle = homePage.getRegisterlink();
		Assert.assertEquals(registertitle, string);
	}

	@When("The user clicks on SignIn button")
	public void the_user_clicks_on_sign_in_button() throws InterruptedException {
		logMessage("The user clicks on SignIn button");
		homePage.clkSignin();
		Thread.sleep(2000);
	}

	@Then("It should navigate to SignIn page  with title {string}")
	public void it_should_navigate_to_sign_in_page_with_title(String string) {
		logMessage("It should navigate to SignIn page  with title" +  string  );
		String signtitle = homePage.getSigninlink();
		System.out.println(signtitle);
		Assert.assertEquals(signtitle, string);
	}

	@When("The user clicks on Datastructure Dropdown")
	public void the_user_clicks_on_datastructure_dropdown() {
		logMessage("The user clicks on Datastructure Dropdown");
		homePage.clkDropdownDataStructures();
	}

	@When("The user clicks on Arrays Dropdown")
	public void the_user_clicks_on_arrays_dropdown() {
		logMessage("The user clicks on Arrays Dropdown");
		homePage.clkdropDownArrays();
	}

	@When("The user clicks on  LinkedList Dropdown")
	public void the_user_clicks_on_linked_list_dropdown() {
		logMessage("The user clicks on  LinkedList Dropdown");
		homePage.clkDropdownLinkedList();

	}

	@When("The user clicks on Stack Dropdown")
	public void the_user_clicks_on_stack_dropdown() {
		logMessage("The user clicks on Stack Dropdown");
		homePage.clkDropdownStack();

	}

	@When("The user clicks on Queue Dropdown")
	public void the_user_clicks_on_queue_dropdown() {
		logMessage("The user clicks on Queue Dropdown");
		homePage.clkDropdownQueue();

	}

	@When("The user clicks on Tree Dropdown")
	public void the_user_clicks_on_tree_dropdown() {
		logMessage("The user clicks on Tree Dropdown");
		homePage.clkDropdownTree();
	}

	@When("The user clicks on Graph Dropdown")
	public void the_user_clicks_on_graph_dropdown() {
		logMessage("The user clicks on Graph Dropdown");
		homePage.clkDropdownGraph();

	}
}
