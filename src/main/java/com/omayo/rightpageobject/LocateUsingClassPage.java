package com.omayo.rightpageobject;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class LocateUsingClassPage extends BasePage {
	
	@FindBy(className = "classone")
	private List <WebElement> TextBox;

	public void locateUsingClass() throws InterruptedException {
		for( WebElement ele : TextBox) {
			action.sendText(ele, "qa");
		}
      
		Thread.sleep(4000);

	}
}
