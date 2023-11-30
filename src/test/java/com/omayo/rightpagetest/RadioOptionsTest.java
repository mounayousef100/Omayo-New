package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.RadioOptionsPage;


public class RadioOptionsTest extends BaseTest{
	private RadioOptionsPage radioOptionsPage;

	@Test()
	public void radioOptionsTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		radioOptionsPage = new RadioOptionsPage();
		radioOptionsPage.selectRadio();
		
	}
}
