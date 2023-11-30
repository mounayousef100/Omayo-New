package com.omayo.centerpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BasePage;
import com.omayo.centerpageobject.TextAreaFieldTwoPage;

public class TextAreaFieldTwoTest extends BasePage {
	private TextAreaFieldTwoPage textAreaFieldTwoPage;

	@Test(groups = "smoke")
	public void textAreaFieldTwoTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		textAreaFieldTwoPage = new TextAreaFieldTwoPage(driver);
		textAreaFieldTwoPage.textAreFieldTwo();
		
	}
}
