package com.bit.test;

import org.testng.annotations.Test;

public class RegressionTest extends BastTest {

	@Test(groups = "ui")
	public void BuyShirt() {
		System.out.println("test2");
	}
	@Test(groups = "back")
	public void BuyPants() {
		System.out.println("test3");
		
	}
}
