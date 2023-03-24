package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.pages.ArraysPage;
import com.pages.HomePage1;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ArraysSD {

	private ArraysPage arr = new ArraysPage(DriverFactory.getDriver());
	private Logger logger = LogManager.getLogger(this.getClass());
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());

	private void logMessage(String strMsg) {
		logger.info(strMsg);
	}
//RemoteWebDriver driver=null;
@When("The user clicks on Array getstarted button")
	public void the_user_clicks_on_array_getstarted_button() {
	logMessage("The user licks on Array getstarted button");
		arr.clkArraybtn();
	}

@Given("User is on Arrays Page")
	public void user_is_on_arrays_page() {
		// Assert.assertEquals(datstruct, string)
	logMessage("User is on Arrays Page");
//	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
//lp.enterUsername("Kowsalya25");
//	lp.enterPassword("Saibaba25@");
//	lp.clickLogin();
	arr.clkArraybtn();
//arr.clkArraybtn();
	}

@When("User clicks on Arrays")
	public void user_clicks_on_arrays() {
		logMessage("User Clicks on Arrays Getstart button");
		arr.clkArraybtn();
	}

@When("user clicks on Arraysin Python")
	public void user_clicks_on_arraysin_python() {
		logMessage("User Clicks on Arrays in python");
		arr.clkArraysInPython();
	}

@When("user clicks on Arrays Using List")
	public void user_clicks_on_arrays_using_list() {
		logMessage("User Clicks on Arrays using list link");
		arr.clkarraysUsingListLink();
	}

@When("user clicks on Basic Operation in Lists")
	public void user_clicks_on_basic_operation_in_lists() {
		logMessage("User Clicks on Basic Operation in Lists");
		arr.clkbasicOpinListsLink();
	}

@When("user clicks on Applications of arrays")
	public void user_clicks_on_applications_of_arrays() {
		logMessage("User clicks on Applications of arrays");
		arr.clkappOfArrayLink();
	}

//	@When("user clicks on Practice Questions")
//	public void user_clicks_on_practice_questions() throws InterruptedException {
	//	logMessage("User clicks on Practice Questions");
//		arr.clkArraysInPython();
//		//Thread.sleep(2500);
//		arr.clkpracticeQLink();
//		//Thread.sleep(3000);	}

@When("the user clicks on search the array\"")
	public void the_user_clicks_on_search_the_array() {
		logMessage("User clicks on search the array");
		arr.clksearchTheArray();
	}
@When("user clears the code in Texteditor")
	public void user_clears_the_code_in_texteditor() {
		arr.cleartexteditor();
		lp.logout();
		lp.successLogout();
	}
//	@When("the user enter the Python code")
//	public void the_user_enter_the_python_code(io.cucumber.datatable.DataTable dataTable) {
//		arr.cleartexteditor();
//	}

}
