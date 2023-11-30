package com.omayo.leftpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayo.base.BasePage;

public class EnabledButtonPage extends BasePage {

	@FindBy(id = "but2")
	private WebElement enabledButton;
	
	@FindBy(id = "but1")
	private WebElement disabledButton;
	

	public void  enabledButton() throws InterruptedException {
		Thread.sleep(3000);
		action.isEnabled(enabledButton);
		action.isEnabled(disabledButton);
		Thread.sleep(4000);

	}
	public void disabledButton() throws InterruptedException {
		Thread.sleep(3000);
		action.findElement(disabledButton);
		Thread.sleep(4000);
	}

}

