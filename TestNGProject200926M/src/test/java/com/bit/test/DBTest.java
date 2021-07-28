package com.bit.test;

import org.testng.annotations.Test;

import DB.DataDriven;

public class DBTest {
	 

	@Test(dataProviderClass = DataDriven.class, dataProvider="login" )
	  public void fwer(String n, String s) {
		System.out.println(n+ "," +s);
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
