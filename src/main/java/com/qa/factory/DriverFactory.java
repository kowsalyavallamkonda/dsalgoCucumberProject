package com.qa.factory;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DriverFactory {

		public WebDriver driver;
		public static  Logger logger;

		public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

		/**
		 * This method is used to initialize the thradlocal driver on the basis of given
		 * browser
		 * 
		 * @param browser
		 * @return this will return tldriver.
		 */
		public WebDriver init_driver(String browser) {

			System.out.println("browser value is: " + browser);

			if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
//-----------------------------------------------		
//				System.setProperty("webdriver.chrome.driver","C:\\kousy\\myworkspace\\ds-algo\\drivers\\chromedriver_win32\\chromedriver.exe");
//			    ChromeOptions opt=new ChromeOptions();
//			    opt.setExperimentalOption("debuggerAddress","localhost:3535");
//			    WebDriver driver=new ChromeDriver(opt);
			    
//------------------------------------------			
				tlDriver.set(new ChromeDriver());
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				tlDriver.set(new FirefoxDriver());
			} else if (browser.equals("safari")) {
				tlDriver.set(new SafariDriver());
			} else {
				System.out.println("Please pass the correct browser value: " + browser);
			}
			logger=LogManager.getLogger(this.getClass());
			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();

		}

		/**
		 * this is used to get the driver with ThreadLocal
		 * 
		 * @return
		 */
		public static synchronized WebDriver getDriver() {
			return tlDriver.get();
		}
	}

//
