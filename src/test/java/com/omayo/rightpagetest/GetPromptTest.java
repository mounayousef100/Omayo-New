package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.GetPromptPage;

public class GetPromptTest extends BaseTest {
	private GetPromptPage ObjgetPromptPage ;
	
	@Test()
	public void getPromptTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ObjgetPromptPage = new GetPromptPage();
		ObjgetPromptPage.getPrompt();
		
	}
}
