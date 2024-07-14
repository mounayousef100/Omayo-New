package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class SameIdAndNameAttributePage extends BasePage{
	
	@FindBy(name = "sa")
	private WebElement sameIdAndName ;
	
	public void sameIdAndNameAttributePage() {
		
		action.click(sameIdAndName);
		
	}
    
}
