package com.omayo.centerpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BasePage;
import com.omayo.centerpageobject.Iframe1ANDIframe2Page;


public class Iframe1ANDIframe2Test extends BasePage{
	private Iframe1ANDIframe2Page iframe1ANDIframe2Page;

	@Test()
	public void iframe1ANDIframe2Test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		iframe1ANDIframe2Page = new Iframe1ANDIframe2Page(driver);
		// The values "username" and "password" are arguments 
		iframe1ANDIframe2Page.iframe1ANDIframe2();
	}
}
