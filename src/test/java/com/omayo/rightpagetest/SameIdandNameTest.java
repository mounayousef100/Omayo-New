package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.SameIdandNamePage;


public class SameIdandNameTest extends BaseTest{
	private SameIdandNamePage sameIdandNamePage;

	@Test()
	public void sameIdandNameTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sameIdandNamePage = new SameIdandNamePage();
		sameIdandNamePage.sameIdandName();;
		
	}
}
