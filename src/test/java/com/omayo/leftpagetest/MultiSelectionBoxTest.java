package com.omayo.leftpagetest;
import java.time.Duration;

import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.MultiSelectionBoxPage;


public class MultiSelectionBoxTest extends BaseTest {
	private MultiSelectionBoxPage multiSelectionBoxPage;

	@Test()
	public void multiSelectionBoxTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		multiSelectionBoxPage = new MultiSelectionBoxPage();
		multiSelectionBoxPage.multiSelectionBox();
}
}
