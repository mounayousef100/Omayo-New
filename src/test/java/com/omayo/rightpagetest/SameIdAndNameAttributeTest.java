package com.omayo.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayo.base.BaseTest;
import com.omayo.rightpageobject.SameIdAndNameAttributePage;

public class SameIdAndNameAttributeTest extends BaseTest{
   private  SameIdAndNameAttributePage  sameIdAndNameAttributePage ;
   
   @Test()
   public void  sameIdAndNameAttributeTest() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   sameIdAndNameAttributePage = new SameIdAndNameAttributePage();
	   sameIdAndNameAttributePage.sameIdAndNameAttributePage();
	   
   }
}
