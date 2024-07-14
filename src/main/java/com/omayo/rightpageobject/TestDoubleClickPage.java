package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayo.base.BasePage;


public class TestDoubleClickPage extends BasePage{
	
	@FindBy(id = "testdoubleclick")
	private WebElement double_click ;
	
	@FindBy(xpath = "//div[@id='myDropdown']/a[1]")
	private WebElement facebook ;

	public void testDoubleClick() {
		
		action.doubleClick(driver,double_click);
		action.click(facebook);
		softAssert.assertEquals(action.getCurrentURL(driver), "https://www.facebook.com/");
		softAssert.assertAll();
	}
}
