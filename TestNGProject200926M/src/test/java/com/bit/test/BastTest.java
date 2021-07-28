package com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BastTest {
 
  @BeforeMethod(groups ="ui")
  public void beforeMethod() {
	  System.out.println("open blanck browser");
	  System.out.println("neveigat to url");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("take screanshot if test case failed");
	  System.out.println("close browser");
  }

  @BeforeClass(groups = "back")
  public void beforeClass() {
	  System.out.println("read property file");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close all configuration");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("generated log reaport");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close log");
  }

  @BeforeSuite(enabled = false)
  public void beforeSuite() {
	
	  System.out.println("generated html report");
  }
  
  @AfterSuite
  public void afterSuit() {
	  System.out.println("stored report in repo");
	  System.out.println("close report instance");
  }

}
