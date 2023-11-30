package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class SameIdandNamePage extends BasePage{

	@FindBy(name = "sa")
	private WebElement sameIdNameButton;

	public void sameIdandName () throws InterruptedException {
		Thread.sleep(3000);
	    action.click(sameIdNameButton);
		Thread.sleep(3000);

	}
}
