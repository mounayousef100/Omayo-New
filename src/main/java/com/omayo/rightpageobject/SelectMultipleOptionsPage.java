package com.omayo.rightpageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayo.base.BasePage;

public class SelectMultipleOptionsPage extends BasePage{
	@FindBy(xpath = "//input[@name='accessories']")
	private List <WebElement> multipleOptions ;
	
	public void selectMultipleOptions() {
		
		for(WebElement ele : multipleOptions) {
			if(ele.isSelected()== false) {
				action.click(ele);
				softAssert.assertTrue(ele.isSelected());
				softAssert.assertAll();
				
			}
			
		}
		
		
	}

}
