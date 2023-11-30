package com.omayo.rightpagetest;
import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.AlertDemoPage;

public class AlertDemoTest extends BaseTest{
	private AlertDemoPage alertDemoPage;

	@Test()
	public void alertDemoTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		alertDemoPage = new AlertDemoPage();
		alertDemoPage.clickToGetAlert();
	
		
	}
}
