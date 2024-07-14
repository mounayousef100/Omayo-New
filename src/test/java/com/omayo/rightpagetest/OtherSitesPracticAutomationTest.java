package com.omayo.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.OtherSitesPracticAutomationPage;

public class OtherSitesPracticAutomationTest extends BaseTest{
	private OtherSitesPracticAutomationPage otherSitesPracticAutomationPage;
	
	@Test()
	public void otherSitesPracticAutomationTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		otherSitesPracticAutomationPage = new OtherSitesPracticAutomationPage();
		otherSitesPracticAutomationPage.OtherSitesPage();
		
		
	}

}
