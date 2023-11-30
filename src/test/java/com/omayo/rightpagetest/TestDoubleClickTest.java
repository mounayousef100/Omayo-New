package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.TestDoubleClickPage;

public class TestDoubleClickTest extends BaseTest {
	private TestDoubleClickPage testDoubleClickPage;
	@Test()
	public void testDoubleClickTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		testDoubleClickPage = new TestDoubleClickPage();
		testDoubleClickPage.testDoubleClick();
	}
}
