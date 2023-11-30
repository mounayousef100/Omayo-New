package com.omayo.rightpageobject;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class SelectMultipleOptionsPage extends BasePage {

	@FindBy(name = "accessories")
	private List<WebElement> multipleOptions;

	public void selectMultipleOptions() throws InterruptedException {
		Thread.sleep(3000);
		for (WebElement ele : multipleOptions) {
			if (ele.isSelected() == false) {
				action.click( ele);
				Thread.sleep(2000);
			}
		}
		Thread.sleep(2000);
		
	}
}
