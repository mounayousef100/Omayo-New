package com.omayo.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class ButtonsWithSameNamePage extends BasePage {
	
	SoftAssert mysoft = new SoftAssert();
	@FindBy(xpath = "//div[@class='widget-content']//button[@name='samename']")
	private List< WebElement> ButtonsWithSameName;

	public void buttonsWithSameName() throws InterruptedException {
		Thread.sleep(3000);
		  
	        for (int i = 0; i < ButtonsWithSameName.size(); i++) {
	            action.click( ButtonsWithSameName.get(i));
	        }
	        
        Thread.sleep(4000);
    }

}