package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.LocateUsingClassPage;


public class LocateUsingClassTest extends BaseTest {
	private  LocateUsingClassPage  locateUsingClassPage;

	@Test()
	public void  locateUsingClassTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		locateUsingClassPage = new  LocateUsingClassPage();
	    locateUsingClassPage.locateUsingClass();
		
	}
}
