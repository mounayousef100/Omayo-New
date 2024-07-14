package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class ImageElementPage extends BasePage{
	@FindBy(xpath = "//div[@class='widget-content']/img")
	private WebElement imageElement ;
	
	public void imageElementPage() {
		
		softAssert.assertTrue(action.findElement(imageElement)); 
		softAssert.assertAll();
	}

}
