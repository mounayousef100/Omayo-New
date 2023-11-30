package com.omayo.centerpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.centerpageobject.TextAreFieldPage;


public class TextAreFieldTest extends BaseTest {
	private TextAreFieldPage textAreFieldPage;

	@Test()
	public void textAreFieldTes() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		textAreFieldPage = new TextAreFieldPage();
		textAreFieldPage.textAreField();
		
	}
}
