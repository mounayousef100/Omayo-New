package com.omayo.rightpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class LocateUsingNameAttributePage2 extends BasePage {

	@FindBy(name = "textboxn")
	private WebElement LocateUsingName;

	@FindBy(xpath = "//div[@id='HTML20']/div/input")
	private WebElement errorMeessage;

	public void locateUsingNameAttribute(String text) throws InterruptedException {
		action.sendText(LocateUsingName, text);
		softAssert.assertFalse(errorMeessage.isDisplayed());
		softAssert.assertAll();

	}

}
