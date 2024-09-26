package com.MakeMyTrip.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	@BeforeTest
	public void openBrowser() {
	org.testng.Reporter.log("openBrowser", true);
	}
}
