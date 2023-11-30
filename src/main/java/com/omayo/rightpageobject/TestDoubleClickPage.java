package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;


public class TestDoubleClickPage extends BasePage{

	@FindBy(id = "testdoubleclick")
	private WebElement doubleClick;
	
	@FindBy(xpath = "//div[@id='myDropdown']/a[1]")
	private WebElement faceB;

	public void testDoubleClick() throws InterruptedException {
		Thread.sleep(3000);
	    action.doubleClick(driver, doubleClick);
	    Thread.sleep(3000);
	    action.click(faceB);
		Thread.sleep(4000);

	}
}
