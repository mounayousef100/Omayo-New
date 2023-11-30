package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.SearchThisBlogPage;

public class SearchThisBlogTest extends BaseTest {
	
	private SearchThisBlogPage searchThisBlogPage;

	@Test()
	public void searchThisBlogTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		searchThisBlogPage = new SearchThisBlogPage();
		searchThisBlogPage.searchThisBlog();
	}
}
