package com.omayo.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class MultiSelectionBoxPage extends BasePage {

	@FindBy(id = "multiselect1")
	private WebElement selectionBox;

	
	public void multiSelectionBox() throws InterruptedException {
		Thread.sleep(3000);
		action.selectByValue(selectionBox, "swiftx");
		Thread.sleep(2000);
		action.selectByValue(selectionBox, "audix");
		

	}
}
