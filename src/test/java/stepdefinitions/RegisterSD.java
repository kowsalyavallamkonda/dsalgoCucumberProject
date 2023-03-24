package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.pages.HomePage1;
import com.pages.RegisterPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSD {
	private RegisterPage registerPage = new RegisterPage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}

@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		logMessage("The user opens Register Page");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
	}

@When("User click Register with all empty field")
	public void user_click_register_with_all_empty_field() {
		logMessage("User click Register with all empty field");
		registerPage.clickregister();
	}

@Then("User verify the message at username on Register Page as {string}")
	public void user_verify_the_message_at_username_on_register_page_as(String string) {
		logMessage("User verify the message at username on Register Page as " + string);
		String mesg = registerPage.usernamedisplayMsg();
		Assert.assertEquals(mesg, string);

	}

	@When("User click Register with username as {string} only")
	public void user_click_register_with_username_as_only(String string) {
		logMessage("User click Register with username as " + string);
		registerPage.enterusername(string);
	}

	@Then("User verify the message at password on Register Page as {string}")
	public void user_verify_the_message_at_password_on_register_page_as(String string) {
		logMessage("User verify the message at password on Register Page" + string);
		String mesg1 = registerPage.passworddisplayMsg();

		Assert.assertEquals(mesg1, string);
	}

	@When("User click Register with username as {string} and password as {string} only")
	public void user_click_register_with_username_as_and_password_as_only(String string, String string2) {
		logMessage("User click Register with username as" + string + "and password as" + string2);
		registerPage.enterusername(string);
		registerPage.enterpassword(string2);
	}

	@Then("User verify the message at confirmpassword on Register Page as {string}")
	public void user_verify_the_message_at_confirmpassword_on_register_page_as(String string) {
		logMessage("User verify the message at confirmpassword on Register Page as" + string);
		String mesg2 = registerPage.confirmpassworddisplayMsg();
		Assert.assertEquals(mesg2, string);

	}

	@When("User enter {string} ,{string} and {string}")
	public void user_enter_and(String string, String string2, String string3) {
		registerPage.enterusername(string);
		registerPage.enterpassword(string2);
		registerPage.enterConfirmpassword(string3);

	}

	@Then("User click Register and verify the {string}")
	public void user_click_register_and_verify_the(String string) {
		logMessage("User click Register and verify the" + string);
		registerPage.clickregister();
		String errmsg = registerPage.displayErrormsg();
		Assert.assertEquals(errmsg, string);

	}

	@When("user enter the sheetname {string} and row number {int}")
	public void user_enter_the_sheetname_and_row_number(String string, Integer int1) {

	}

	@Then("user click on Register button and verify message as {string}")
	public void user_click_on_register_button_and_verify_message_as(String string) {

	}
}