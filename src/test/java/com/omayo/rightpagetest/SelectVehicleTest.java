package com.omayo.rightpagetest;

import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.SelectVehiclePage;


public class SelectVehicleTest extends BaseTest {
	private SelectVehiclePage selectVehiclePage;

	@Test()
	public void selectVehicleTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		selectVehiclePage = new SelectVehiclePage();
		selectVehiclePage.selectVehicle();
		
	}
}
