package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayo.base.BasePage;

public class AlertDemoPage extends BasePage{
	@FindBy(id ="alert1")
	private WebElement buttonAlertDemo;
	
	public void alertDemoPage() {
		
		action.click(buttonAlertDemo);
		action.AlertAccept(driver);
		
	}

}
