package com.omayo.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class UploadFilePage extends BasePage {

	@FindBy( id = "uploadfile")
	private  WebElement uploadfile;

	public void uploadFile() throws InterruptedException {
		Thread.sleep(3000);
		String projectPath = System.getProperty("user.dir");
		action.sendText(uploadfile,projectPath+ "\\25.jpg");
        
		Thread.sleep(4000);
}
}
