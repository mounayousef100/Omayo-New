package com.omayo.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class DisplayedAfter10SecondsPage extends BasePage{

	@FindBy(id = "delayedText")
	private WebElement delayedText;

	@FindBy(xpath = "//button[@onclick='setTimeout(myFunctionAXD,10000)']")
	private WebElement checkButton;

	@FindBy(xpath = "//input[@id='dte']")
	private WebElement myOption;


	public void displayedAfter10Seconds() throws Throwable {
		  action.JSClick(driver, checkButton);
		  Thread.sleep(11000);
		  action.JSClick(driver,myOption);
		 String text =  action.getText(delayedText);
		 System.out.println(text);
		  Thread.sleep(5000);
	}
}
