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
    //how many expection we have---2 expection we have
	//Ans 1)Checked (all to them) 2) UnChecked
    //What is exception?
	//exception is a error its can handle a programmer also it is a  run Time exception
	//How to run only failed test Casses
	//befferent between heart assert and soft assert?
	//what is YAML file?
	//What is Factory?
	//Fectory is a kinds of data provider
	//Factories allow you to create tests dynamically. For example, imagine you want to create a test method that will access a
	//page on a Web site several times, and you want to invoke it with different values:
	//The @Test annotation can be put on a class instead of a test method:

	//why testNh is famous from JUnit?
	/*
	 * Ans:-TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionalities 
	 * that make it more powerful and easier to use, such as:

Annotations.
Run your tests in arbitrarily big thread pools with various policies available (all methods in their own thread, one thread per test class, etc...).
Test that your code is multithread safe.
Flexible test configuration.
Support for data-driven testing (with @DataProvider).
Support for parameters.
Powerful execution model (no more TestSuite).
Supported by a variety of tools and plug-ins (Eclipse, IDEA, Maven, etc...).
Embeds BeanShell for further flexibility.
Default JDK functions for runtime and logging (no dependencies).
Dependent methods for application server testing.
TestNG is designed to cover all categories of tests:  unit, functional, end-to-end, integration, etc...
	 */




}
