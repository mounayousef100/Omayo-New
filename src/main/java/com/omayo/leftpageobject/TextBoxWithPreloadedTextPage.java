package com.omayo.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class TextBoxWithPreloadedTextPage extends BasePage{

	@FindBy(name = "fname")
	private WebElement TextBox;


	public void TextBoxWithPreloaded() throws InterruptedException {
		Thread.sleep(3000);
		action.sendText(TextBox, "QA");
		Thread.sleep(4000);
	}
}
