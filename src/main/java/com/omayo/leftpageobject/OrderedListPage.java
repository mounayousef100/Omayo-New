package com.omayo.leftpageobject;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class OrderedListPage extends BasePage {

	@FindBy(xpath = "//div[@class='widget-content']/ol/li")
	private List<WebElement> orderedList ;

	public void orderedList() throws InterruptedException {
		Thread.sleep(3000);
		for(WebElement order:orderedList) {
			String text = action.getText(order);
			System.out.println(text);
		}
		
		Thread.sleep(4000);
}
}
