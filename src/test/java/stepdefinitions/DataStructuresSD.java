package stepdefinitions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.pages.DatastructuresPage;
import com.pages.HomePage1;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataStructuresSD {
	private DatastructuresPage ds = new DatastructuresPage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());

private void logMessage(String strMsg) {
		logger.info(strMsg);
	}

@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {

		String tit = ds.pageTitle();
		Assert.assertEquals(tit, "NumpyNinja");
	}

@Given("The user is on Home page after logged in")
	public void the_user_is_on_home_page_after_logged_in() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		String tit = ds.pageTitle();
		Assert.assertEquals(tit, "NumpyNinja");

	}

@When("The user clicks on datastructure getstarted button")
	public void the_user_clicks_on_datastructure_getstarted_button() {
		logMessage("The user clicks on datastructure getstarted button");
		ds.dataStructgetsStart();

	}

@Then("The user redirected to page with title {string}")
	public void the_user_redirected_to_page_with_title(String string) {
		logMessage("The user redirected to page with title" + string);
		String datstruct = ds.pageTitle();
		Assert.assertEquals(datstruct, string);

	}

	@When("User clicks on Time Complexity")
	public void user_clicks_on_time_complexity() {
		logMessage("The User clicks on Time Complexity");
		ds.clckOnTimeComplexity();

	}

	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String string) throws InterruptedException {
		logMessage("It should navigate to corresponding page with title" + string);
		String tryedit = ds.pageTitle();
		Assert.assertEquals(tryedit, string);

	}

	@When("user click on Try here button")
	public void user_click_on_try_here_button() {
		logMessage("user click on Try here button");
		ds.clkTrybtn();

	}

	@When("user enter the Python code")
	public void user_enter_the_python_code(DataTable pythonCode) throws InterruptedException {
		logMessage("user enter the Python code");
		List<List<String>> data = pythonCode.cells();
		ds.enterCode(data.get(0).get(0));
		Thread.sleep(400);

	}

	@When("click on run button")
	public void click_on_run_button() {
		logMessage("click on run button");
		ds.clkrunbutton();

	}

	@Then("The output has to be displayed")
	public void the_output_has_to_be_displayed() {
		logMessage("The output has to be displayed");
		ds.displayoutput();

	}

	@When("user enters the wrong Python code")
	public void user_enters_the_wrong_python_code() throws InterruptedException {
		logMessage("user enters the wrong Python code");
		ds.enterwrongcode();
		Thread.sleep(300);

	}

	@Then("The alert message has to be displayed")
	public void the_alert_message_has_to_be_displayed() throws InterruptedException {
		logMessage("The alert message has to be displayed");
		String msg = ds.alertboxmsg();
		Thread.sleep(300);
		System.out.println(msg);
	}
}
