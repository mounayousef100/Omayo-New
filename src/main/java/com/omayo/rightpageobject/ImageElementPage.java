package com.omayo.rightpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class ImageElementPage extends BasePage{

	@FindBy(xpath = "//div[@class='widget-content']/img")
	private WebElement image;

	public void displayedImage() throws InterruptedException {
		Thread.sleep(3000);
		softAssert.assertTrue(action.findElement(image));
		softAssert.assertAll();

	}
}
