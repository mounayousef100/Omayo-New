package com.omayo.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class SelectVehiclePage extends BasePage{

	@FindBy( xpath = "//input[@value='Car']")
	private WebElement redioButtonCar;

	public void selectVehicle () throws InterruptedException {
		Thread.sleep(3000);
	    action.click(redioButtonCar);
		Thread.sleep(3000);

	}
}
