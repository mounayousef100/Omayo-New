package com.omayo.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import com.omayo.base.BasePage;

public class PopupWindowPage extends BasePage {
	SoftAssert mysoft = new SoftAssert();

	@FindBy( xpath = "//div[@id='HTML37']/div[1]/p/a")
	private  WebElement popupWindow;
	
	@FindBy( id = "para1")
	private  WebElement paragraph1;
	
	@FindBy( id = "para2")
	private  WebElement paragraph2;

	public void popupWindow() throws InterruptedException {
		Thread.sleep(3000);
		action.click(popupWindow);
		Thread.sleep(4000);
		action.switchToNewWindow(driver);
		Thread.sleep(3000);
		String title =action.getTitle(driver);
		System.out.println(title);
		/*String actTextParagraph1 = action.getText(paragraph1);
		String expTextParagraph1 = "A paragraph of text";
		System.out.println(actTextParagraph1);
		mysoft.assertEquals(actTextParagraph1, expTextParagraph1);
		String actTextParagraph2 = action.getText(paragraph2);
		String expTextParagraph2 = "Another paragraph of text";
		System.out.println(actTextParagraph2);
		mysoft.assertEquals(actTextParagraph2,expTextParagraph2);
		mysoft.assertAll();
		Thread.sleep(4000);*/
}
}
