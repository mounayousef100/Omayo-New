package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.OrderedListPage;


public class OrderedListTest extends BaseTest {
	private OrderedListPage orderedListPage ;

	@Test()
	public void orderedListTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		orderedListPage  = new OrderedListPage ();
		orderedListPage .orderedList();
	}
}
