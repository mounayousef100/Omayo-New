package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.SelectMultipleOptionsPage;


public class SelectMultipleOptionsTest extends BaseTest {
	private SelectMultipleOptionsPage selectMultipleOptionsPage;

	@Test()
	public void selectMultipleOptionsTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		selectMultipleOptionsPage = new SelectMultipleOptionsPage();
		selectMultipleOptionsPage.selectMultipleOptions();
		
	}

}
