package stepdefinitions;

import org.junit.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSD {
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}

@Given("User is on SignIn page")
	public void user_is_on_sign_in_page() {
		logMessage("User is on SignIn page");
		lp.getLoginurl();
	}

@When("User Clicks on Register link")
	public void user_clicks_on_register_link() {
		logMessage("User Clicks on Register link");
		lp.register();
	}

@Then("User should be redirected to Register page")
	public void user_should_be_redirected_to_register_page() {
		logMessage("User should be redirected to Register page");
		lp.register_page();
	}

@When("User clicks on login button with all empty field")
	public void user_clicks_on_login_button_with_all_empty_field() {
		logMessage("User clicks on login button with all empty field");
		lp.clickLogin();

	}

@Then("User verify the message at username as {string}")
	public void user_verify_the_message_at_username_as(String string) {
		logMessage("User verify the message at username as" + string);
		String msg = lp.validatePasswordfield(string);
		Assert.assertEquals(msg, string);

	}

@When("User clicks on login button with username as {string} only")
	public void user_clicks_on_login_button_with_username_as_only(String string) {
		logMessage("User clicks on login button with username as" + string);
		lp.enterUsername(string);
		lp.clickLogin();

	}

@Then("User verify the message at password as {string}")
	public void user_verify_the_message_at_password_as(String string) {
		logMessage("User verify the message at password as" );
		String msg = lp.validatePasswordfield(string);
		Assert.assertEquals(msg, string);

	}

@When("User clicks on login button with password as {string} only")
	public void user_clicks_on_login_button_with_password_as_only(String string) {
		logMessage("User verify the message at password as" + string );
		lp.enterPassword(string);
		lp.clickLogin();

	}

	@Then("User verify the message at user as {string}")
	public void user_verify_the_message_at_user_as(String string) {
		logMessage("User verify the message at user as" +string);
		String msg1 = lp.validateUsername(string);
		Assert.assertEquals(msg1, string);
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
		logMessage("User enters username as " + string);
		lp.enterUsername(string);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		logMessage("User enters password as" +string );
		lp.enterPassword(string);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		logMessage("User clicks login button");
		lp.clickLogin();
	}

	@Then("User verify the message as {string}")
	public void user_verify_the_message_as(String string) {
		logMessage("User verify the message as" + string);
		lp.invalidAlertmesg();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		logMessage("User clicks on login button");
		lp.clickLogin();
	}

	@Then("It should navigate to the home page with a message {string}")
	public void it_should_navigate_to_the_home_page_with_a_message(String string) {
		logMessage("It should navigate to the home page with a message" + string);
		lp.successAlert();
	}

	@When("User clicks on signout")
	public void user_clicks_on_signout() {
		logMessage("User clicks on signout");
		lp.logout();
	}

	@Then("Message displayed LoggedOut Successfully")
	public void message_displayed_logged_out_successfully() {
		logMessage("Message displayed LoggedOut Successfully");
		lp.successLogout();
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		logMessage("User enters username as" + string + "and password as" +string2);
		lp.enterUsername(string);
		lp.enterPassword(string2);

	}

}
