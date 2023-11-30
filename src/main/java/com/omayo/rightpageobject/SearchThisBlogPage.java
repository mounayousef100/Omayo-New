package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class SearchThisBlogPage extends BasePage {

	@FindBy(name = "q")
	private WebElement searchField;

	@FindBy(xpath = "//td[@class='gsc-search-button']/input")
	private WebElement searchButton;

	@FindBy(className = "status-msg-body")
	private WebElement messageText;

	public void searchThisBlog() throws InterruptedException {
		Thread.sleep(3000);
		action.sendText(searchField, "qa");
		Thread.sleep(3000);
		action.click(searchButton);
		
		String actMessage =action.getText(messageText);
		String expectMessage = "No posts matching the query: qa. Show all posts" ;
		softAssert.assertEquals(actMessage, expectMessage);
		softAssert.assertAll();
		Thread.sleep(4000);

	}
}
