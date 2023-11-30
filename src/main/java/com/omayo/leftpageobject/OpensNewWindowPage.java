package com.omayo.leftpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import com.omayo.base.BasePage;

public class OpensNewWindowPage extends BasePage{
    SoftAssert mySoft = new SoftAssert();
	@FindBy(id = "link2")
	private WebElement seleniumTutorialLink;

	public void opensNewWindow() throws InterruptedException {
		Thread.sleep(3000);
		action.click(seleniumTutorialLink);
		Thread.sleep(4000);
		String actTitle = action.getTitle(driver);
		String expeTitle = "Selenium143";
		System.out.println(actTitle);
		mySoft.assertEquals(actTitle,expeTitle, "Title should be Selenium143");
		mySoft.assertAll();
		Thread.sleep(4000);

	}
}
