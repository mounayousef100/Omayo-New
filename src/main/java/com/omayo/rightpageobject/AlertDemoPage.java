package com.omayo.rightpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class AlertDemoPage extends BasePage{

	@FindBy(id = "alert1")
	private WebElement clickToGetAlert;

	
	public void clickToGetAlert() throws InterruptedException {
		Thread.sleep(3000);
		action.click(clickToGetAlert);
        action.AlertAccept(driver);
        Thread.sleep(3000);
}
}