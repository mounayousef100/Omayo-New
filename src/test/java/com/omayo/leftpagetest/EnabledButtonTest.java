package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.EnabledButtonPage;


public class EnabledButtonTest extends BaseTest {
	private EnabledButtonPage enabledButtonPage;

	@Test()
	public void enabledButtonPage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		enabledButtonPage = new EnabledButtonPage();
		enabledButtonPage.enabledButton();
		enabledButtonPage.disabledButton();
		
	}
}
