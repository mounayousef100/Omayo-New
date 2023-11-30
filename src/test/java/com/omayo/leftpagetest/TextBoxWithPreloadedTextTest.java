package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.TextBoxWithPreloadedTextPage;


public class TextBoxWithPreloadedTextTest extends BaseTest {
	private TextBoxWithPreloadedTextPage textBoxWithPreloadedTextPage;
	@Test()
	public void textBoxWithPreloadedTextTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		textBoxWithPreloadedTextPage = new TextBoxWithPreloadedTextPage();
		textBoxWithPreloadedTextPage.TextBoxWithPreloaded();
	}
}
