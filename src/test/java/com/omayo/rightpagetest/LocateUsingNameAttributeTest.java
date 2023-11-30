
package com.omayo.rightpagetest;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.dataprovider.ExcelDataProvider;
import com.omayo.rightpageobject.LocateUsingNameAttributePage;
import com.omayo.utility.ExcelUtils;

public class LocateUsingNameAttributeTest extends  BaseTest{
	private LocateUsingNameAttributePage locateUsingNameAttributePage;
	ExcelUtils excelUtils = new ExcelUtils();

	@BeforeClass
	public void setUp() throws IOException {
		excelUtils.addRandomDataToEmptyRows(2,0);
	}
	
	@Test(dataProvider = "LocateUsingNameAttributePage", dataProviderClass = ExcelDataProvider.class, groups = "smoke", priority = 1)
	public void nameAttributeTest(Object[] testData) throws InterruptedException {

		String textQA = (String) testData[0];
		locateUsingNameAttributePage = new LocateUsingNameAttributePage();
		locateUsingNameAttributePage.locateUsingNameAttribute(textQA);

	}

}