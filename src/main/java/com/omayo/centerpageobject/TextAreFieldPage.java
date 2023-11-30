package com.omayo.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class TextAreFieldPage  extends BasePage{

	Action action = new Action();

	@FindBy(id = "ta1")
	private WebElement textAreField;


	public TextAreFieldPage() {
	
		PageFactory.initElements(driver, this);
	}

	public void textAreField() throws InterruptedException {
		Thread.sleep(3000);
	    action.sendText(textAreField,"I love quality assurance automation");
		Thread.sleep(3000);

	}
}
