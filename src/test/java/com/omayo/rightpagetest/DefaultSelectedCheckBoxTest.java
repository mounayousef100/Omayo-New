package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.DefaultSelectedCheckBoxPage;

public class DefaultSelectedCheckBoxTest extends BaseTest {
	private DefaultSelectedCheckBoxPage defaultSelectedCheckBoxPage;

	@Test()
	public void defaultSelectedCheckBoxTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		defaultSelectedCheckBoxPage = new DefaultSelectedCheckBoxPage();
		defaultSelectedCheckBoxPage.defaultSelectedCheckBox();
		
	}
}
