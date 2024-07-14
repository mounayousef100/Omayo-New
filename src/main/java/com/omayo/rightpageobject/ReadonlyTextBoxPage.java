package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayo.base.BasePage;

public class ReadOnlyTextBoxPage extends BasePage{
	
	@FindBy(id= "rotb")
	private WebElement readOnlyTextBox ;
	
	public void readOnlyTextBoxPage() {
		
		softAssert.assertFalse(action.sendText(readOnlyTextBox, "muna"));   
		softAssert.assertAll();
		
	}

}
