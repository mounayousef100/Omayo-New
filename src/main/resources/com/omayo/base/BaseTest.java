package com.omayo.base;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage {
	protected WebDriver driver;
	protected Logger log;
	

	@BeforeTest
	public void setUP() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log = LogManager.getLogger(BaseTest.class.getName());
		log.info("Navigated to application URL");
	}

	@AfterTest
	public void clouser() {
		if (driver != null) {
			//driver.quit();
			log.info("Browser get closed");
		}
	}
}
