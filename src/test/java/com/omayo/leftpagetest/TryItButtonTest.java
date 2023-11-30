package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.TryItButtonPage;



public class TryItButtonTest extends BaseTest{
	private TryItButtonPage tryItButtonPage;

	@Test()
	public void tryItButtonTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		tryItButtonPage = new TryItButtonPage();
		tryItButtonPage.TryItButton();
	}
}
