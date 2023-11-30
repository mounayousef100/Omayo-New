package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.ReadonlyTextBoxPage;

public class ReadonlyTextBoxTest extends BaseTest {
	private ReadonlyTextBoxPage readonlyTextBoxPage;
	@Test()
	public void readonlyTextBoxTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		readonlyTextBoxPage = new ReadonlyTextBoxPage();
		readonlyTextBoxPage.readonlyTextBox();
		
	}
}
