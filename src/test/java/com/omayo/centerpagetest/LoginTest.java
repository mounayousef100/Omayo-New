package com.omayo.centerpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.centerpageobject.LoginPage;

public class LoginTest extends BaseTest {
	private LoginPage loginPage;

	@Test(groups = "smoke")
	public void loginTest() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

}
