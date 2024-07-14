package com.omayo.rightpageobject;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class LocateUsingClassPage extends BasePage{
	@FindBy(className = "classone")
	private List <WebElement> textBoxs ;
	
	public void locateUsingClass() {
		
		for(WebElement textBox: textBoxs) {
			action.sendText(textBox, "QA or Qc");
		}
			
		
			
	}
	
}
