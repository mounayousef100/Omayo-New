package com.omayo.centerpagetest;

import java.time.Duration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.centerpageobject.LoginPage;

public class LoginTest extends BaseTest {
	private LoginPage loginPage;

	@Test(groups = "smoke")
	@Parameters({"userName", "pass"})
	public void loginTest(String userName,String pass) throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginPage = new LoginPage();
		loginPage.login(userName, pass);

	}

}
