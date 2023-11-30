package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.DisplayedAfter10SecondsPage;


public class DisplayedAfter10SecondsTest extends BaseTest{
	private DisplayedAfter10SecondsPage ObjDisplayedAfter10SecondsPage;


	@Test()
	public void displayedAfter10SecondsTest() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ObjDisplayedAfter10SecondsPage = new DisplayedAfter10SecondsPage();
		ObjDisplayedAfter10SecondsPage.displayedAfter10Seconds();
	}
}
