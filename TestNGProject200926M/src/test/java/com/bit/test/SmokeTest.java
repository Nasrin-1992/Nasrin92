package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SmokeTest extends BastTest {
	WebDriver dr;
	@Parameters({"browser", "url"})
		@Test(groups = "ui")
		public void test1(String b ,String u) {
			System.out.println("test1");
			System.out.println(b);
			System.out.println(u);
		}
		

	@Test(groups = "ui")
	public void test21() {
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		System.out.println("continue");
		
		Reporter.log("sdfg");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamima Nasrin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    dr=new ChromeDriver();
	    dr.get("http://www.facebook.com");
	    s.assertAll();
	
	}


	@Test(groups = "ui")
	public void test11() {	
		System.out.println("test11");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamima Nasrin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
	    dr.get("http://www.google.com");
	
	
	}
   



}
