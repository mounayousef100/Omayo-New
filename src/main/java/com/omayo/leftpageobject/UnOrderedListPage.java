package com.omayo.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class UnOrderedListPage extends BasePage {
	SoftAssert mysoft = new SoftAssert();
	@FindBy(xpath = "//div[@class='widget HTML']/div/ul/li")
	private List< WebElement> unOrderedList;

	public void unOrderedList() throws InterruptedException {
		Thread.sleep(3000);
		for(WebElement UnOrder:unOrderedList) {
		System.out.println(action.getText(UnOrder));
		
		}
		Thread.sleep(4000);
}
}
