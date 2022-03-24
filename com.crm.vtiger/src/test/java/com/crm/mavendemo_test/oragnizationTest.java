package com.crm.mavendemo_test;

import org.testng.annotations.Test;

public class oragnizationTest {

	@Test(groups="Smoketest")
	public void oragnization() {
		System.out.println("oragnization is created");
	}
	@Test(groups="Regrassiontest")
	public void leads() {
		System.out.println("leads is created");
	}
	@Test(groups="Smoketest")
	public void contacts() {
		System.out.println("contacts is created");
	}
	@Test(groups="Regrassiontest")
	public void purchase() {
		System.out.println("purchase is created");
	}
	
	@Test
	public void change() {
		System.out.println("change done ");
	}
	
}
