package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class DefaultSelectedCheckBoxPage extends BasePage{

	@FindBy(id = "checkbox1")
	private WebElement checkbox1;

	@FindBy(id = "checkbox2")
	private WebElement checkbox2;
	
	public void defaultSelectedCheckBox() throws InterruptedException {
		Thread.sleep(3000);
		Boolean selectedcheckbox1 =  action.isSelected(checkbox1);
	    if (selectedcheckbox1.equals(true)) {
	    	action.click( checkbox1);
	    	action.click( checkbox2);
	    }
		Thread.sleep(4000);
		softAssert.assertTrue(checkbox2.isSelected());
		softAssert.assertAll();
	}
	
}
