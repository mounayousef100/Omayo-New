package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.OtherSitestoPracticeAutomationPage;


public class OtherSitestoPracticeAutomationTest extends BaseTest{
	private OtherSitestoPracticeAutomationPage otherSitestoPracticeAutomationPage;

	@Test()
	public void otherSitestoPracticeAutomationTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		otherSitestoPracticeAutomationPage = new OtherSitestoPracticeAutomationPage();
		otherSitestoPracticeAutomationPage.hiddenButton();
		
	}
}
