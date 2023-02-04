package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base_Class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//Adactin.feature", glue = "com.adactin.stepdefinition")

public class Adactin_Runner {

	public static WebDriver driver;

	@BeforeClass

	public static void setUp() {

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/karthikgunasekaran/eclipse-workspace/service/driver/chromedriver-2");
		// driver = new ChromeDriver();
		driver = Base_Class.browser_Launch();

	}

	@AfterClass
	public static void Quit() throws Throwable {

		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}

}
