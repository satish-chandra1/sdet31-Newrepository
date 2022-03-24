package com.crm.mavendemo_test;

import org.testng.annotations.Test;

public class Sample2_Test {

	@Test(groups="Smoketest")
	public void sample2() {
		System.out.println("sample 2 is ececuted");
	}
	@Test(groups="Smoketest")
	public void product() {
		System.out.println("product is created");
	}
	@Test(groups="Regrassiontest")
	public void software() {
		System.out.println("software is created");
	}
	@Test(groups="Regrassiontest")
	public void tester() {
		System.out.println("tester is created");
	}
}
