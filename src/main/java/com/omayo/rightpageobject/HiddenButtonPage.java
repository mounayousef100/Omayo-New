package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class HiddenButtonPage extends BasePage {
	
	@FindBy(id = "hbutton")
	private WebElement  hiddenButton ;
	
	public void hiddenButtonPage() {
	softAssert.assertFalse(action.findElement(hiddenButton));
	softAssert.assertAll();
		
	}

}
