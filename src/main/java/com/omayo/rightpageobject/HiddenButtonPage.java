package com.omayo.rightpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class HiddenButtonPage extends BasePage{

		@FindBy(id = "hbutton")
		private WebElement HiddenButton;

		public void hiddenButton() throws InterruptedException {
			Thread.sleep(3000);
			softAssert.assertFalse(action.findElement( HiddenButton));
			softAssert.assertAll();
			Thread.sleep(3000);

		}
}
