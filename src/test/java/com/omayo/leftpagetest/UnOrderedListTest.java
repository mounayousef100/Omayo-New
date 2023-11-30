package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.UnOrderedListPage;


public class UnOrderedListTest extends BaseTest {
	private UnOrderedListPage unOrderedListPage ;
	@Test()
	public void unOrderedListTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		unOrderedListPage  = new UnOrderedListPage ();
		unOrderedListPage.unOrderedList();
	}
}
