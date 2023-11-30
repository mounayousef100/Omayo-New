package com.omayo.centerpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.centerpageobject.TablePage;

public class TableTest extends BaseTest {
	private TablePage tablePage;

	@Test(groups = "smoke")
	public void tableTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		tablePage = new TablePage();
	//	tablePage.printColumnValues();
		//tablePage.printRowValues();
		//tablePage.randomValueINCol();
		tablePage.printColumnValues();
		tablePage.printRowValues();
		
	}
	
}
