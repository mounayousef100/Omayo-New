package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayo.base.BasePage;

public class RadioOptionsPage extends BasePage {
	
	@FindBy(id ="radio1")
	private WebElement male ;

	@FindBy(id ="radio2")
	private WebElement female ;
	
	public void radioOptions() {
	action.click(male);	
	softAssert.assertTrue(action.isSelected(male));	
    softAssert.assertAll();
    
    
    softAssert.assertFalse(action.isSelected(female));	
    softAssert.assertAll();
    
		
		
	}
}
