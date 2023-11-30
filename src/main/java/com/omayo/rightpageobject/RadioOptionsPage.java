package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class RadioOptionsPage extends BasePage {
	
	@FindBy(id = "radio1")
	private WebElement  radioOption1;

	@FindBy(id = "radio2")
	private WebElement  radioOption2;
	
	public void selectRadio() throws InterruptedException {
		Thread.sleep(3000);
		action.click(radioOption1);
		softAssert.assertTrue(action.isSelected(radioOption1));
		softAssert.assertAll();
	
		action.click(radioOption2);
		softAssert.assertTrue(action.isSelected(radioOption2));
		softAssert.assertAll();
		
	}
}
