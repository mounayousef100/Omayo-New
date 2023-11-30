package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.OpensNewWindowPage;

public class OpensNewWindowTest extends BaseTest {
	private OpensNewWindowPage opensNewWindowPage;

	@Test(groups = "smoke")
	public void opensNewWindowTest() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		opensNewWindowPage = new OpensNewWindowPage();
		opensNewWindowPage.opensNewWindow();
		Thread.sleep(4000);
	}
}
