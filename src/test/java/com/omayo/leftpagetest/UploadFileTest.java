package com.omayo.leftpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.leftpageobject.UploadFilePage;


public class UploadFileTest extends BaseTest{
	private UploadFilePage uploadFilePage ;
	@Test()
	public void uploadFileTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		uploadFilePage  = new UploadFilePage();
		uploadFilePage.uploadFile();
	}
}
