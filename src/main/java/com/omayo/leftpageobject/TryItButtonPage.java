package com.omayo.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class TryItButtonPage extends BasePage {

	@FindBy( xpath = "//button[@onclick='setTimeout(myFunctionABC,3000)']")
	private  WebElement tryItButton;
	
	@FindBy(id = "myBtn")
	private  WebElement timerEnableButton;

	public void TryItButton() throws InterruptedException {
		Thread.sleep(3000);
		action.click(tryItButton);
		action.implicitWait(driver, 20);
		action.isEnabled(timerEnableButton);
		Thread.sleep(3000);
	}
	}