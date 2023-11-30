package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.ButtonsWithSameNamePage;

public class ButtonsWithSameNameTest extends BaseTest{
	private ButtonsWithSameNamePage buttonsWithSameNamePage;

	@Test()
	public void buttonsWithSameNameTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		buttonsWithSameNamePage = new ButtonsWithSameNamePage();
		buttonsWithSameNamePage.buttonsWithSameName();
	}

}
