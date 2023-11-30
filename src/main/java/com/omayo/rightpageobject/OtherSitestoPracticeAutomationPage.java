package com.omayo.rightpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class OtherSitestoPracticeAutomationPage extends BasePage {

	@FindBy(xpath = "//div[@class='widget-content']/ul/li/a")
	private  List<WebElement> clickOtherSites;

	public void hiddenButton() throws InterruptedException {
		for (WebElement element : clickOtherSites) {
             element.click();
             Thread.sleep(2000);
             driver.navigate().back();
             Thread.sleep(2000);
             
        }
		Thread.sleep(3000);

	}
}
