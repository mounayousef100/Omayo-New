package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.HiddenButtonPage;



public class HiddenButtonTest extends BaseTest {
	private HiddenButtonPage hiddenButtonPage;
	@Test(groups = "smoke")
	public void hiddenButtonTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hiddenButtonPage = new HiddenButtonPage();
		hiddenButtonPage.hiddenButton();
		
	}
}
