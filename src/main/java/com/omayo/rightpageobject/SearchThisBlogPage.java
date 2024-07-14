package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayo.base.BasePage;

public class SearchThisBlogPage  extends BasePage{

	@FindBy(name = "q")
	private WebElement searchField ;

	@FindBy(css = "input[value= 'Search']")
	private WebElement searchButton ;
	
	@FindBy(className = "status-msg-body")
	private WebElement result ;
	
	public void searchQA() {
		action.sendText(searchField, "QA");
		action.click(searchButton);
		String expMessage = "No posts matching the query: QA. Show all posts";
		softAssert.assertEquals(action.getText(result), expMessage);
		softAssert.assertAll();
		
		
		
	}
}
