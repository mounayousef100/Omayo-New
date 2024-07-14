package com.omayo.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.ImageElementPage;

public class ImageElementTest extends BaseTest{
	private ImageElementPage imageElementPage ;
	@Test()
	private void imageElementTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		imageElementPage = new ImageElementPage();
		imageElementPage.imageElementPage();
		
	}

}
