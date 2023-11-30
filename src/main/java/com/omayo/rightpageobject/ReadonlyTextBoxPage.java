package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class ReadonlyTextBoxPage extends BasePage{
	
	@FindBy(id = "rotb")
	private WebElement readonlyTextBox;

	public void  readonlyTextBox() throws InterruptedException {
		Thread.sleep(3000);
		softAssert.assertFalse(action.sendText(readonlyTextBox, "hi"));
		softAssert.assertAll();
		Thread.sleep(3000);
	}
}
