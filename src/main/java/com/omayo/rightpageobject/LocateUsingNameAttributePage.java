package com.omayo.rightpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class LocateUsingNameAttributePage extends BasePage {

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
