package com.bit.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DB.Base;
import DB.BaseListner;
@Listeners(BaseListner.class)
public class ScreenShortTest extends Base {

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void takeScreenShortTest() {
		
	Assert.assertEquals(false, true);	
		
		
	}
	
	@Test
	public void takeScreenShortTest1() {
		
	Assert.assertEquals(false, true);	
		
		
	}
	
	@Test
	public void takeScreenShortTest2() {
		
	Assert.assertEquals(false, true);	
		
		
	}
	
	
	
	
	
	
}
