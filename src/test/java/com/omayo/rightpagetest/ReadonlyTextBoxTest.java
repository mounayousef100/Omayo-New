package com.omayo.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.ReadOnlyTextBoxPage;

public class ReadOnlyTextBoxTest extends BaseTest{
	
	private ReadOnlyTextBoxPage readOnlyTextBoxPage ;
	
	@Test()
	public void readOnlyTextBoxTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		readOnlyTextBoxPage = new ReadOnlyTextBoxPage();
		readOnlyTextBoxPage.readOnlyTextBoxPage();
		
		
	}
	

}
