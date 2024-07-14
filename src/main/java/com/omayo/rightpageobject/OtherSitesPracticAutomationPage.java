package com.omayo.rightpageobject;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;
public class OtherSitesPracticAutomationPage extends BasePage {
	
	@FindBy(xpath = "//div[@id='LinkList1']//ul//li//a")
	private List <WebElement> links ;
	
	public void OtherSitesPage() throws InterruptedException {
		
		for(WebElement link : links) {
			action.click(link);
			Thread.sleep(3000);
			action.getCurrentURL(driver);
			driver.navigate().back();
			Thread.sleep(3000);
		   softAssert.assertEquals(action.getCurrentURL(driver), "http://omayo.blogspot.com/search?q=a");
		   softAssert.assertAll();
		
		

		
			
		}
		
	}

}
