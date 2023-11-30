package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.PopupWindowPage;

public class PopupWindowTest extends BaseTest {
	private PopupWindowPage popupWindowPage ;

	@Test()
	public void popupWindowTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		popupWindowPage  = new PopupWindowPage();
		popupWindowPage.popupWindow();
	}
}
